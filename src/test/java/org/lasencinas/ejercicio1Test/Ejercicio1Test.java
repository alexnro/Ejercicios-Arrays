package org.lasencinas.ejercicio1Test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lasencinas.ejercicio1.Ejercicio1;


public class Ejercicio1Test {

    @Test
    public void menorVentaTest() {

        Ejercicio1 menor = new Ejercicio1();

        assertEquals(320.35, menor.menorVenta(), 320);
    }
}
