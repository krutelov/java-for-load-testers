package com.jet.calc;

import static com.jet.calc.Calculator.*;

/**
 * Runner for Calculator class
 */
public class CalculatorApp {

    public static void main(String[] args) {

        System.out.println("Integers:");
        System.out.println(add(1,8));
        System.out.println(getSavedValue());
        addToMemory();
        System.out.println(getSavedValue());
        System.out.println(modulo(-24));
        System.out.println("\n");

        System.out.println("Float point:");
        System.out.println(add(1.3,1.9));
        System.out.println(add(12.3,1.9));
        System.out.println(getSavedValue());
        addToMemory();
        System.out.println(getSavedValue());
        System.out.println(modulo(-24.12));
        System.out.println("\n");
    }
}