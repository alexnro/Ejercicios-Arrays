package org.lasencinas.ejercicio2;

import org.lasencinas.ejercicio2.ListaFinal;

public class Ejercicio2 {

    public static void main(String[] args) {
        
        ListaFinal resultado = new ListaFinal();

        // damos valores a lista
        resultado.setListaAleatoria();

        for (int i = 0; i < resultado.getLista().length; i++) {
            if (resultado.getLista()[i] % 2 == 0) {
                resultado.getAuxiliar()[0]++;
            } else {
                resultado.getAuxiliar()[1]++;
            }
            if (i == 0) {
                resultado.min = resultado.getLista()[i];
            } else if (resultado.getLista()[i] < resultado.getMin()) {
                resultado.min = resultado.getLista()[i];
            }
        }
        resultado.getAuxiliar()[2] = resultado.getSumaImpares() / resultado.getAuxiliar()[1];
        for (int i = 1; i <= resultado.getMin(); i++) {
            resultado.getAuxiliar()[3] += i;
        }

        for (int i = 0; i < resultado.getLista().length; i++) {
            System.out.println("Posicion " + i + " de la lista =" + resultado.getLista()[i]);
        }
        System.out.println();

        System.out.println("Numero de elementos pares: " + resultado.getAuxiliar()[0]);
        System.out.println("Numero de elementos impares: " + resultado.getAuxiliar()[1]);
        System.out.println("Media impares: " + resultado.getAuxiliar()[2]);
        System.out
                .println("Suma de lso enteros comprendidos entre 1 y el minimo de la lista: "
                        + resultado.getAuxiliar()[3]);
    }

}
