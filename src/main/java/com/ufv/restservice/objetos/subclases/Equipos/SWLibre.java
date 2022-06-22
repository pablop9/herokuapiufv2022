package com.ufv.restservice.objetos.subclases.Equipos;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY, getterVisibility = JsonAutoDetect.Visibility.NONE, setterVisibility = JsonAutoDetect.Visibility.NONE)
public class SWLibre {
    @JsonProperty("nombre")
    private String nombre;
    @JsonProperty("version")
    private String version;

    public SWLibre() {
    }

    public SWLibre(String nombre, String version) {
        this.nombre = nombre;
        this.version = version;
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
        return "SWLibre{" +
                "nombre='" + nombre + '\'' +
                ", version='" + version + '\'' +
                '}';
    }
}
