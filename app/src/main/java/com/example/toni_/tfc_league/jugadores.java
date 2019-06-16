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

import com.google.firebase.auth.FirebaseAuth;
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

    private ImageButton buttonskt1;
    private ImageButton buttonskt2;
    private ImageButton buttonskt3;
    private ImageButton buttonskt4;
    private ImageButton buttonskt5;

    private ImageButton buttong21;
    private ImageButton buttong22;
    private ImageButton buttong23;
    private ImageButton buttong24;
    private ImageButton buttong25;

    private ImageButton buttonorigen1;
    private ImageButton buttonorigen2;
    private ImageButton buttonorigen3;
    private ImageButton buttonorigen4;
    private ImageButton buttonorigen5;

    private ImageButton buttonfnatic1;
    private ImageButton buttonfnatic2;
    private ImageButton buttonfnatic3;
    private ImageButton buttonfnatic4;
    private ImageButton buttonfnatic5;

    private ImageButton buttongiants1;
    private ImageButton buttongiants2;
    private ImageButton buttongiants3;
    private ImageButton buttongiants4;
    private ImageButton buttongiants5;

    private ImageButton buttonmadlions1;
    private ImageButton buttonmadlions2;
    private ImageButton buttonmadlions3;
    private ImageButton buttonmadlions4;
    private ImageButton buttonmadlions5;



    public static final ArrayList<Jugador> equipo = new ArrayList<>();
    private String idUser;

    public Jugadores() {
        // Required empty public constructor
        firebaseDatabaseJugador = FirebaseDatabase.getInstance().getReference("Jugadores");
        firebaseDatabaseEquipo = FirebaseDatabase.getInstance().getReference("Equipos");
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_jugadores, container, false);

        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance();

        final String idUser = firebaseAuth.getCurrentUser().getUid();

        //BOTON ACEPTAR EQUIPO
        final Button botonAceptar = view.findViewById(R.id.aceptarEquipo);

        botonAceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Equipo e = new Equipo(equipo);
                firebaseDatabaseEquipo.child(idUser).setValue(e);
            }
        });

        //BOTON 1 SKT
        buttonskt1 = view.findViewById(R.id.buttonskt1);

        buttonskt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String newAppKey = firebaseDatabaseJugador.push().getKey();

                Jugador jugador = new Jugador(newAppKey, "Faker", "challenger", 600, 2000, 13);
                firebaseDatabaseJugador.child(newAppKey).setValue(jugador);
                equipo.add(jugador);

                buttonskt1.setVisibility(View.INVISIBLE);

                comprobarListado(equipo, botonAceptar);

            }
        });

        //BOTON 2 SKT
        buttonskt2 = view.findViewById(R.id.buttonskt2);

        buttonskt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String newAppKey = firebaseDatabaseJugador.push().getKey();


                Jugador jugador = new Jugador(newAppKey, "Khan", "challenger", 550, 1800, 15);
                firebaseDatabaseJugador.child(newAppKey).setValue(jugador);
                equipo.add(jugador);

                buttonskt2.setVisibility(View.INVISIBLE);

                comprobarListado(equipo, botonAceptar);
            }
        });

        //BOTON 3 SKT
        buttonskt3 = view.findViewById(R.id.buttonskt3);

        buttonskt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String newAppKey = firebaseDatabaseJugador.push().getKey();


                Jugador jugador = new Jugador(newAppKey, "Haru", "challenger", 570, 18100, 11);
                firebaseDatabaseJugador.child(newAppKey).setValue(jugador);
                equipo.add(jugador);

                buttonskt3.setVisibility(View.INVISIBLE);

                comprobarListado(equipo, botonAceptar);
            }
        });

        //BOTON 4 SKT
        buttonskt4 = view.findViewById(R.id.buttonskt4);

        buttonskt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String newAppKey = firebaseDatabaseJugador.push().getKey();


                Jugador jugador = new Jugador(newAppKey, "Teddy", "challenger", 530, 1750, 13);
                firebaseDatabaseJugador.child(newAppKey).setValue(jugador);
                equipo.add(jugador);

                buttonskt4.setVisibility(View.INVISIBLE);

                comprobarListado(equipo, botonAceptar);
            }
        });

        //BOTON 5 SKT
        buttonskt5 = view.findViewById(R.id.buttonskt5);

        buttonskt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String newAppKey = firebaseDatabaseJugador.push().getKey();


                Jugador jugador = new Jugador(newAppKey, "Effort", "challenger", 630, 1900, 10);
                firebaseDatabaseJugador.child(newAppKey).setValue(jugador);
                equipo.add(jugador);

                buttonskt5.setVisibility(View.INVISIBLE);

                comprobarListado(equipo, botonAceptar);
            }
        });


        //BOTON 1 G2
        buttong21 = view.findViewById(R.id.buttong21);

        buttong21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String newAppKey = firebaseDatabaseJugador.push().getKey();


                Jugador jugador = new Jugador(newAppKey, "Caps", "challenger", 600, 2000, 15);
                firebaseDatabaseJugador.child(newAppKey).setValue(jugador);
                equipo.add(jugador);

                buttong21.setVisibility(View.INVISIBLE);

                comprobarListado(equipo, botonAceptar);
            }
        });

        //BOTON 2 G2
        buttong22 = view.findViewById(R.id.buttong22);

        buttong22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String newAppKey = firebaseDatabaseJugador.push().getKey();


                Jugador jugador = new Jugador(newAppKey, "Wunder", "challenger", 585, 1800, 11);
                firebaseDatabaseJugador.child(newAppKey).setValue(jugador);
                equipo.add(jugador);

                buttong22.setVisibility(View.INVISIBLE);

                comprobarListado(equipo, botonAceptar);
            }
        });

        //BOTON 3 G2
        buttong23 = view.findViewById(R.id.buttong23);

        buttong23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String newAppKey = firebaseDatabaseJugador.push().getKey();


                Jugador jugador = new Jugador(newAppKey, "Jankos", "challenger", 540, 1700, 12);
                firebaseDatabaseJugador.child(newAppKey).setValue(jugador);
                equipo.add(jugador);

                buttong23.setVisibility(View.INVISIBLE);

                comprobarListado(equipo, botonAceptar);
            }
        });

        //BOTON 4 G2
        buttong24 = view.findViewById(R.id.buttong24);

        buttong24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String newAppKey = firebaseDatabaseJugador.push().getKey();


                Jugador jugador = new Jugador(newAppKey, "Perkz", "challenger", 570, 1850, 13);
                firebaseDatabaseJugador.child(newAppKey).setValue(jugador);
                equipo.add(jugador);

                buttong24.setVisibility(View.INVISIBLE);

                comprobarListado(equipo, botonAceptar);
            }
        });

        //BOTON 5 G2
        buttong25 = view.findViewById(R.id.buttong25);

        buttong25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String newAppKey = firebaseDatabaseJugador.push().getKey();


                Jugador jugador = new Jugador(newAppKey, "Mikyx", "challenger", 550, 1600, 9);
                firebaseDatabaseJugador.child(newAppKey).setValue(jugador);
                equipo.add(jugador);

                buttong25.setVisibility(View.INVISIBLE);

                comprobarListado(equipo, botonAceptar);
            }
        });


        //BOTON 1 ORIGEN
        buttonorigen1 = view.findViewById(R.id.buttonorigen1);

        buttonorigen1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String newAppKey = firebaseDatabaseJugador.push().getKey();


                Jugador jugador = new Jugador(newAppKey, "Nukeduck", "challenger", 550, 1650, 11);
                firebaseDatabaseJugador.child(newAppKey).setValue(jugador);
                equipo.add(jugador);

                buttonorigen1.setVisibility(View.INVISIBLE);

                comprobarListado(equipo, botonAceptar);
            }
        });

        //BOTON 2 ORIGEN
        buttonorigen2 = view.findViewById(R.id.buttonorigen2);

        buttonorigen2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String newAppKey = firebaseDatabaseJugador.push().getKey();


                Jugador jugador = new Jugador(newAppKey, "Mithy", "challenger", 570, 1800, 13);
                firebaseDatabaseJugador.child(newAppKey).setValue(jugador);
                equipo.add(jugador);

                buttonorigen2.setVisibility(View.INVISIBLE);

                comprobarListado(equipo, botonAceptar);
            }
        });

        //BOTON 3 ORIGEN
        buttonorigen3 = view.findViewById(R.id.buttonorigen3);

        buttonorigen3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String newAppKey = firebaseDatabaseJugador.push().getKey();


                Jugador jugador = new Jugador(newAppKey, "Alphari", "challenger", 650, 2100, 16);
                firebaseDatabaseJugador.child(newAppKey).setValue(jugador);
                equipo.add(jugador);

                buttonorigen3.setVisibility(View.INVISIBLE);

                comprobarListado(equipo, botonAceptar);
            }
        });

        //BOTON 4 ORIGEN
        buttonorigen4 = view.findViewById(R.id.buttonorigen4);

        buttonorigen4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String newAppKey = firebaseDatabaseJugador.push().getKey();


                Jugador jugador = new Jugador(newAppKey, "Kold", "challenger", 550, 1750, 8);
                firebaseDatabaseJugador.child(newAppKey).setValue(jugador);
                equipo.add(jugador);

                buttonorigen4.setVisibility(View.INVISIBLE);

                comprobarListado(equipo, botonAceptar);
            }
        });

        //BOTON 5 ORIGEN
        buttonorigen5 = view.findViewById(R.id.buttonorigen5);

        buttonorigen5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String newAppKey = firebaseDatabaseJugador.push().getKey();


                Jugador jugador = new Jugador(newAppKey, "Patrik", "challenger", 580, 1800, 13);
                firebaseDatabaseJugador.child(newAppKey).setValue(jugador);
                equipo.add(jugador);

                buttonorigen5.setVisibility(View.INVISIBLE);

                comprobarListado(equipo, botonAceptar);
            }
        });


        //BOTON 1 FNATIC
        buttonfnatic1 = view.findViewById(R.id.buttonfnatic1);

        buttonfnatic1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String newAppKey = firebaseDatabaseJugador.push().getKey();


                Jugador jugador = new Jugador(newAppKey, "Bwipo", "challenger", 620, 2200, 15);
                firebaseDatabaseJugador.child(newAppKey).setValue(jugador);
                equipo.add(jugador);

                buttonfnatic1.setVisibility(View.INVISIBLE);

                comprobarListado(equipo, botonAceptar);
            }
        });

        //BOTON 2 FNATIC
        buttonfnatic2 = view.findViewById(R.id.buttonfnatic2);

        buttonfnatic2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String newAppKey = firebaseDatabaseJugador.push().getKey();


                Jugador jugador = new Jugador(newAppKey, "Broxah", "challenger", 610, 2100, 13);
                firebaseDatabaseJugador.child(newAppKey).setValue(jugador);
                equipo.add(jugador);

                buttonfnatic2.setVisibility(View.INVISIBLE);

                comprobarListado(equipo, botonAceptar);
            }
        });

        //BOTON 3 FNATIC
        buttonfnatic3 = view.findViewById(R.id.buttonfnatic3);

        buttonfnatic3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String newAppKey = firebaseDatabaseJugador.push().getKey();


                Jugador jugador = new Jugador(newAppKey, "Nemesis", "challenger", 540, 1500, 8);
                firebaseDatabaseJugador.child(newAppKey).setValue(jugador);
                equipo.add(jugador);

                buttonfnatic3.setVisibility(View.INVISIBLE);

                comprobarListado(equipo, botonAceptar);
            }
        });

        //BOTON 4 FNATIC
        buttonfnatic4 = view.findViewById(R.id.buttonfnatic4);

        buttonfnatic4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String newAppKey = firebaseDatabaseJugador.push().getKey();


                Jugador jugador = new Jugador(newAppKey, "Rekkles", "challenger", 670, 2500, 15);
                firebaseDatabaseJugador.child(newAppKey).setValue(jugador);
                equipo.add(jugador);

                buttonfnatic4.setVisibility(View.INVISIBLE);

                comprobarListado(equipo, botonAceptar);
            }
        });

        //BOTON 5 FNATIC
        buttonfnatic5 = view.findViewById(R.id.buttonfnatic5);

        buttonfnatic5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String newAppKey = firebaseDatabaseJugador.push().getKey();


                Jugador jugador = new Jugador(newAppKey, "Hylissang", "challenger", 550, 1800, 10);
                firebaseDatabaseJugador.child(newAppKey).setValue(jugador);
                equipo.add(jugador);

                buttonfnatic5.setVisibility(View.INVISIBLE);

                comprobarListado(equipo, botonAceptar);
            }
        });


        //BOTON 1 GIANTS
        buttongiants1 = view.findViewById(R.id.buttongiants1);

        buttongiants1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String newAppKey = firebaseDatabaseJugador.push().getKey();


                Jugador jugador = new Jugador(newAppKey, "Th3Antonio", "challenger", 400, 1300, 11);
                firebaseDatabaseJugador.child(newAppKey).setValue(jugador);
                equipo.add(jugador);

                buttongiants1.setVisibility(View.INVISIBLE);

                comprobarListado(equipo, botonAceptar);
            }
        });

        //BOTON 2 GIANTS
        buttongiants2 = view.findViewById(R.id.buttongiants2);

        buttongiants2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String newAppKey = firebaseDatabaseJugador.push().getKey();


                Jugador jugador = new Jugador(newAppKey, "Razork", "challenger", 430, 1100, 11);
                firebaseDatabaseJugador.child(newAppKey).setValue(jugador);
                equipo.add(jugador);

                buttongiants2.setVisibility(View.INVISIBLE);

                comprobarListado(equipo, botonAceptar);
            }
        });

        //BOTON 3 GIANTS
        buttongiants3 = view.findViewById(R.id.buttongiants3);

        buttongiants3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String newAppKey = firebaseDatabaseJugador.push().getKey();


                Jugador jugador = new Jugador(newAppKey, "Milica", "challenger", 350, 1000, 9);
                firebaseDatabaseJugador.child(newAppKey).setValue(jugador);
                equipo.add(jugador);

                buttongiants3.setVisibility(View.INVISIBLE);

                comprobarListado(equipo, botonAceptar);
            }
        });

        //BOTON 4 GIANTS
        buttongiants4 = view.findViewById(R.id.buttongiants4);

        buttongiants4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String newAppKey = firebaseDatabaseJugador.push().getKey();


                Jugador jugador = new Jugador(newAppKey, "Deadly", "challenger", 460, 1300, 12);
                firebaseDatabaseJugador.child(newAppKey).setValue(jugador);
                equipo.add(jugador);

                buttongiants4.setVisibility(View.INVISIBLE);

                comprobarListado(equipo, botonAceptar);
            }
        });

        //BOTON 5 GIANTS
        buttongiants5 = view.findViewById(R.id.buttongiants5);

        buttongiants5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String newAppKey = firebaseDatabaseJugador.push().getKey();


                Jugador jugador = new Jugador(newAppKey, "Denky", "challenger", 450, 1250, 13);
                firebaseDatabaseJugador.child(newAppKey).setValue(jugador);
                equipo.add(jugador);

                buttongiants5.setVisibility(View.INVISIBLE);

                comprobarListado(equipo, botonAceptar);
            }
        });


        //BOTON 1 MAD LIONS
        buttonmadlions1 = view.findViewById(R.id.buttonmadlions1);

        buttonmadlions1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String newAppKey = firebaseDatabaseJugador.push().getKey();


                Jugador jugador = new Jugador(newAppKey, "Yoppa", "challenger", 450, 1300, 11);
                firebaseDatabaseJugador.child(newAppKey).setValue(jugador);
                equipo.add(jugador);

                buttonmadlions1.setVisibility(View.INVISIBLE);

                comprobarListado(equipo, botonAceptar);
            }
        });

        //BOTON 2 MAD LIONS
        buttonmadlions2 = view.findViewById(R.id.buttonmadlions2);

        buttonmadlions2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String newAppKey = firebaseDatabaseJugador.push().getKey();


                Jugador jugador = new Jugador(newAppKey, "Sharp", "challenger", 400, 1200, 11);
                firebaseDatabaseJugador.child(newAppKey).setValue(jugador);
                equipo.add(jugador);

                buttonmadlions2.setVisibility(View.INVISIBLE);

                comprobarListado(equipo, botonAceptar);
            }
        });

        //BOTON 3 MAD LIONS
        buttonmadlions3 = view.findViewById(R.id.buttonmadlions3);

        buttonmadlions3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String newAppKey = firebaseDatabaseJugador.push().getKey();


                Jugador jugador = new Jugador(newAppKey, "Czekolad", "challenger", 400, 1210, 12);
                firebaseDatabaseJugador.child(newAppKey).setValue(jugador);
                equipo.add(jugador);

                buttonmadlions3.setVisibility(View.INVISIBLE);

                comprobarListado(equipo, botonAceptar);
            }
        });

        //BOTON 4 MAD LIONS
        buttonmadlions4 = view.findViewById(R.id.buttonmadlions4);

        buttonmadlions4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String newAppKey = firebaseDatabaseJugador.push().getKey();


                Jugador jugador = new Jugador(newAppKey, "Samux", "challenger", 460, 1400, 13);
                firebaseDatabaseJugador.child(newAppKey).setValue(jugador);
                equipo.add(jugador);

                buttonmadlions4.setVisibility(View.INVISIBLE);

                comprobarListado(equipo, botonAceptar);
            }
        });

        //BOTON 5 MAD LIONS
        buttonmadlions5 = view.findViewById(R.id.buttonmadlions5);

        buttonmadlions5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String newAppKey = firebaseDatabaseJugador.push().getKey();


                Jugador jugador = new Jugador(newAppKey, "Falco", "challenger", 400, 1300, 11);
                firebaseDatabaseJugador.child(newAppKey).setValue(jugador);
                equipo.add(jugador);

                buttonmadlions5.setVisibility(View.INVISIBLE);
                comprobarListado(equipo, botonAceptar);
            }
        });

        // Inflate the layout for this fragment
        return view;

    }

    public void comprobarListado(ArrayList<Jugador> equipo, Button botonAceptar) {
        if (equipo.size() == 5) {
            botonAceptar.setVisibility(View.VISIBLE);
            buttonskt1.setClickable(false);
            buttonskt2.setClickable(false);
            buttonskt3.setClickable(false);
            buttonskt4.setClickable(false);
            buttonskt5.setClickable(false);
            buttong21.setClickable(false);
            buttong22.setClickable(false);
            buttong23.setClickable(false);
            buttong24.setClickable(false);
            buttong25.setClickable(false);
            buttonorigen1.setClickable(false);
            buttonorigen2.setClickable(false);
            buttonorigen3.setClickable(false);
            buttonorigen4.setClickable(false);
            buttonorigen5.setClickable(false);
            buttonfnatic1.setClickable(false);
            buttonfnatic2.setClickable(false);
            buttonfnatic3.setClickable(false);
            buttonfnatic4.setClickable(false);
            buttonfnatic5.setClickable(false);
            buttongiants1.setClickable(false);
            buttongiants2.setClickable(false);
            buttongiants3.setClickable(false);
            buttongiants4.setClickable(false);
            buttongiants5.setClickable(false);
            buttonmadlions1.setClickable(false);
            buttonmadlions2.setClickable(false);
            buttonmadlions3.setClickable(false);
            buttonmadlions4.setClickable(false);
            buttonmadlions5.setClickable(false);

        }
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
