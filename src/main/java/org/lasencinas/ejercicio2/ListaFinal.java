package org.lasencinas.ejercicio2;

import java.util.Random;

public class ListaFinal {

    double[] lista = new double[25];
    Random aleatorio = new Random();
    double[] auxiliar = new double[4];
    double sumaImpares = 0;
    double min = 0;

    public double[] getLista() {
        return lista;
    }

    public Random getAleatorio() {
        return aleatorio;
    }

    public double[] getAuxiliar() {
        return auxiliar;
    }

    public double getSumaImpares() {
        return sumaImpares;
    }

    public double getMin() {
        return min;
    }

    public double[] setListaAleatoria() {
        for (int i = 0; i < this.getLista().length; i++) {
            this.getLista()[i] = this.getAleatorio().nextInt(26) + 25;
        }
        return this.getLista();
    }
}
