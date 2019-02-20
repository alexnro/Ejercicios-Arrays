package org.lasencinas.ejercicio2Test;

import org.junit.Test;
import org.lasencinas.ejercicio2.Ejercicio2;
import org.lasencinas.ejercicio2.ListaFinal;

import static org.junit.Assert.assertEquals;

public class Ejercicio2Test {

    @Test
    public void generarListaTest() {
        ListaFinal ejercicio = new ListaFinal();
        ejercicio.setListaAleatoria();
        for(int i = 0; i < ejercicio.getLista().length; i++) {
            assertEquals(37.5, ejercicio.getLista()[i], 12.5);
        }
    }

}
