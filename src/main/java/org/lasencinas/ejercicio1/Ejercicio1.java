package org.lasencinas.ejercicio1;


public class Ejercicio1 {

    private double[] ventas = {8000, 320.35, 930, 1020.99, 650};
    private double mayor = 0;
    private double menor = 0;
    private double total = 0;
    private int posicionMayor = 0;
    private int posicionMenor = 0;

    public Ejercicio1() {}

    public Ejercicio1(double[] ventas, double mayor, double menor, double total, int posicionMayor, int posicionMenor) {
        this.ventas = ventas;
        this.mayor = mayor;
        this.menor = menor;
        this.total = total;
        this.posicionMayor = posicionMayor;
        this.posicionMenor = posicionMenor;
    }

    public double getMayor() {
        return mayor;
    }

    public double getMenor() {
        return menor;
    }

    public double getTotal() {
        return total;
    }

    public int getPosicionMayor() {
        return posicionMayor;
    }

    public int getPosicionMenor() {
        return posicionMenor;
    }

    public double menorVenta() {
        this.menor = this.ventas[0];
        for (int i = 0; i < this.ventas.length; i++) {
            if (this.ventas[i] < this.menor) {
                this.menor = this.ventas[i];
                this.posicionMenor = i;
            }
        }
        return this.menor;
    }

    public double mayorVenta() {
        this.mayor = this.ventas[0];
        for (int i = 0; i < this.ventas.length; i++) {
            if (this.ventas[i] > this.mayor) {
                this.mayor = this.ventas[i];
                this.posicionMayor = i;
            }
        }
        return this.mayor;
    }

    public double totalVenta() {
        for (int i = 0; i < this.ventas.length; i++) {
            this.total += this.ventas[i];
        }
        return this.total;
    }
}
