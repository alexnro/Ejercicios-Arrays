package org.lasencinas.ejercicio1;


public class Ejercicio1 {

    private double[] ventas = {8000, 320.35, 930, 1020.99, 650};
    private double mayor = 0;
    private double menor = 0;
    private double total = 0;
    private int posicionMayor = 0;
    private int posicionMenor = 0;

    public static void main(String[] args) {
        System.out.println("La tienda que menos ha vendido fue la " + (posicionMenor + 1) + ", que vendió " + menor + " €");
        System.out.println("La tienda que mas ha vendido fue la " + (posicionMayor + 1) + ", que vendió " + mayor + " €");
        System.out.println("El total de las ventas es: " + total + " €");
    }

    public double menorVenta() {
        menor = ventas[0];
        for (int i = 0; i < ventas.length; i++) {
            if (ventas[i] < menor) {
                menor = ventas[i];
                posicionMenor = i;
            }
        }
        return menor;
    }

    public double mayorVenta() {
        mayor = ventas[0];
        for (int i = 0; i < ventas.length; i++) {
            if (ventas[i] > mayor) {
                mayor = ventas[i];
                posicionMayor = i;
            }
        }
        return mayor;
    }

    public double totalVenta() {
        for (int i = 0; i < ventas.length; i++) {
            total += ventas[i];
        }
        return total;
    }
}
