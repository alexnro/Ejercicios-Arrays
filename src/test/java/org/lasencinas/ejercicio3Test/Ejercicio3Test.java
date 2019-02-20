package org.lasencinas.ejercicio3Test;

import org.junit.Test;
import org.lasencinas.ejercicio3.ListaAleatoria;

import static org.junit.Assert.assertTrue;

public class Ejercicio3Test {


    @Test
    public void rangoNumerosTest() {

        ListaAleatoria lista = new ListaAleatoria();
        lista.crearListaAleatoria();

        for(int i = 0; i < lista.getVector().length; i++) {
            assertTrue(lista.getVector()[i] > 0 && lista.getVector()[i] < 21);
        }
    }
}