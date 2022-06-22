package com.ufv.restservice.objetos.subclases.Equipos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Memoria {

    @JsonProperty("cantidad")
    private String cantidad;
    @JsonProperty("velocidad")
    private String velocidad;

    public Memoria(String cantidad, String velocidad) {
        this.cantidad = cantidad;
        this.velocidad = velocidad;
    }

    public Memoria() {
    }

    public String getCantidad() {
        return cantidad;
    }

    public String getVelocidad() {
        return velocidad;
    }

    /*
    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public void setVelocidad(String velocidad) {
        this.velocidad = velocidad;
    }

     */

    @Override
    public String toString() {
        return "Memoria{" +
                "cantidad='" + cantidad + '\'' +
                ", velocidad='" + velocidad + '\'' +
                '}';
    }
}
