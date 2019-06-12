package com.example.toni_.tfc_league;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
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

import java.io.BufferedReader;

public class Menu extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    public static final String user="names";
    TextView textoUsuario;
    BufferedReader in;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        textoUsuario=(TextView) findViewById(R.id.textser);

        //String user= getIntent().getStringExtra("names");
        //textoUsuario.setText(user);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);


    /*    URL lol = null;
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
        Toast.makeText(menu.this,lolApiJson, Toast.LENGTH_LONG).show();
        */

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
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_jugadores) {
            setTitle("Jugadores");
            Jugadores Jugadores = new Jugadores();
            FragmentManager fragmentmanager=getSupportFragmentManager();
            fragmentmanager.beginTransaction().replace(R.id.fragment, Jugadores).commit();
        } else if (id == R.id.nav_torneo1) {
            setTitle("Torneo");
            Torneo Torneo = new Torneo();
            FragmentManager fragmentmanager=getSupportFragmentManager();
            fragmentmanager.beginTransaction().replace(R.id.fragment, Torneo).commit();
        } else if (id == R.id.nav_ajustes) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
