package com.ufv.restservice.objetos.subclases.Equipos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Disco {

    @JsonProperty("tipo")
    private String tipo;
    @JsonProperty("capacidad")
    private String capacidad;

    public Disco() {
    }

    public Disco(String tipo, String capacidad) {
        this.tipo = tipo;
        this.capacidad = capacidad;
    }

    public String getTipo() {
        return tipo;
    }

    public String getCapacidad() {
        return capacidad;
    }

    /*
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }


     */
    @Override
    public String toString() {
        return "Disco{" +
                "tipo='" + tipo + '\'' +
                ", capacidad='" + capacidad + '\'' +
                '}';
    }
}
