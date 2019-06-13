package com.example.toni_.tfc_league;

public class Jugador {

    String liga = "Challenger";
    int lp = 700;
    double valor = 2000;
    private String id;

    public Jugador(String id){
        this.id = id;
    }

    public Jugador(String liga, int lp, double valor) {
        this.liga = liga;
        this.lp = lp;
        this.valor = valor;
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
}
