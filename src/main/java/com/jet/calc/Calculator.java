package com.jet.calc;

/**
 * Calculator with simple math actions
 */
public class Calculator {
    private static double lastResult = 0;
    private static double savedValue = 0;

    /**
     * returns sum of a and b
     */
    public static int add (int a, int b) {
        a = limitValue(a);
        b = limitValue(b);
        lastResult = limitValue(a + b);
        return limitValue(a + b);
    }

    public static double add (double a, double b) {
        a = limitValue(a);
        b = limitValue(b);
        lastResult = limitValue(a + b);
        return limitValue(a + b);
    }

    /**
     * returns difference of a and b
     */
    public static int sub (int a, int b) {
        a = limitValue(a);
        b = limitValue(b);
        lastResult = limitValue(a - b);
        return limitValue(a - b);
    }

    public static double sub (double a, double b) {
        a = limitValue(a);
        b = limitValue(b);
        lastResult = limitValue(a - b);
        return limitValue(a - b);
    }

    /**
     * returns multiplication of a and b
     */
    public static int mult (int a, int b) {
        a = limitValue(a);
        b = limitValue(b);
        lastResult = limitValue(a * b);
        return limitValue(a * b);
    }

    public static double mult (double a, double b) {
        a = limitValue(a);
        b = limitValue(b);
        lastResult = limitValue(a * b);
        return limitValue(a * b);
    }

    /**
     * returns division a to b
     */
    public static int div (int a, int b) {
        a = limitValue(a);
        b = limitValue(b);
        lastResult = limitValue(a / b);
        return limitValue(a / b);
    }

    public static double div (double a, double b) {
        a = limitValue(a);
        b = limitValue(b);
        lastResult = limitValue(a / b);
        return limitValue(a / b);
    }

    /**
     * Saves last result to lastResult
     */
    public static void saveToMemory () {
        savedValue = limitValue(lastResult);
    }

    /**
     * returns sum of last result and
     */
    public static void addToMemory() {
        savedValue = limitValue(lastResult + savedValue);
    }

    /**
     * returns sum of a and b
     */
    public static double getSavedValue() {
        return savedValue;
    }

    /**
     * modulo
     */
    public static int modulo (int value){
        if (value < 0) {
            value = -value;
        }
        return value;
    }

    public static double modulo (double value){
        if (value < 0) {
            value = -value;
        }
        return value;
    }

    /**
     * limit -10 10
     */
    public static int limitValue (int value){
        if (value < -10) {
            value = -10;
        } else if (value > 10) {
            value = 10;
        }

        return value;
    }

    public static double limitValue (double value){
        if (value < -10) {
            value = -10;
        } else if (value > 10) {
            value = 10;
        }

        return value;
    }

    /**
     * Executes commands
     */
    public static double executeCommand(String command, double a, double b) {
        switch (command) {
            case "add": return add(a, b);
            case "div": return div(a, b);
            case "mult": return mult(a, b);
            case "sub": return sub(a, b);
            default: return 0;
        }
    }

}
