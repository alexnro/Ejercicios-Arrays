package org.lasencinas.ejercicio3;

import java.util.Random;

public class ListaAleatoria {

    int[] vector = new int[30];
    Random aleatorio = new Random();

    public int[] crearListaAleatoria() {

        for (int i = 0; i < vector.length; i++) {
            vector[i] = aleatorio.nextInt(20) + 1;
        }
        return vector;
    }

    public int[] getVector() {
        return vector;
    }
}
