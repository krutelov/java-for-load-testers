package com.jet.calc;

/**
 * Calculator with simple math actions
 */
public class Calculator {
    private static int lastResult = 0;
    private static int savedValue = 0;

    /**
     * returns sum of a and b
     */
    public static int add (int a, int b) {
        lastResult = a + b;
        return a + b;
    }

    /**
     * returns difference of a and b
     */
    public static int sub (int a, int b) {
        lastResult = a - b;
        return a - b;
    }

    /**
     * returns multiplication of a and b
     */
    public static int mult (int a, int b) {
        lastResult = a * b;
        return a * b;
    }

    /**
     * returns division a to b
     */
    public static int div (int a, int b) {
        lastResult = a / b;
        return a / b;
    }

    /**
     * Saves last result to lastResult
     */
    public static void saveToMemory () {
        savedValue = lastResult;
    }

    /**
     * returns sum of last result and
     */
    public static void addToMemory() {
        savedValue = lastResult + savedValue;
    }

    /**
     * returns sum of a and b
     */
    public static int getSavedValue() {
        return savedValue;
    }

}
