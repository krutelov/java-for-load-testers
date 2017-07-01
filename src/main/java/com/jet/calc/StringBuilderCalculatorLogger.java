package com.jet.calc;

/**
 * Keeps history of commands
 */
public class StringBuilderCalculatorLogger {
    private StringBuilder log = new StringBuilder("");

    public void setLog (String command, double a, double b, double result){
        String currentLog = a + " " + command + " " + b + " = " + result + "\n";
        log.append(currentLog);
    }

    public String[] getLog(){
        return log.toString().split("\n");
    }
}
