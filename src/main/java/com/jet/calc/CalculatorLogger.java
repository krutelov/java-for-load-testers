package com.jet.calc;

/**
 * Calculator interface
 */
public interface CalculatorLogger {
    void addToLog(String command, double a, double b, double result);
    String[] getLog();
}
