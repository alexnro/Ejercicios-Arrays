package org.lasencinas.ejercicio1Test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.lasencinas.ejercicio1.Ejercicio1;


public class Ejercicio1Test {

    private Ejercicio1 ejercicio = null;

    @Before
    public void init() {
        ejercicio = new Ejercicio1();
    }

    @Test
    public void menorVentaTest() {

        assertEquals(320.35, ejercicio.menorVenta(), 320);
    }

    @Test
    public void mayorVentaTest() {

        assertEquals(8000, ejercicio.mayorVenta(), 8000);
    }

    @Test
    public void totalVentaTest() {

        assertEquals(10921.34, ejercicio.totalVenta(), 10921);
    }
}
