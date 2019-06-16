package com.example.toni_.tfc_league;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentManager;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.io.BufferedReader;
import java.util.ArrayList;

/**
 * @author ToNi_
 * Clase que permite el movimiento entre los distintos layouts de la aplicacion una vez iniciamos sesion con exito
 * y asigna funcionalidad a los botones
 */


public class Menu extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {


    public static final String user = "names";
    TextView textoUsuario;
    BufferedReader in;
    private Equipo equipoActual;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Relacionamos los elementos con en layout
        setContentView(R.layout.activity_menu);

        textoUsuario = (TextView) findViewById(R.id.textser);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        //Cogemos el usuario que viene del login y el dinero de la base de datos para añadirlos a la informacion de usuario
        Intent i = getIntent();
        Usuario usuario = (Usuario) i.getSerializableExtra("usuario");

        View headerView = navigationView.getHeaderView(0);
        TextView money = headerView.findViewById(R.id.textMoney);
        money.setText(usuario.getDineroTorneo() + "");

        TextView correo = headerView.findViewById(R.id.textser);
        correo.setText(usuario.getCorreo());

        //Crea el fragment para llamarlo como inicial en el content menu
        setTitle("Jugadores");
        Jugadores Jugadores = new Jugadores();
        FragmentManager fragmentmanager = getSupportFragmentManager();
        fragmentmanager.beginTransaction().replace(R.id.fragment, Jugadores).commit();

        //Llamadas que tendriamos que realizar a la API para conseguir los datos de los jugadores

        //https://euw1.api.riotgames.com/lol/summoner/v4/summoners/by-name/allen296?api_key=RGAPI-abdecd69-907b-47af-abba-1bdf10b7498f
        //https://euw1.api.riotgames.com/lol/league/v4/entries/by-summoner/1LrrHR7HD5Tfv1Mme7CQrOwuuFvR43N1gHFC0WSgDK5W3vc?api_key=RGAPI-abdecd69-907b-47af-abba-1bdf10b7498f

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(android.view.Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {

        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        //Lanza los fragments seleccionados en el content menu
        if (id == R.id.nav_jugadores) {
            setTitle("Jugadores");
            Jugadores Jugadores = new Jugadores();
            FragmentManager fragmentmanager = getSupportFragmentManager();
            fragmentmanager.beginTransaction().replace(R.id.fragment, Jugadores).commit();
        } else if (id == R.id.nav_torneo1) {
            setTitle("Torneo");
            Torneo Torneo = new Torneo();
            FragmentManager fragmentmanager = getSupportFragmentManager();
            fragmentmanager.beginTransaction().replace(R.id.fragment, Torneo).commit();

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    //Recupera el equipo del usuario logeado

    private void recuperarEquipo() {
        DatabaseReference equipo = FirebaseDatabase.getInstance().getReference("Equipos");
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance();

        equipoActual = null;

        String idUser = firebaseAuth.getCurrentUser().getUid();

        equipo.child(idUser).addValueEventListener(new ValueEventListener() {


            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if (dataSnapshot.exists()) {
                    equipoActual = dataSnapshot.getValue(Equipo.class);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

    }

    public void cerrarSesion(MenuItem item) {

        FirebaseAuth.getInstance().signOut();
        Intent intent = new Intent(Menu.this,Main.class);
        startActivity(intent);
    }
}

