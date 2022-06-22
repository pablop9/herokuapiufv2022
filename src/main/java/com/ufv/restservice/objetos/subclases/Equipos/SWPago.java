package com.ufv.restservice.objetos.subclases.Equipos;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY, getterVisibility = JsonAutoDetect.Visibility.NONE, setterVisibility = JsonAutoDetect.Visibility.NONE)
public class SWPago {

    @JsonProperty("nombre")
    private String nombre;
    @JsonProperty("version")
    private String version;
    @JsonProperty("tipo")
    private String tipo;

    public SWPago(String nombre, String version, String tipo) {
        this.nombre = nombre;
        this.version = version;
        this.tipo = tipo;
    }

    public SWPago() {
    }

    public String getNombre() {
        return nombre;
    }

    public String getVersion() {
        return version;
    }

    public String getTipo() {
        return tipo;
    }
    /*

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

     */

    @Override
    public String toString() {
        return "SWPago{" +
                "nombre='" + nombre + '\'' +
                ", version='" + version + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
