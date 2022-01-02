package com.valts;

public class Main {

    public static void main(String[] args) {
	

        Sumador sumador1 = Sumador.getInstance();
        System.out.println(sumador1);
        sumador1.printSum(2,5);

        Sumador sumador2 = Sumador.getInstance();
        System.out.println(sumador2);
        sumador2.printSum(5,6);
    }
}
