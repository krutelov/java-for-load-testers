package com.jet.calc;

/**
 * Calculator interface
 */
public interface CalculatorLogger {
    public void setLog(String command, double a, double b, double result);
    public String[] getLog();
}
