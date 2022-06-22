package com.ufv.restservice.objetos.subclases.Prestamos;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class PrestamoTest {

    Prestamo prestamo = new Prestamo("0001", "01", "PC_01", "20/01/2021", "27/01/2022", "25/01/2021", "Todo correcto");

    @Test
    void getIdprestamo() {
        Assert.assertEquals("0001", prestamo.getIdprestamo() );
    }

    @Test
    void getUsuario() {
        Assert.assertEquals("01", prestamo.getUsuario() );
    }

    @Test
    void getEquipo() {
        Assert.assertEquals("PC_01", prestamo.getEquipo());
    }

    @Test
    void getFechaIniP() {
        Assert.assertEquals("20/01/2021", prestamo.getFechaIniP());
    }

    @Test
    void getFechaFinP() {
        Assert.assertEquals("27/01/2022", prestamo.getFechaFinP());
    }

    @Test
    void getFechaReal() {
        Assert.assertEquals("25/01/2021", prestamo.getFechaReal());
    }

    @Test
    void getComentarios() {
        Assert.assertEquals("Todo correcto", prestamo.getComentarios());
    }
}