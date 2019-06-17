package com.example.toni_.tfc_league;

import java.io.Serializable;

/**
 * @author ToNi_
 * Clase que gestiona el usuario que vamos a añadir a base de datos y con el que se realiza el inicio de sesion
 */

public class Usuario implements Serializable {

    public String correo;
    public double dineroTorneo;

    public Usuario(){

    }

    public Usuario(String correo, double dineroTorneo) {
        this.correo = correo;
        this.dineroTorneo = dineroTorneo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public double getDineroTorneo() {
        return dineroTorneo;
    }

    public void setDineroTorneo(double dineroTorneo) {
        this.dineroTorneo = dineroTorneo;
    }
}
