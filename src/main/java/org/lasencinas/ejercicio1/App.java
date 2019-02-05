package org.lasencinas.ejercicio1;

import org.lasencinas.ejercicio1.Ejercicio1;

public class App {


    public static void main(String[] args) {

        Ejercicio1 ejercicio = new Ejercicio1();

        ejercicio.menorVenta();
        ejercicio.mayorVenta();
        ejercicio.totalVenta();

        System.out.println("La tienda que menos ha vendido fue la " + (ejercicio.getPosicionMenor() + 1) + ", que vendió " + ejercicio.getMenor() + " €");
        System.out.println("La tienda que mas ha vendido fue la " + (ejercicio.getPosicionMayor() + 1) + ", que vendió " + ejercicio.getMayor() + " €");
        System.out.println("El total de las ventas es: " + ejercicio.getTotal() + " €");
    }
}
