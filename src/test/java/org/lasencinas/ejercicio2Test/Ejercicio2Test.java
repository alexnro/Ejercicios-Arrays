package org.lasencinas.ejercicio2Test;

import org.junit.Test;
import org.lasencinas.ejercicio2.Ejercicio2;
import org.lasencinas.ejercicio2.ListaFinal;

import static org.junit.Assert.assertEquals;

public class Ejercicio2Test {

    @Test
    public void generarListaTest() {
        ListaFinal ejercicio = new ListaFinal();

        assertEquals(37.5, ejercicio.setListaAleatoria(), 12.5);
    }

}
