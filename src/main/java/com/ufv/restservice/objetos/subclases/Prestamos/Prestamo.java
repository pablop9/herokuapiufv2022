package com.ufv.restservice.objetos.subclases.Prestamos;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY, getterVisibility = JsonAutoDetect.Visibility.NONE, setterVisibility = JsonAutoDetect.Visibility.NONE)
public class Prestamo {

    @JsonProperty("idprestamo")
    private String idprestamo;
    @JsonProperty("usuario")
    private String usuario;
    @JsonProperty("equipo")
    private String equipo;
    @JsonProperty("fechaIniP")
    private String fechaIniP;
    @JsonProperty("fechaFinP")
    private String fechaFinP;
    @JsonProperty("fechaReal")
    private String fechaReal;
    @JsonProperty("comentarios")
    private String comentarios;

    public Prestamo(String idprestamo, String usuario, String equipo, String fechaIniP, String fechaFinP, String fechaReal, String comentarios) {
        this.idprestamo = idprestamo;
        this.usuario = usuario;
        this.equipo = equipo;
        this.fechaIniP = fechaIniP;
        this.fechaFinP = fechaFinP;
        this.fechaReal = fechaReal;
        this.comentarios = comentarios;
    }

    public Prestamo() {
    }

    public String getIdprestamo() {
        return idprestamo;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getEquipo() {
        return equipo;
    }

    public String getFechaIniP() {
        return fechaIniP;
    }

    public String getFechaFinP() {
        return fechaFinP;
    }

    public String getFechaReal() {
        return fechaReal;
    }

    public String getComentarios() {
        return comentarios;
    }

    /*
    public void setIdprestamo(String idprestamo) {
        this.idprestamo = idprestamo;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public void setFechaIniP(String fechaIniP) {
        this.fechaIniP = fechaIniP;
    }

    public void setFechaFinP(String fechaFinP) {
        this.fechaFinP = fechaFinP;
    }

    public void setFechaReal(String fechaReal) {
        this.fechaReal = fechaReal;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

     */

    @Override
    public String toString() {
        return "Prestamo{" +
                "idprestamo='" + idprestamo + '\'' +
                ", usuario='" + usuario + '\'' +
                ", equipo='" + equipo + '\'' +
                ", fechaIniP='" + fechaIniP + '\'' +
                ", fechaFinP='" + fechaFinP + '\'' +
                ", fechaReal='" + fechaReal + '\'' +
                ", comentarios='" + comentarios + '\'' +
                '}';
    }
}
