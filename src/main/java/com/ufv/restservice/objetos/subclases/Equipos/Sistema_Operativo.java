package com.ufv.restservice.objetos.subclases.Equipos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Sistema_Operativo {

    @JsonProperty("nombre")
    private String nombre;
    @JsonProperty("version")
    private String version;

    public Sistema_Operativo(String nombre, String version) {
        this.nombre = nombre;
        this.version = version;
    }

    public Sistema_Operativo() {
    }

    public String getNombre() {
        return nombre;
    }

    public String getVersion() {
        return version;
    }

    /*

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setVersion(String version) {
        this.version = version;
    }

     */

    @Override
    public String toString() {
        return "Sistema_Operativo{" +
                "nombre='" + nombre + '\'' +
                ", version='" + version + '\'' +
                '}';
    }

}
