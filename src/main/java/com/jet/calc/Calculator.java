package com.jet.calc;

/**
 * Calculator with simple math actions
 */
public class Calculator {
    private double lastResult = 0;
    private double savedValue = 0;
    private CommandLog log = new CommandLog();

    /**
     * returns sum of a and b
     */
    public int add (int a, int b) {
        a = limitValue(a);
        b = limitValue(b);
        lastResult = limitValue(a + b);
        return limitValue(a + b);
    }

    public double add (double a, double b) {
        a = limitValue(a);
        b = limitValue(b);
        lastResult = limitValue(a + b);
        return limitValue(a + b);
    }

    /**
     * returns difference of a and b
     */
    public int sub (int a, int b) {
        a = limitValue(a);
        b = limitValue(b);
        lastResult = limitValue(a - b);
        return limitValue(a - b);
    }

    public double sub (double a, double b) {
        a = limitValue(a);
        b = limitValue(b);
        lastResult = limitValue(a - b);
        return limitValue(a - b);
    }

    /**
     * returns multiplication of a and b
     */
    public int mult (int a, int b) {
        a = limitValue(a);
        b = limitValue(b);
        lastResult = limitValue(a * b);
        return limitValue(a * b);
    }

    public double mult (double a, double b) {
        a = limitValue(a);
        b = limitValue(b);
        lastResult = limitValue(a * b);
        return limitValue(a * b);
    }

    /**
     * returns division a to b
     */
    public int div (int a, int b) {
        a = limitValue(a);
        b = limitValue(b);
        lastResult = limitValue(a / b);
        return limitValue(a / b);
    }

    public double div (double a, double b) {
        a = limitValue(a);
        b = limitValue(b);
        lastResult = limitValue(a / b);
        return limitValue(a / b);
    }

    /**
     * Saves last result to lastResult
     */
    public void saveToMemory () {
        savedValue = limitValue(lastResult);
    }

    /**
     * returns sum of last result and
     */
    public void addToMemory() {
        savedValue = limitValue(lastResult + savedValue);
    }

    /**
     * returns sum of a and b
     */
    public double getSavedValue() {
        return savedValue;
    }

    /**
     * modulo
     */
    public int modulo (int value){
        if (value < 0) {
            value = -value;
        }
        return value;
    }

    public double modulo (double value){
        if (value < 0) {
            value = -value;
        }
        return value;
    }

    /**
     * limit -10 10
     */
    public int limitValue (int value){
        if (value < -10) {
            value = -10;
        } else if (value > 10) {
            value = 10;
        }

        return value;
    }

    public double limitValue (double value){
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
    public double executeCommand(String command, double a, double b) {
        switch (command) {
            case "add": log.setLog(command, a, b, add(a,b));
                return add(a, b);
            case "div": log.setLog(command, a, b, div(a,b));
                return div(a, b);
            case "mult": log.setLog(command, a, b, mult(a,b));
                return mult(a, b);
            case "sub": log.setLog(command, a, b, sub(a,b));
                return sub(a, b);
            default: return 0;
        }
    }

    public String[] getLog(){
        return log.getLog();
    }
}
