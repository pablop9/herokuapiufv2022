package com.ufv.restservice.objetos.subclases;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY, getterVisibility = JsonAutoDetect.Visibility.NONE, setterVisibility = JsonAutoDetect.Visibility.NONE)
public class Usuario {

    @JsonProperty("idusuario")
    private String idusuario;
    @JsonProperty("nombre")
    private String nombre;
    @JsonProperty("departamento")
    private String departamento;
    @JsonProperty("telefono")
    private String telefono;
    @JsonProperty("correo")
    private String correo;
    @JsonProperty("ubicacion")
    private String ubicacion;


    public Usuario(String idusuario, String nombre, String departamento, String telefono, String correo, String ubicacion) {
        this.idusuario = idusuario;
        this.nombre = nombre;
        this.departamento = departamento;
        this.telefono = telefono;
        this.correo = correo;
        this.ubicacion = ubicacion;
    }
    public Usuario(){}

    public String getIdusuario() {
        return idusuario;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDepartamento() {
        return departamento;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    /*
    public void setIdusuario(String idusuario) {
        this.idusuario = idusuario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

     */

    @Override
    public String toString() {
        return "Usuario{" +
                "idusuario='" + idusuario + '\'' +
                ", nombre='" + nombre + '\'' +
                ", departamento='" + departamento + '\'' +
                ", telefono='" + telefono + '\'' +
                ", correo='" + correo + '\'' +
                ", ubicacion='" + ubicacion + '\'' +
                '}';
    }
}
