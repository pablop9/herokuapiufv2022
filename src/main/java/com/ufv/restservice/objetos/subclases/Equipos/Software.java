package com.ufv.restservice.objetos.subclases.Equipos;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY, getterVisibility = JsonAutoDetect.Visibility.NONE, setterVisibility = JsonAutoDetect.Visibility.NONE)
public class Software {

    @JsonProperty("softwarelibre")
    private ArrayList<SWLibre> softwarelibre;
    @JsonProperty("softwarepago")
    private ArrayList<SWPago> softwarepago;

    public Software(ArrayList<SWLibre> softwarelibre, ArrayList<SWPago> softwarepago) {
        this.softwarelibre = softwarelibre;
        this.softwarepago = softwarepago;
    }

    public Software() {
    }

    public ArrayList<SWLibre> getSoftwarelibre() {
        return softwarelibre;
    }

    public ArrayList<SWPago> getSoftwarepago() {
        return softwarepago;
    }
    /*

    public void setSoftwarelibre(ArrayList<SWLibre> softwarelibre) {
        this.softwarelibre = softwarelibre;
    }

    public void setSoftwarepago(ArrayList<SWPago> softwarepago) {
        this.softwarepago = softwarepago;
    }

     */

    @Override
    public String toString() {
        return "Software{" +
                "softwarelibre=" + softwarelibre +
                ", softwarepago=" + softwarepago +
                '}';
    }

}
