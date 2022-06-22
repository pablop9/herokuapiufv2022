package com.ufv.restservice.objetos;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.ufv.restservice.objetos.subclases.Equipos.Equipo;
import com.ufv.restservice.objetos.subclases.Prestamos.Prestamo;
import com.ufv.restservice.objetos.subclases.Usuario;

import java.util.ArrayList;
import java.util.List;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY, getterVisibility = JsonAutoDetect.Visibility.NONE, setterVisibility = JsonAutoDetect.Visibility.NONE)
public class Principal {


    @JsonProperty("equipo")
    private ArrayList<Equipo> equipo;
    @JsonProperty("usuario")
    private ArrayList<Usuario> usuario;
    @JsonProperty("prestamo")
    private ArrayList<Prestamo> prestamo;

    public Principal(ArrayList<Equipo> equipo, ArrayList<Usuario> usuario, ArrayList<Prestamo> prestamo) {
        this.equipo = equipo;
        this.usuario = usuario;
        this.prestamo = prestamo;
    }

    public Principal() {
    }

    public ArrayList<Equipo> getEquipo() {
        return equipo;
    }

    public ArrayList<Usuario> getUsuario() {
        return usuario;
    }

    public ArrayList<Prestamo> getPrestamo() {
        return prestamo;
    }

    public void setEquipo(ArrayList<Equipo> equipo) {
        this.equipo = equipo;
    }

    public void setUsuario(ArrayList<Usuario> usuario) {
        this.usuario = usuario;
    }

    public void setPrestamo(ArrayList<Prestamo> prestamo) {
        this.prestamo = prestamo;
    }

    @Override
    public String toString() {
        return "Principal{" +
                "equipo=" + equipo +
                ", usuario=" + usuario +
                ", prestamo=" + prestamo +
                '}';
    }
}
