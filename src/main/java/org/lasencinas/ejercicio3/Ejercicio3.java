package org.lasencinas.ejercicio3;

import java.util.Arrays;

public class Ejercicio3 {

    public static void main(String[] args) {

        ListaAleatoria vector = new ListaAleatoria();
        vector.crearListaAleatoria();
        Arrays.sort(vector.getVector());
        for (int numero : vector.getVector()) {
            System.out.println(numero);
        }
    }
}
