package com.example.toni_.tfc_league;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

import javax.net.ssl.HttpsURLConnection;


/**
 * A simple {@link Fragment} subclass.
 */
public class Jugadores extends Fragment {

    private DatabaseReference firebaseDatabaseJugador;
    private DatabaseReference firebaseDatabaseEquipo;


    public Jugadores() {
        // Required empty public constructor
        firebaseDatabaseJugador = FirebaseDatabase.getInstance().getReference("Jugadores");
        firebaseDatabaseEquipo = FirebaseDatabase.getInstance().getReference("Equipos");


    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_jugadores, container, false);

        final ArrayList<Jugador> equipo = new ArrayList<>();

        ImageButton buttonskt4 = view.findViewById(R.id.buttonskt4);
        buttonskt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String newAppKey = firebaseDatabaseJugador.push().getKey();


                Jugador jugador = new Jugador(newAppKey);
                firebaseDatabaseJugador.child(newAppKey).setValue(jugador);
                equipo.add(jugador);

            }
        });

        ImageButton buttonmadlions5 = view.findViewById(R.id.buttonmadlions5);
        buttonmadlions5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firebaseDatabaseEquipo.push().setValue(equipo);
            }
        });


        // Inflate the layout for this fragment
        return view;
    }

    private void leerJson(){
        URL url = null;
        HttpsURLConnection connection = null;


            conectarUrl();
            //GetHTTPData("https://graph.facebook.com/19292868552");

    }

    public static void conectarUrl() {
            //URL url = new URL("http://mparamos.com/examenpsp?dni=" + dni + "&password=" + password);

        URL url = null;
        try {
            url = new URL("https://euw1.api.riotgames.com/lol/league/v4/entries/by-summoner/-XV9zAgGTAMhOC_s96jIyYEIHk1FQmuOeZiOk13P1khl7S4?api_key=RGAPI-b4986718-511d-40dc-ab52-36646ce2cb6a");
            //COnstruir el objeto URL y obtener un inputStream, guardar el objeto Json en String
            //{"name":"Jorge","secret":"HarareGreyhoundTitanium"}
            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
            String json = in.readLine();
            System.out.print(json);
            Log.e("json", json);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }




    
}
