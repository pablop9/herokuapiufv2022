package com.ufv.restservice.objetos.subclases;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UsuarioTest {

    @BeforeEach
    void setUp() {

    }
    Usuario usuario = new Usuario("01", "Alonso Sanchez", "Desarrollo", "0998228182", "alonso@dis.es", "UFV");
    @Test
    void getIdusuario() {
        Assert.assertEquals("01", usuario.getIdusuario());
    }

    @Test
    void getNombre() {
        Assert.assertEquals("Alonso Sanchez", usuario.getNombre());
    }

    @Test
    void getDepartamento() {
        Assert.assertEquals("Desarrollo", usuario.getDepartamento());
    }

    @Test
    void getTelefono() {
        Assert.assertEquals("0998228182", usuario.getTelefono());
    }

    @Test
    void getCorreo() {
        Assert.assertEquals("alonso@dis.es", usuario.getCorreo());
    }

    @Test
    void getUbicacion() {
        Assert.assertEquals("UFV", usuario.getUbicacion());
    }
    /*
    @Test
    void testToString() {
    }

     */
}