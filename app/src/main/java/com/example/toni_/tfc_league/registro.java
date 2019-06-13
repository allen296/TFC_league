package com.example.toni_.tfc_league;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthUserCollisionException;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Registro extends AppCompatActivity {

    private EditText textoCorreo;
    private EditText textoContrasena;
    private Button botonRegistrar;
    private FirebaseAuth firebaseAuth;
    private ProgressDialog progressDialog;
    private DatabaseReference firebaseDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        firebaseAuth = firebaseAuth.getInstance();

        textoCorreo = (EditText) findViewById(R.id.textoCorreo);
        textoContrasena = (EditText) findViewById(R.id.textoContrasena);
        botonRegistrar = (Button) findViewById(R.id.botonRegistrar);
        progressDialog = new ProgressDialog(this);

        firebaseDatabase = FirebaseDatabase.getInstance().getReference("Usuarios");
    }

    private void registrarUsuario() {

        final String correo = textoCorreo.getText().toString();
        String contrasena = textoContrasena.getText().toString();

        if (TextUtils.isEmpty(correo)) {
            Toast.makeText(this, "Ingresa un email válido", Toast.LENGTH_LONG).show();
            return;
        }

        if (TextUtils.isEmpty(contrasena)) {
            Toast.makeText(this, "Ingresa una contraseña válida", Toast.LENGTH_LONG).show();
            return;
        }

        if (contrasena.length()<6){
            Toast.makeText(this, "Ingresa una contraseña de 6 o mas caracteres", Toast.LENGTH_LONG).show();
            return;
        }

        progressDialog.setMessage("Realizando el registro...");
        progressDialog.show();

        firebaseAuth.createUserWithEmailAndPassword(correo, contrasena).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {

            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()) {
                    String idUser = firebaseAuth.getCurrentUser().getUid();
                    Usuario usuario = new Usuario(correo, 1000);
                    firebaseDatabase.child(idUser).setValue(usuario);
                    Toast.makeText(Registro.this,"Se ha registrado el usuario con el email: "+ textoCorreo.getText(),
                            Toast.LENGTH_LONG).show();

                } else {

                    if (task.getException() instanceof FirebaseAuthUserCollisionException){ //Se el usuario esta creado lanza exception
                        Toast.makeText(Registro.this,"El usuario ya existe",
                                Toast.LENGTH_LONG).show();
                    }


                    Toast.makeText(Registro.this,"No se ha podido registrar el usuario",
                            Toast.LENGTH_LONG).show();
                }

                progressDialog.dismiss();
            }
        });

    }

    public void clickRegistrar(View view) {
        registrarUsuario();

        progressDialog.show();
        progressDialog.dismiss();

    }
}