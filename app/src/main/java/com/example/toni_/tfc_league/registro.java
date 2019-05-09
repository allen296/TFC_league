package com.example.toni_.tfc_league;

import android.app.ProgressDialog;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
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

public class registro extends AppCompatActivity {

    private EditText textoCorreo;
    private EditText textoContrasena;
    private Button botonRegistrar;
    private FirebaseAuth firebaseAuth;
    private ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        firebaseAuth = firebaseAuth.getInstance();

        textoCorreo = (EditText) findViewById(R.id.textoCorreo);
        textoContrasena = (EditText) findViewById(R.id.textoContrasena);
        botonRegistrar = (Button) findViewById(R.id.botonRegistrar);
        progressDialog = new ProgressDialog(this);
    }

    private void registrarUsuario() {

        String correo = textoCorreo.getText().toString().trim();
        String contrasena = textoContrasena.getText().toString().trim();

        if (TextUtils.isEmpty(correo)) {
            Toast.makeText(this, "Ingresa un email válido", Toast.LENGTH_LONG).show();
            return;
        }

        if (TextUtils.isEmpty(contrasena)) {
            Toast.makeText(this, "Ingresa una contraseña válida", Toast.LENGTH_LONG).show();
            return;
        }

        progressDialog.setMessage("Realizando el registro...");
        progressDialog.show();

        firebaseAuth.createUserWithEmailAndPassword(correo, contrasena).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {

            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()) {
                    FirebaseUser user = firebaseAuth.getCurrentUser();
                    Toast.makeText(registro.this,"Se ha registrado el usuario con el email: "+ textoCorreo.getText(),
                            Toast.LENGTH_LONG).show();
                } else {

                    if (task.getException() instanceof FirebaseAuthUserCollisionException){ //Se el usuario esta creado lanza exception
                        Toast.makeText(registro.this,"El usuario ya existe",
                                Toast.LENGTH_LONG).show();
                    }


                    Toast.makeText(registro.this,"No se ha podido registrar el usuario",
                            Toast.LENGTH_LONG).show();
                }

                progressDialog.dismiss();
            }
        });

    }

    public void clickRegistrar(View view) {
        registrarUsuario();
    }
}