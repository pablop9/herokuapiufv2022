package com.ufv.restservice.objetos.subclases.Equipos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Hardware {

    @JsonProperty("procesador")
    private String procesador;
    @JsonProperty("memoria")
    private Memoria memoria;
    @JsonProperty("disco")
    private Disco disco;
    @JsonProperty("pantalla")
    private Pantalla pantalla;

    public Hardware() {
    }

    public Hardware(String procesador, Memoria memoria, Disco disco, Pantalla pantalla) {
        this.procesador = procesador;
        this.memoria = memoria;
        this.disco = disco;
        this.pantalla = pantalla;
    }

    public String getProcesador() {
        return procesador;
    }

    public Memoria getMemoria() {
        return memoria;
    }

    public Disco getDisco() {
        return disco;
    }

    public Pantalla getPantalla() {
        return pantalla;
    }
    /*

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public void setMemoria(Memoria memoria) {
        this.memoria = memoria;
    }

    public void setDisco(Disco disco) {
        this.disco = disco;
    }

    public void setPantalla(Pantalla pantalla) {
        this.pantalla = pantalla;
    }

     */


    @Override
    public String toString() {
        return "Hardware{" +
                "procesador='" + procesador + '\'' +
                ", memoria=" + memoria +
                ", disco=" + disco +
                ", pantalla=" + pantalla +
                '}';
    }
}
