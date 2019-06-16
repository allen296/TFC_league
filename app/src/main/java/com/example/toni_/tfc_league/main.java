package com.example.toni_.tfc_league;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;


/**
 * @author ToNi_
 * Clase principal que se lanza al inicio de la aplicacion. Esta, añade una animacion a los elementos del layout y te permite
 * acceder a los layouts de inicio de sesion y registro
 */

public class Main extends AppCompatActivity {
    //Creacion de variables
    LinearLayout l1,l2;
    Button buttonRegistrarseClass;
    Animation uptodown, downtoup;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonRegistrarseClass = (Button) findViewById(R.id.buttonRegistrarse); //Referenciamos el boton del activity con el del layout

        l1 = (LinearLayout) findViewById(R.id.l1); //Referenciamos l1 y l2 de la actividad con los del layout
        l2 = (LinearLayout) findViewById(R.id.l2);

        uptodown = AnimationUtils.loadAnimation(this, R.anim.uptodown); //Asignamos a uptodown y downtoup a la animacion creada
        downtoup = AnimationUtils.loadAnimation(this, R.anim.downtoup);

        l1.setAnimation(uptodown); //le damos al linear 1 y 2 la animacion uptodown y downtoup respectivamente
        l2.setAnimation(downtoup);



    }

    //onClicks para acceder a Registro y Login
    public void clickRegistrarse(View view) {

        Intent intent = new Intent(Main.this,Registro.class);
        startActivity(intent);
    }

    public void clickLogin(View view) {

        Intent intent = new Intent (Main.this,Login.class);
        startActivity(intent);
    }
}