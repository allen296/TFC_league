package com.example.toni_.tfc_league;

import java.io.Serializable;

/**
 * @author ToNi_
 * Clase que gestiona los jugadores y sus atributos principales, mediante los cuales se calcularan los enfrentamientos
 * Destacar que en un principio los atributos serian recogidos desde la API oficial de league of legends, pero finalmente me ha resultado
 * imposible hacer las llamadas correctamente
 */

public class Jugador implements Serializable {

    String liga;
    String nombre;
    int lp;
    double valor;
    String id;
    int victorias;

    public Jugador() {

    }

    public Jugador(String id) {
        this.id = id;
    }

    public Jugador(String id, String nombre, String liga, int lp, double valor, int victorias) {

        this.id = id;
        this.nombre = nombre;
        this.liga = liga;
        this.lp = lp;
        this.valor = valor;
        this.victorias = victorias;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLiga() {
        return liga;
    }

    public void setLiga(String liga) {
        this.liga = liga;
    }

    public int getLp() {
        return lp;
    }

    public void setLp(int lp) {
        this.lp = lp;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getVictorias() {
        return victorias;
    }

    public void setVictorias(int victorias) {
        this.victorias = victorias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
