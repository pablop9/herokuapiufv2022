package com.ufv.restservice.objetos.subclases.Equipos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Pantalla {
    @JsonProperty("diagonal")
    private String diagonal;
    @JsonProperty("resolucion")
    private String resolucion;

    public Pantalla() {
    }

    public Pantalla(String diagonal, String resolucion) {
        this.diagonal = diagonal;
        this.resolucion = resolucion;
    }

    public String getDiagonal() {
        return diagonal;
    }

    public String getResolucion() {
        return resolucion;
    }

    /*
    public void setDiagonal(String diagonal) {
        this.diagonal = diagonal;
    }

    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }

     */

    @Override
    public String toString() {
        return "Pantalla{" +
                "diagonal='" + diagonal + '\'' +
                ", resolucion='" + resolucion + '\'' +
                '}';
    }
}
