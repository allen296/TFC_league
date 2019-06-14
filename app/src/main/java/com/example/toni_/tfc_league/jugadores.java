package com.example.toni_.tfc_league;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import org.w3c.dom.Text;

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
    private Button aceptar;

/*    private TextView textFaker;
    private TextView textKhan;
    private TextView textHaru;
    private TextView textTeddy;
    private TextView textEffort;

    private TextView textoBoton1g2;
    private TextView textoBoton2g2;
    private TextView textoBoton3g2;
    private TextView textoBoton4g2;
    private TextView textoBoton5g2;

    private TextView buttonorigen1;
    private TextView buttonorigen2;
    private TextView buttonorigen3;
    private TextView buttonorigen4;
    private TextView buttonorigen5;

    private TextView buttonfnatic1;
    private TextView buttonfnatic2;
    private TextView buttonfnatic3;
    private TextView buttonfnatic4;
    private TextView buttonfnatic5;

    private TextView buttongiants1;
    private TextView buttongiants2;
    private TextView buttongiants3;
    private TextView buttongiants4;
    private TextView buttongiants5;

    private TextView buttonmadlions1;
    private TextView buttonmadlions2;
    private TextView buttonmadlions3;
    private TextView buttonmadlions4;
    private TextView buttonmadlions5;

*/
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

        //BOTON ACEPTAR EQUIPO
        Button botonAceptar = view.findViewById(R.id.aceptarEquipo);

        botonAceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firebaseDatabaseEquipo.push().setValue(equipo);
            }
        });

        //BOTON 1 SKT
        final ImageButton buttonskt1 = view.findViewById(R.id.buttonskt1);
        System.out.println("hola");
        buttonskt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String newAppKey = firebaseDatabaseJugador.push().getKey();


                Jugador jugador = new Jugador(newAppKey);
                firebaseDatabaseJugador.child(newAppKey).setValue(jugador);
                equipo.add(jugador);

                buttonskt1.setVisibility(View.INVISIBLE);
            }
        });

        //BOTON 2 SKT
        final ImageButton buttonskt2 = view.findViewById(R.id.buttonskt2);
        System.out.println("hola");
        buttonskt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String newAppKey = firebaseDatabaseJugador.push().getKey();


                Jugador jugador = new Jugador(newAppKey);
                firebaseDatabaseJugador.child(newAppKey).setValue(jugador);
                equipo.add(jugador);

                buttonskt2.setVisibility(View.INVISIBLE);
            }
        });

        //BOTON 3 SKT
        final ImageButton buttonskt3 = view.findViewById(R.id.buttonskt3);
        System.out.println("hola");
        buttonskt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String newAppKey = firebaseDatabaseJugador.push().getKey();


                Jugador jugador = new Jugador(newAppKey);
                firebaseDatabaseJugador.child(newAppKey).setValue(jugador);
                equipo.add(jugador);

                buttonskt3.setVisibility(View.INVISIBLE);
            }
        });

        //BOTON 4 SKT
        final ImageButton buttonskt4 = view.findViewById(R.id.buttonskt4);
        System.out.println("hola");
        buttonskt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String newAppKey = firebaseDatabaseJugador.push().getKey();


                Jugador jugador = new Jugador(newAppKey);
                firebaseDatabaseJugador.child(newAppKey).setValue(jugador);
                equipo.add(jugador);

                buttonskt4.setVisibility(View.INVISIBLE);
            }
        });

        //BOTON 5 SKT
        final ImageButton buttonskt5 = view.findViewById(R.id.buttonskt5);
        System.out.println("hola");
        buttonskt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String newAppKey = firebaseDatabaseJugador.push().getKey();


                Jugador jugador = new Jugador(newAppKey);
                firebaseDatabaseJugador.child(newAppKey).setValue(jugador);
                equipo.add(jugador);

                buttonskt5.setVisibility(View.INVISIBLE);
            }
        });


        //BOTON 1 G2
        final ImageButton buttong21 = view.findViewById(R.id.buttong21);
        System.out.println("hola");
        buttong21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String newAppKey = firebaseDatabaseJugador.push().getKey();


                Jugador jugador = new Jugador(newAppKey);
                firebaseDatabaseJugador.child(newAppKey).setValue(jugador);
                equipo.add(jugador);

                buttong21.setVisibility(View.INVISIBLE);
            }
        });

        //BOTON 2 G2
        final ImageButton buttong22 = view.findViewById(R.id.buttong22);
        System.out.println("hola");
        buttong22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String newAppKey = firebaseDatabaseJugador.push().getKey();


                Jugador jugador = new Jugador(newAppKey);
                firebaseDatabaseJugador.child(newAppKey).setValue(jugador);
                equipo.add(jugador);

                buttong22.setVisibility(View.INVISIBLE);
            }
        });

        //BOTON 3 G2
        final ImageButton buttong23 = view.findViewById(R.id.buttong23);
        System.out.println("hola");
        buttong23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String newAppKey = firebaseDatabaseJugador.push().getKey();


                Jugador jugador = new Jugador(newAppKey);
                firebaseDatabaseJugador.child(newAppKey).setValue(jugador);
                equipo.add(jugador);

                buttong23.setVisibility(View.INVISIBLE);
            }
        });

        //BOTON 4 G2
        final ImageButton buttong24 = view.findViewById(R.id.buttong24);
        System.out.println("hola");
        buttong24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String newAppKey = firebaseDatabaseJugador.push().getKey();


                Jugador jugador = new Jugador(newAppKey);
                firebaseDatabaseJugador.child(newAppKey).setValue(jugador);
                equipo.add(jugador);

                buttong24.setVisibility(View.INVISIBLE);
            }
        });

        //BOTON 5 G2
        final ImageButton buttong25 = view.findViewById(R.id.buttong25);
        System.out.println("hola");
        buttong25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String newAppKey = firebaseDatabaseJugador.push().getKey();


                Jugador jugador = new Jugador(newAppKey);
                firebaseDatabaseJugador.child(newAppKey).setValue(jugador);
                equipo.add(jugador);

                buttong25.setVisibility(View.INVISIBLE);
            }
        });


        //BOTON 1 ORIGEN
        final ImageButton buttonorigen1 = view.findViewById(R.id.buttonorigen1);
        System.out.println("hola");
        buttonorigen1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String newAppKey = firebaseDatabaseJugador.push().getKey();


                Jugador jugador = new Jugador(newAppKey);
                firebaseDatabaseJugador.child(newAppKey).setValue(jugador);
                equipo.add(jugador);

                buttonorigen1.setVisibility(View.INVISIBLE);
            }
        });

        //BOTON 2 ORIGEN
        final ImageButton buttonorigen2 = view.findViewById(R.id.buttonorigen2);
        System.out.println("hola");
        buttonorigen2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String newAppKey = firebaseDatabaseJugador.push().getKey();


                Jugador jugador = new Jugador(newAppKey);
                firebaseDatabaseJugador.child(newAppKey).setValue(jugador);
                equipo.add(jugador);

                buttonorigen2.setVisibility(View.INVISIBLE);
            }
        });

        //BOTON 3 ORIGEN
        final ImageButton buttonorigen3 = view.findViewById(R.id.buttonorigen3);
        System.out.println("hola");
        buttonorigen3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String newAppKey = firebaseDatabaseJugador.push().getKey();


                Jugador jugador = new Jugador(newAppKey);
                firebaseDatabaseJugador.child(newAppKey).setValue(jugador);
                equipo.add(jugador);

                buttonorigen3.setVisibility(View.INVISIBLE);
            }
        });

        //BOTON 4 ORIGEN
        final ImageButton buttonorigen4 = view.findViewById(R.id.buttonorigen4);
        System.out.println("hola");
        buttonorigen4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String newAppKey = firebaseDatabaseJugador.push().getKey();


                Jugador jugador = new Jugador(newAppKey);
                firebaseDatabaseJugador.child(newAppKey).setValue(jugador);
                equipo.add(jugador);

                buttonorigen4.setVisibility(View.INVISIBLE);
            }
        });

        //BOTON 5 ORIGEN
        final ImageButton buttonorigen5 = view.findViewById(R.id.buttonorigen5);
        System.out.println("hola");
        buttonorigen5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String newAppKey = firebaseDatabaseJugador.push().getKey();


                Jugador jugador = new Jugador(newAppKey);
                firebaseDatabaseJugador.child(newAppKey).setValue(jugador);
                equipo.add(jugador);

                buttonorigen5.setVisibility(View.INVISIBLE);
            }
        });


        //BOTON 1 FNATIC
        final ImageButton buttonfnatic1 = view.findViewById(R.id.buttonfnatic1);
        System.out.println("hola");
        buttonfnatic1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String newAppKey = firebaseDatabaseJugador.push().getKey();


                Jugador jugador = new Jugador(newAppKey);
                firebaseDatabaseJugador.child(newAppKey).setValue(jugador);
                equipo.add(jugador);

                buttonfnatic1.setVisibility(View.INVISIBLE);
            }
        });

        //BOTON 2 FNATIC
        final ImageButton buttonfnatic2 = view.findViewById(R.id.buttonfnatic2);
        System.out.println("hola");
        buttonfnatic2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String newAppKey = firebaseDatabaseJugador.push().getKey();


                Jugador jugador = new Jugador(newAppKey);
                firebaseDatabaseJugador.child(newAppKey).setValue(jugador);
                equipo.add(jugador);

                buttonfnatic2.setVisibility(View.INVISIBLE);
            }
        });

        //BOTON 3 FNATIC
        final ImageButton buttonfnatic3 = view.findViewById(R.id.buttonfnatic3);
        System.out.println("hola");
        buttonfnatic3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String newAppKey = firebaseDatabaseJugador.push().getKey();


                Jugador jugador = new Jugador(newAppKey);
                firebaseDatabaseJugador.child(newAppKey).setValue(jugador);
                equipo.add(jugador);

                buttonfnatic3.setVisibility(View.INVISIBLE);
            }
        });

        //BOTON 4 FNATIC
        final ImageButton buttonfnatic4 = view.findViewById(R.id.buttonfnatic4);
        System.out.println("hola");
        buttonfnatic4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String newAppKey = firebaseDatabaseJugador.push().getKey();


                Jugador jugador = new Jugador(newAppKey);
                firebaseDatabaseJugador.child(newAppKey).setValue(jugador);
                equipo.add(jugador);

                buttonfnatic4.setVisibility(View.INVISIBLE);
            }
        });

        //BOTON 5 FNATIC
        final ImageButton buttonfnatic5 = view.findViewById(R.id.buttonfnatic5);
        System.out.println("hola");
        buttonfnatic5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String newAppKey = firebaseDatabaseJugador.push().getKey();


                Jugador jugador = new Jugador(newAppKey);
                firebaseDatabaseJugador.child(newAppKey).setValue(jugador);
                equipo.add(jugador);

                buttonfnatic5.setVisibility(View.INVISIBLE);
            }
        });


        //BOTON 1 GIANTS
        final ImageButton buttongiants1 = view.findViewById(R.id.buttongiants1);
        System.out.println("hola");
        buttongiants1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String newAppKey = firebaseDatabaseJugador.push().getKey();


                Jugador jugador = new Jugador(newAppKey);
                firebaseDatabaseJugador.child(newAppKey).setValue(jugador);
                equipo.add(jugador);

                buttongiants1.setVisibility(View.INVISIBLE);
            }
        });

        //BOTON 2 GIANTS
        final ImageButton buttongiants2 = view.findViewById(R.id.buttongiants2);
        System.out.println("hola");
        buttongiants2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String newAppKey = firebaseDatabaseJugador.push().getKey();


                Jugador jugador = new Jugador(newAppKey);
                firebaseDatabaseJugador.child(newAppKey).setValue(jugador);
                equipo.add(jugador);

                buttongiants2.setVisibility(View.INVISIBLE);
            }
        });

        //BOTON 3 GIANTS
        final ImageButton buttongiants3 = view.findViewById(R.id.buttongiants3);
        System.out.println("hola");
        buttongiants3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String newAppKey = firebaseDatabaseJugador.push().getKey();


                Jugador jugador = new Jugador(newAppKey);
                firebaseDatabaseJugador.child(newAppKey).setValue(jugador);
                equipo.add(jugador);

                buttongiants3.setVisibility(View.INVISIBLE);
            }
        });

        //BOTON 4 GIANTS
        final ImageButton buttongiants4 = view.findViewById(R.id.buttongiants4);
        System.out.println("hola");
        buttongiants4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String newAppKey = firebaseDatabaseJugador.push().getKey();


                Jugador jugador = new Jugador(newAppKey);
                firebaseDatabaseJugador.child(newAppKey).setValue(jugador);
                equipo.add(jugador);

                buttongiants4.setVisibility(View.INVISIBLE);
            }
        });

        //BOTON 5 GIANTS
        final ImageButton buttongiants5 = view.findViewById(R.id.buttongiants5);
        System.out.println("hola");
        buttongiants5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String newAppKey = firebaseDatabaseJugador.push().getKey();


                Jugador jugador = new Jugador(newAppKey);
                firebaseDatabaseJugador.child(newAppKey).setValue(jugador);
                equipo.add(jugador);

                buttongiants5.setVisibility(View.INVISIBLE);
            }
        });


        //BOTON 1 MAD LIONS
        final ImageButton buttonmadlions1 = view.findViewById(R.id.buttonmadlions1);
        System.out.println("hola");
        buttonmadlions1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String newAppKey = firebaseDatabaseJugador.push().getKey();


                Jugador jugador = new Jugador(newAppKey);
                firebaseDatabaseJugador.child(newAppKey).setValue(jugador);
                equipo.add(jugador);

                buttonmadlions1.setVisibility(View.INVISIBLE);
            }
        });

        //BOTON 2 MAD LIONS
        final ImageButton buttonmadlions2 = view.findViewById(R.id.buttonmadlions2);
        System.out.println("hola");
        buttonmadlions2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String newAppKey = firebaseDatabaseJugador.push().getKey();


                Jugador jugador = new Jugador(newAppKey);
                firebaseDatabaseJugador.child(newAppKey).setValue(jugador);
                equipo.add(jugador);

                buttonmadlions2.setVisibility(View.INVISIBLE);
            }
        });

        //BOTON 3 MAD LIONS
        final ImageButton buttonmadlions3 = view.findViewById(R.id.buttonmadlions3);
        System.out.println("hola");
        buttonmadlions3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String newAppKey = firebaseDatabaseJugador.push().getKey();


                Jugador jugador = new Jugador(newAppKey);
                firebaseDatabaseJugador.child(newAppKey).setValue(jugador);
                equipo.add(jugador);

                buttonmadlions3.setVisibility(View.INVISIBLE);
            }
        });

        //BOTON 4 MAD LIONS
        final ImageButton buttonmadlions4 = view.findViewById(R.id.buttonmadlions4);
        System.out.println("hola");
        buttonmadlions4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String newAppKey = firebaseDatabaseJugador.push().getKey();


                Jugador jugador = new Jugador(newAppKey);
                firebaseDatabaseJugador.child(newAppKey).setValue(jugador);
                equipo.add(jugador);

                buttonmadlions4.setVisibility(View.INVISIBLE);
            }
        });

        //BOTON 5 MAD LIONS
        final ImageButton buttonmadlions5 = view.findViewById(R.id.buttonmadlions5);
        System.out.println("hola");
        buttonmadlions5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String newAppKey = firebaseDatabaseJugador.push().getKey();


                Jugador jugador = new Jugador(newAppKey);
                firebaseDatabaseJugador.child(newAppKey).setValue(jugador);
                equipo.add(jugador);

                buttonmadlions5.setVisibility(View.INVISIBLE);
            }
        });


        if (equipo.size()==5) botonAceptar.setVisibility(View.VISIBLE);

        // Inflate the layout for this fragment

        //botonAceptar.setVisibility(View.INVISIBLE);
        return view;

    }

/*    private void leerJson(){
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
*/

}
