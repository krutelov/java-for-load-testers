package com.jet.calc;

/**
 * Keeps history of commands
 */
public class StringBuilderCalculatorLogger implements CalculatorLogger{
    private StringBuilder log;

    public StringBuilderCalculatorLogger() {
        this.log = new StringBuilder();
    }

    public StringBuilderCalculatorLogger(StringBuilder log) {
        this.log = log;
    }

    public void addToLog(String command, double a, double b, double result){
        String currentLog = buildCommand(command, a, b, result);
        log.append(currentLog);
    }

    protected String buildCommand(String command, double a, double b, double result) {
        return a + " " + command + " " + b + " = " + result + "\n";
    }

    public String[] getLog(){
        return log.toString().split("\n");
    }
}
