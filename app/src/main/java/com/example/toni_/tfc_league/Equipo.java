package com.example.toni_.tfc_league;

import java.io.Serializable;
import java.util.ArrayList;

public class Equipo implements Serializable {

    private ArrayList<Jugador> equipo;

    public Equipo(){

    }
    public Equipo(ArrayList<Jugador> equipo) {
        this.equipo = equipo;
    }

    public ArrayList<Jugador> getEquipo() {
        return equipo;
    }

    public void setEquipo(ArrayList<Jugador> equipo) {
        this.equipo = equipo;
    }
}
