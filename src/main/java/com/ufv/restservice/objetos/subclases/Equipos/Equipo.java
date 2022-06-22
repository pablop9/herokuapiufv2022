package com.ufv.restservice.objetos.subclases.Equipos;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY, getterVisibility = JsonAutoDetect.Visibility.NONE, setterVisibility = JsonAutoDetect.Visibility.NONE)
public class Equipo {


    @JsonProperty("idequipo")
    private String idequipo;
    @JsonProperty("tipo")
    private String tipo;
    @JsonProperty("marca")
    private String marca;
    @JsonProperty("uso")
    private String uso;
    @JsonProperty("sistop")
    private Sistema_Operativo sistop;
    @JsonProperty("hardware")
    private Hardware hardware;
    @JsonProperty("software")
    private Software software;

    public Equipo() {
    }

    public Equipo(String idequipo, String tipo, String marca, String uso, Sistema_Operativo sistop, Hardware hardware, Software software) {
        this.idequipo = idequipo;
        this.tipo = tipo;
        this.marca = marca;
        this.uso = uso;
        this.sistop = sistop;
        this.hardware = hardware;
        this.software = software;
    }

    public String getIdequipo() {
        return idequipo;
    }

    public String getTipo() {
        return tipo;
    }

    public String getMarca() {
        return marca;
    }

    public String getUso() {
        return uso;
    }

    public Sistema_Operativo getSistop() {
        return sistop;
    }

    public Hardware getHardware() {
        return hardware;
    }

    public Software getSoftware() {
        return software;
    }

    /*

    public void setIdequipo(String idequipo) {
        this.idequipo = idequipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setUso(String uso) {
        this.uso = uso;
    }

    public void setSistop(Sistema_Operativo sistop) {
        this.sistop = sistop;
    }

    public void setHardware(Hardware hardware) {
        this.hardware = hardware;
    }

    public void setSoftware(Software software) {
        this.software = software;
    }

     */
    @Override
    public String toString() {
        return "Equipo{" +
                "idequipo='" + idequipo + '\'' +
                ", tipo='" + tipo + '\'' +
                ", marca='" + marca + '\'' +
                ", uso='" + uso + '\'' +
                ", sistop=" + sistop +
                ", hardware=" + hardware +
                ", software=" + software +
                '}';
    }
}
