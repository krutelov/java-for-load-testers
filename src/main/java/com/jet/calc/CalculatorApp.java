package com.jet.calc;

import static com.jet.calc.Calculator.*;

/**
 * Runner for Calculator class
 */
public class CalculatorApp {

    public static void main(String[] args) {

        System.out.println(add(1,1));
        System.out.println(getSavedValue());
        addToMemory();
        System.out.println(getSavedValue());

    }
}