package com.valts;

public class Sumador {

    private static Sumador sumador = new Sumador();

    private Sumador() {

        System.out.println("Desde constructor");
    }

    public static Sumador getInstance() {
        if (sumador != null) {
            return sumador;
        } else {
            sumador = new Sumador();
           return sumador;
        }
    }

    public void printSum(int a, int b) {
        System.out.println(a + b);
    }
}
