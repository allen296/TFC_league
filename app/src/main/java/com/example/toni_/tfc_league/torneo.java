package com.example.toni_.tfc_league;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.Random;


/**
 * @author ToNi_
 * Clase que gestiona el enfrentamiento entre el equipo del usuario y el enemigo,
 * asi como muestra en los elementos la formacion de tu equipo y el contrario
 * A simple {@link Fragment} subclass.
 */
public class Torneo extends Fragment {

    private TextView jugador1;
    private TextView jugador2;
    private TextView jugador3;
    private TextView jugador4;
    private TextView jugador5;

    private TextView enemigo1;
    private TextView enemigo2;
    private TextView enemigo3;
    private TextView enemigo4;
    private TextView enemigo5;

    Random rand = new Random();
    int a = rand.nextInt(Jugadores.equipoEnemigo.size());
    int b = rand.nextInt(Jugadores.equipoEnemigo.size());
    int c = rand.nextInt(Jugadores.equipoEnemigo.size());
    int d = rand.nextInt(Jugadores.equipoEnemigo.size());
    int e = rand.nextInt(Jugadores.equipoEnemigo.size());

    private Equipo equipoActual;

    public Torneo() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {



        View v = inflater.inflate(R.layout.fragment_torneo, container, false);
        TextView jugador1 = v.findViewById(R.id.jugador1);
        ImageView botonLuchar = (ImageView) v.findViewById(R.id.botonLuchar);
        Button botonNuevo = v.findViewById(R.id.botonNuevo);
        botonLuchar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                realizarBatalla(v);
            }
        });

        botonNuevo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                actualizarEnemigo(v);
            }
        });

        recuperarEquipo(v);

        // Inflate the layout for this fragment
        return v;
    }

    /**
     * @author ToNi_
     * Metodo que crea un nuevo equipo enemigo para comprobar las distintas posibilidades en el combate
     */
    private void actualizarEnemigo(View view) {
        int a = rand.nextInt(Jugadores.equipoEnemigo.size());
        int b = rand.nextInt(Jugadores.equipoEnemigo.size());
        int c = rand.nextInt(Jugadores.equipoEnemigo.size());
        int d = rand.nextInt(Jugadores.equipoEnemigo.size());
        int e = rand.nextInt(Jugadores.equipoEnemigo.size());

        enemigo1.setText(Jugadores.equipoEnemigo.get(a).getNombre());
        enemigo2.setText(Jugadores.equipoEnemigo.get(b).getNombre());
        enemigo3.setText(Jugadores.equipoEnemigo.get(c).getNombre());
        enemigo4.setText(Jugadores.equipoEnemigo.get(d).getNombre());
        enemigo5.setText(Jugadores.equipoEnemigo.get(e).getNombre());
    }

    /**
     * @author ToNi_
     * Metodo que se ejecuta para realizar el calculo de los equipos y las posibilidades de victoria
     * dependiendo de la puntuacion de estos
     */
    private void realizarBatalla(View view) {
        if (jugador1.getText() != "") {
            int puntosLigaMiEquipo = 0;
            for (int i = 0; i < equipoActual.getEquipo().size(); i++) {
                puntosLigaMiEquipo = puntosLigaMiEquipo + equipoActual.getEquipo().get(i).getLp() + equipoActual.getEquipo().get(i).getVictorias();
                switch (equipoActual.getEquipo().get(i).getLiga()) {
                    case "Challenger":
                        puntosLigaMiEquipo = puntosLigaMiEquipo + 900;
                        break;

                    default:
                        break;
                }
            }


            int puntosLigaEnemigo = 0;

            //Enemigo 1
            puntosLigaEnemigo = puntosLigaEnemigo + Jugadores.equipoEnemigo.get(a).getLp()+Jugadores.equipoEnemigo.get(a).getVictorias();
            switch (Jugadores.equipoEnemigo.get(a).getLiga()) {
                case "Challenger":
                    puntosLigaEnemigo = puntosLigaEnemigo + 900;
                    break;

                default:
                    break;
            }

            //Enemigo 2
            puntosLigaEnemigo = puntosLigaEnemigo + Jugadores.equipoEnemigo.get(b).getLp()+Jugadores.equipoEnemigo.get(b).getVictorias();
            switch (Jugadores.equipoEnemigo.get(b).getLiga()) {
                case "Challenger":
                    puntosLigaEnemigo = puntosLigaEnemigo + 900;
                    break;

                default:
                    break;
            }

            //Enemigo 3
            puntosLigaEnemigo = puntosLigaEnemigo + Jugadores.equipoEnemigo.get(c).getLp()+Jugadores.equipoEnemigo.get(c).getVictorias();
            switch (Jugadores.equipoEnemigo.get(c).getLiga()) {
                case "Challenger":
                    puntosLigaEnemigo = puntosLigaEnemigo + 900;
                    break;

                default:
                    break;
            }

            //Enemigo 4
            puntosLigaEnemigo = puntosLigaEnemigo + Jugadores.equipoEnemigo.get(d).getLp()+Jugadores.equipoEnemigo.get(d).getVictorias();
            switch (Jugadores.equipoEnemigo.get(d).getLiga()) {
                case "Challenger":
                    puntosLigaEnemigo = puntosLigaEnemigo + 900;
                    break;

                default:
                    break;
            }

            //Enemigo 5
            puntosLigaEnemigo = puntosLigaEnemigo + Jugadores.equipoEnemigo.get(e).getLp()+Jugadores.equipoEnemigo.get(e).getVictorias();
            switch (Jugadores.equipoEnemigo.get(e).getLiga()) {
                case "Challenger":
                    puntosLigaEnemigo = puntosLigaEnemigo + 900;
                    break;

                default:
                    break;
            }

            Random rand = new Random();
            int n = rand.nextInt(100);

            if (puntosLigaMiEquipo-puntosLigaEnemigo<=-20){
                if (n<=30){
                    Toast.makeText(view.getContext(), "HAS GANADO", Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(view.getContext(), "HAS PERDIDO", Toast.LENGTH_LONG).show();
                }
            }else if ((puntosLigaMiEquipo-puntosLigaEnemigo>-20)&&(puntosLigaMiEquipo-puntosLigaEnemigo<=-10)){
                if (n<=40){
                    Toast.makeText(view.getContext(), "HAS GANADO", Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(view.getContext(), "HAS PERDIDO", Toast.LENGTH_LONG).show();
                }
            }else if ((puntosLigaMiEquipo-puntosLigaEnemigo>-10)&&(puntosLigaMiEquipo-puntosLigaEnemigo<=10)){
                if (n<=50){
                    Toast.makeText(view.getContext(), "HAS GANADO", Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(view.getContext(), "HAS PERDIDO", Toast.LENGTH_LONG).show();
                }
            }else if ((puntosLigaMiEquipo-puntosLigaEnemigo>10)&&(puntosLigaMiEquipo-puntosLigaEnemigo<=20)){
                if (n<=60){
                    Toast.makeText(view.getContext(), "HAS GANADO", Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(view.getContext(), "HAS PERDIDO", Toast.LENGTH_LONG).show();
                }
            }else if (puntosLigaMiEquipo-puntosLigaEnemigo>20){
                if (n<=70){
                    Toast.makeText(view.getContext(), "HAS GANADO", Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(view.getContext(), "HAS PERDIDO", Toast.LENGTH_LONG).show();
                }
            }

        } else {
            Toast.makeText(view.getContext(),"No dispones de ningun equipo", Toast.LENGTH_LONG).show();

        }
    }
    //Mostramos los jugadores del equipo en los 5 text views

    /**
     * @author ToNi_
     * Metodo que actualiza los elementos de texto para mostrar el equipo que tenemos guardado en la base de datos
     */
    private void recuperarEquipo(View view) {
        DatabaseReference equipo = FirebaseDatabase.getInstance().getReference("Equipos");
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance();

        String idUser = firebaseAuth.getCurrentUser().getUid();
        jugador1 = view.findViewById(R.id.jugador1);
        jugador2 = view.findViewById(R.id.jugador2);
        jugador3 = view.findViewById(R.id.jugador3);
        jugador4 = view.findViewById(R.id.jugador4);
        jugador5 = view.findViewById(R.id.jugador5);

        enemigo1 = view.findViewById(R.id.enemigo1);
        enemigo2 = view.findViewById(R.id.enemigo2);
        enemigo3 = view.findViewById(R.id.enemigo3);
        enemigo4 = view.findViewById(R.id.enemigo4);
        enemigo5 = view.findViewById(R.id.enemigo5);



        equipo.child(idUser).addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if (dataSnapshot.exists()) {
                    equipoActual = dataSnapshot.getValue(Equipo.class);
                    jugador1.setText(equipoActual.getEquipo().get(0).getNombre());
                    jugador2.setText(equipoActual.getEquipo().get(1).getNombre());
                    jugador3.setText(equipoActual.getEquipo().get(2).getNombre());
                    jugador4.setText(equipoActual.getEquipo().get(3).getNombre());
                    jugador5.setText(equipoActual.getEquipo().get(4).getNombre());

                    enemigo1.setText(Jugadores.equipoEnemigo.get(a).getNombre());
                    enemigo2.setText(Jugadores.equipoEnemigo.get(b).getNombre());
                    enemigo3.setText(Jugadores.equipoEnemigo.get(c).getNombre());
                    enemigo4.setText(Jugadores.equipoEnemigo.get(d).getNombre());
                    enemigo5.setText(Jugadores.equipoEnemigo.get(e).getNombre());

                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

    }

}
