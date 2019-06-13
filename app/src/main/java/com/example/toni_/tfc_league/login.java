package com.example.toni_.tfc_league;

        import android.app.ProgressDialog;
        import android.content.Intent;
        import android.os.CpuUsageInfo;
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
        import com.google.firebase.auth.FirebaseUser;
        import com.google.firebase.database.DataSnapshot;
        import com.google.firebase.database.DatabaseError;
        import com.google.firebase.database.DatabaseReference;
        import com.google.firebase.database.FirebaseDatabase;
        import com.google.firebase.database.ValueEventListener;

        import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;
        import java.net.MalformedURLException;
        import java.net.URL;

public class Login extends AppCompatActivity {

    private EditText textoCorreo;
    private EditText textoContrasena;
    private Button botonLogin;
    private FirebaseAuth firebaseAuth;
    private ProgressDialog progressDialog;
    private DatabaseReference firebaseDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        firebaseAuth = firebaseAuth.getInstance();

        textoCorreo = (EditText) findViewById(R.id.textoCorreo);
        textoContrasena = (EditText) findViewById(R.id.textoContrasena);
        botonLogin = (Button) findViewById(R.id.botonLogin);
        progressDialog = new ProgressDialog(this);
        firebaseDatabase = FirebaseDatabase.getInstance().getReference("Usuarios");


 /*       URL lol = null;
        try {
            lol = new URL("https://euw1.api.riotgames.com/lol/summoner/v4/summoners/by-name/allen296?api_key=RGAPI-abdecd69-907b-47af-abba-1bdf10b7498f");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        BufferedReader in = null;
        try {
            in = new BufferedReader(new InputStreamReader(lol.openStream()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        String lolApiJson = null;
        try {
            lolApiJson = in.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Toast.makeText(login.this,lolApiJson, Toast.LENGTH_LONG).show();
        */
    }

    private void loginUsuario(){
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

        progressDialog.setMessage("Iniciando sesión...");
        progressDialog.show();

        firebaseAuth.signInWithEmailAndPassword(correo, contrasena).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {

            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()) {
                    String idUser = firebaseAuth.getCurrentUser().getUid();
                    Toast.makeText(Login.this,"Bienvenido "+ textoCorreo.getText(),
                            Toast.LENGTH_LONG).show();
                    final Intent intent = new Intent (Login.this,Menu.class);
                    firebaseDatabase.child(idUser).addValueEventListener(new ValueEventListener() {
                        @Override
                        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                            Usuario usuario = dataSnapshot.getValue(Usuario.class);
                            intent.putExtra("usuario", usuario); // pasa el usuaurio a la pantalla de menu
                            // intent.putExtra(menu.user,correo);
                            startActivity(intent);
                        }

                        @Override
                        public void onCancelled(@NonNull DatabaseError databaseError) {

                        }
                    });

                } else {

                    Toast.makeText(Login.this,"No se ha podido iniciar sesión",
                            Toast.LENGTH_LONG).show();
                }

                progressDialog.dismiss();
            }
        });

    }

    public void clickLogin(View view) {
        loginUsuario();
    }
}