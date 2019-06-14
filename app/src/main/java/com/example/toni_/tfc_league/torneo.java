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


/**
 * A simple {@link Fragment} subclass.
 */
public class Torneo extends Fragment {

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
        botonLuchar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                realizarBatalla(v);
            }
        });

        recuperarEquipo(v);

        // Inflate the layout for this fragment
        return v;
    }

    private void realizarBatalla(View view) {
        int puntosLigaMiEquipo = 0;
        for (int i = 0; i < equipoActual.getEquipo().size(); i++) {
            puntosLigaMiEquipo += equipoActual.getEquipo().get(i).getLp() + equipoActual.getEquipo().get(i).getVictorias();
            switch (equipoActual.getEquipo().get(i).getLiga()) {
                case "Challenger":
                    puntosLigaMiEquipo += 900;
                    break;

                default:
                    break;
            }
        }
        Toast.makeText(view.getContext(), puntosLigaMiEquipo+"", Toast.LENGTH_LONG).show();

    }

    private void recuperarEquipo(View view) {
        DatabaseReference equipo = FirebaseDatabase.getInstance().getReference("Equipos");
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance();

        String idUser = firebaseAuth.getCurrentUser().getUid();
        final TextView jugador1 = view.findViewById(R.id.jugador1);
        final TextView jugador2 = view.findViewById(R.id.jugador2);
        final TextView jugador3 = view.findViewById(R.id.jugador3);
        final TextView jugador4 = view.findViewById(R.id.jugador4);
        final TextView jugador5 = view.findViewById(R.id.jugador5);


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
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

    }

}
