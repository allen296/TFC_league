package com.example.toni_.tfc_league;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;


/**
 * @author ToNi_
 * Clase que gestiona el equipo y los añade a la base de datos firebase
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
    public static final ArrayList<Jugador> equipoEnemigo = new ArrayList<>();



    private String idUser;
    private int jugadoresEliminados =0;
    public Jugadores() {
        // Required empty public constructor
        firebaseDatabaseJugador = FirebaseDatabase.getInstance().getReference("Jugadores");
        firebaseDatabaseEquipo = FirebaseDatabase.getInstance().getReference("Equipos");
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        //Añadimos todos los posibles jugadores

        Jugador jugador1 = new Jugador("1", "Faker", "challenger", 600, 2000, 13);
        equipoEnemigo.add(jugador1);
        Jugador jugador2 = new Jugador("2", "Khan", "challenger", 550, 1800, 15);
        equipoEnemigo.add(jugador2);
        Jugador jugador3 = new Jugador("3", "Haru", "challenger", 570, 18100, 11);
        equipoEnemigo.add(jugador3);
        Jugador jugador4 = new Jugador("4", "Teddy", "challenger", 530, 1750, 13);
        equipoEnemigo.add(jugador4);
        Jugador jugador5 = new Jugador("5", "Effort", "challenger", 630, 1900, 10);
        equipoEnemigo.add(jugador5);
        Jugador jugador6 = new Jugador("6", "Caps", "challenger", 600, 2000, 15);
        equipoEnemigo.add(jugador6);
        Jugador jugador7 = new Jugador("7", "Wunder", "challenger", 585, 1800, 11);
        equipoEnemigo.add(jugador7);
        Jugador jugador8 = new Jugador("8", "Jankos", "challenger", 540, 1700, 12);
        equipoEnemigo.add(jugador8);
        Jugador jugador9 = new Jugador("9", "Perkz", "challenger", 570, 1850, 13);
        equipoEnemigo.add(jugador9);
        Jugador jugador10 = new Jugador("10", "Mikyx", "challenger", 550, 1600, 9);
        equipoEnemigo.add(jugador10);
        Jugador jugador11 = new Jugador("11", "Nukeduck", "challenger", 550, 1650, 11);
        equipoEnemigo.add(jugador11);
        Jugador jugador12 = new Jugador("12", "Mithy", "challenger", 570, 1800, 13);
        equipoEnemigo.add(jugador12);
        Jugador jugador13 = new Jugador("13", "Alphari", "challenger", 650, 2100, 16);
        equipoEnemigo.add(jugador13);
        Jugador jugador14 = new Jugador("14", "Kold", "challenger", 550, 1750, 8);
        equipoEnemigo.add(jugador14);
        Jugador jugador15 = new Jugador("15", "Patrik", "challenger", 580, 1800, 13);
        equipoEnemigo.add(jugador15);
        Jugador jugador16 = new Jugador("16", "Bwipo", "challenger", 620, 2200, 15);
        equipoEnemigo.add(jugador16);
        Jugador jugador17 = new Jugador("17", "Broxah", "challenger", 610, 2100, 13);
        equipoEnemigo.add(jugador17);
        Jugador jugador18 = new Jugador("18", "Nemesis", "challenger", 540, 1500, 8);
        equipoEnemigo.add(jugador18);
        Jugador jugador19 = new Jugador("19", "Rekkles", "challenger", 670, 2500, 15);
        equipoEnemigo.add(jugador19);
        Jugador jugador20 = new Jugador("20", "Hylissang", "challenger", 550, 1800, 10);
        equipoEnemigo.add(jugador20);
        Jugador jugador21 = new Jugador("21", "Th3Antonio", "challenger", 400, 1300, 11);
        equipoEnemigo.add(jugador21);
        Jugador jugador22 = new Jugador("22", "Razork", "challenger", 430, 1100, 11);
        equipoEnemigo.add(jugador22);
        Jugador jugador23 = new Jugador("23", "Milica", "challenger", 350, 1000, 9);
        equipoEnemigo.add(jugador23);
        Jugador jugador24 = new Jugador("24", "Deadly", "challenger", 460, 1300, 12);
        equipoEnemigo.add(jugador24);
        Jugador jugador25 = new Jugador("25", "Denky", "challenger", 450, 1250, 13);
        equipoEnemigo.add(jugador25);
        Jugador jugador26 = new Jugador("26", "Yoppa", "challenger", 450, 1300, 11);
        equipoEnemigo.add(jugador26);
        Jugador jugador27 = new Jugador("27", "Sharp", "challenger", 400, 1200, 11);
        equipoEnemigo.add(jugador27);
        Jugador jugador28 = new Jugador("28", "Czekolad", "challenger", 400, 1210, 12);
        equipoEnemigo.add(jugador28);
        Jugador jugador29 = new Jugador("29", "Samux", "challenger", 460, 1400, 13);
        equipoEnemigo.add(jugador29);
        Jugador jugador30 = new Jugador("30", "Falco", "challenger", 400, 1300, 11);
        equipoEnemigo.add(jugador30);


        View view = inflater.inflate(R.layout.fragment_jugadores, container, false);

        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance();

        final String idUser = firebaseAuth.getCurrentUser().getUid();

        //BOTON ACEPTAR EQUIPO, añade los jugadores añadidos al equipo a la base de datos
        final Button botonAceptar = view.findViewById(R.id.aceptarEquipo);

        botonAceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Equipo e = new Equipo(equipo);
                firebaseDatabaseEquipo.child(idUser).setValue(e);
            }
        });

        //BOTON 1 SKT, añade el jugador a la lista de equipo, elimina el jugador de la lista de posibles jugadores enemigos
        //para evitar que se enfrenten a si mismos, el boton se vuelve invisible para dar a entender al usuario que está seleccionado ya y
        //comprueba que el equipo sea de 5 o no para bloquear el resto de botones.
        buttonskt1 = view.findViewById(R.id.buttonskt1);

        buttonskt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String newAppKey = firebaseDatabaseJugador.push().getKey();

                Jugador jugador = new Jugador(newAppKey, "Faker", "challenger", 600, 2000, 13);
                firebaseDatabaseJugador.child(newAppKey).setValue(jugador);
                equipo.add(jugador);
                equipoEnemigo.remove(0- jugadoresEliminados);
                buttonskt1.setVisibility(View.INVISIBLE);
                comprobarListado(equipo, botonAceptar);
                jugadoresEliminados = jugadoresEliminados +1;
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
                equipoEnemigo.remove(1- jugadoresEliminados);

                buttonskt2.setVisibility(View.INVISIBLE);

                comprobarListado(equipo, botonAceptar);
                jugadoresEliminados = jugadoresEliminados +1;
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
                equipoEnemigo.remove(2- jugadoresEliminados);

                buttonskt3.setVisibility(View.INVISIBLE);

                comprobarListado(equipo, botonAceptar);
                jugadoresEliminados = jugadoresEliminados +1;
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
                equipoEnemigo.remove(3- jugadoresEliminados);
                buttonskt4.setVisibility(View.INVISIBLE);

                comprobarListado(equipo, botonAceptar);
                jugadoresEliminados = jugadoresEliminados +1;
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
                equipoEnemigo.remove(4- jugadoresEliminados);
                buttonskt5.setVisibility(View.INVISIBLE);

                comprobarListado(equipo, botonAceptar);
                jugadoresEliminados = jugadoresEliminados +1;
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
                equipoEnemigo.remove(5- jugadoresEliminados);
                buttong21.setVisibility(View.INVISIBLE);

                comprobarListado(equipo, botonAceptar);
                jugadoresEliminados = jugadoresEliminados +1;
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
                equipoEnemigo.remove(6- jugadoresEliminados);
                buttong22.setVisibility(View.INVISIBLE);

                comprobarListado(equipo, botonAceptar);
                jugadoresEliminados = jugadoresEliminados +1;
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
                equipoEnemigo.remove(7- jugadoresEliminados);
                buttong23.setVisibility(View.INVISIBLE);

                comprobarListado(equipo, botonAceptar);
                jugadoresEliminados = jugadoresEliminados +1;
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
                equipoEnemigo.remove(8- jugadoresEliminados);
                buttong24.setVisibility(View.INVISIBLE);

                comprobarListado(equipo, botonAceptar);
                jugadoresEliminados = jugadoresEliminados +1;
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
                equipoEnemigo.remove(9- jugadoresEliminados);
                buttong25.setVisibility(View.INVISIBLE);

                comprobarListado(equipo, botonAceptar);
                jugadoresEliminados = jugadoresEliminados +1;
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
                equipoEnemigo.remove(10- jugadoresEliminados);
                buttonorigen1.setVisibility(View.INVISIBLE);

                comprobarListado(equipo, botonAceptar);
                jugadoresEliminados = jugadoresEliminados +1;
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
                equipoEnemigo.remove(11- jugadoresEliminados);
                buttonorigen2.setVisibility(View.INVISIBLE);

                comprobarListado(equipo, botonAceptar);
                jugadoresEliminados = jugadoresEliminados +1;
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
                equipoEnemigo.remove(12- jugadoresEliminados);
                buttonorigen3.setVisibility(View.INVISIBLE);

                comprobarListado(equipo, botonAceptar);
                jugadoresEliminados = jugadoresEliminados +1;
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
                equipoEnemigo.remove(13- jugadoresEliminados);
                buttonorigen4.setVisibility(View.INVISIBLE);

                comprobarListado(equipo, botonAceptar);
                jugadoresEliminados = jugadoresEliminados +1;
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
                equipoEnemigo.remove(14- jugadoresEliminados);
                buttonorigen5.setVisibility(View.INVISIBLE);

                comprobarListado(equipo, botonAceptar);
                jugadoresEliminados = jugadoresEliminados +1;
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
                equipoEnemigo.remove(15- jugadoresEliminados);
                buttonfnatic1.setVisibility(View.INVISIBLE);

                comprobarListado(equipo, botonAceptar);
                jugadoresEliminados = jugadoresEliminados +1;
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
                equipoEnemigo.remove(16- jugadoresEliminados);
                buttonfnatic2.setVisibility(View.INVISIBLE);

                comprobarListado(equipo, botonAceptar);
                jugadoresEliminados = jugadoresEliminados +1;
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
                equipoEnemigo.remove(17-jugadoresEliminados);
                buttonfnatic3.setVisibility(View.INVISIBLE);

                comprobarListado(equipo, botonAceptar);
                jugadoresEliminados = jugadoresEliminados +1;
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
                equipoEnemigo.remove(18-jugadoresEliminados);
                buttonfnatic4.setVisibility(View.INVISIBLE);

                comprobarListado(equipo, botonAceptar);
                jugadoresEliminados = jugadoresEliminados +1;
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
                equipoEnemigo.remove(19-jugadoresEliminados);
                buttonfnatic5.setVisibility(View.INVISIBLE);

                comprobarListado(equipo, botonAceptar);
                jugadoresEliminados = jugadoresEliminados +1;
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
                equipoEnemigo.remove(20-jugadoresEliminados);
                buttongiants1.setVisibility(View.INVISIBLE);

                comprobarListado(equipo, botonAceptar);
                jugadoresEliminados = jugadoresEliminados +1;
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
                equipoEnemigo.remove(21-jugadoresEliminados);
                buttongiants2.setVisibility(View.INVISIBLE);

                comprobarListado(equipo, botonAceptar);
                jugadoresEliminados = jugadoresEliminados +1;
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
                equipoEnemigo.remove(22-jugadoresEliminados);
                buttongiants3.setVisibility(View.INVISIBLE);

                comprobarListado(equipo, botonAceptar);
                jugadoresEliminados = jugadoresEliminados +1;
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
                equipoEnemigo.remove(23-jugadoresEliminados);
                buttongiants4.setVisibility(View.INVISIBLE);

                comprobarListado(equipo, botonAceptar);
                jugadoresEliminados = jugadoresEliminados +1;
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
                equipoEnemigo.remove(24-jugadoresEliminados);
                buttongiants5.setVisibility(View.INVISIBLE);

                comprobarListado(equipo, botonAceptar);
                jugadoresEliminados = jugadoresEliminados +1;
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
                equipoEnemigo.remove(25-jugadoresEliminados);
                buttonmadlions1.setVisibility(View.INVISIBLE);

                comprobarListado(equipo, botonAceptar);
                jugadoresEliminados = jugadoresEliminados +1;
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
                equipoEnemigo.remove(26-jugadoresEliminados);
                buttonmadlions2.setVisibility(View.INVISIBLE);

                comprobarListado(equipo, botonAceptar);
                jugadoresEliminados = jugadoresEliminados +1;
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
                equipoEnemigo.remove(27-jugadoresEliminados);
                buttonmadlions3.setVisibility(View.INVISIBLE);

                comprobarListado(equipo, botonAceptar);
                jugadoresEliminados = jugadoresEliminados +1;
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
                equipoEnemigo.remove(28-jugadoresEliminados);
                buttonmadlions4.setVisibility(View.INVISIBLE);

                comprobarListado(equipo, botonAceptar);
                jugadoresEliminados = jugadoresEliminados +1;
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
                equipoEnemigo.remove(29-jugadoresEliminados);
                buttonmadlions5.setVisibility(View.INVISIBLE);
                comprobarListado(equipo, botonAceptar);
                jugadoresEliminados = jugadoresEliminados +1;
            }
        });

        // Inflate the layout for this fragment
        return view;

    }

    /**
     * @author ToNi_
     * Metodo que bloquea los botones si el equipo es igual a 5
     */
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
