package com.jet.calc;

public class Calculator {
    public static int add (int a, int b) {
        CalculatorApp.memory = a + b;
        return a + b;
    }

    public static int sub (int a, int b) {
        CalculatorApp.memory = a - b;
        return a - b;
    }

    public static int mult (int a, int b) {
        CalculatorApp.memory = a * b;
        return a * b;
    }

    public static int div (int a, int b) {
        CalculatorApp.memory = a / b;
        return a / b;
    }

    public static void saveToMemory () {
        CalculatorApp.currentMemory = CalculatorApp.memory;
    }

    public static void addMemory () {
        CalculatorApp.currentMemory = CalculatorApp.memory + CalculatorApp.currentMemory;
    }

    public static int showMemory () {
        return CalculatorApp.currentMemory;
    }

}



/**
 * +
 * -
 * *
 * /
 *
 * memory
 * memory + result
 */