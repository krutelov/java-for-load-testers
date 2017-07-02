package com.jet.calc;

/**
 * Adds decoration to log line
 */
public class DecoratingStringBuilderCalculatorLog extends StringBuilderCalculatorLogger{
    public DecoratingStringBuilderCalculatorLog() {
        super();
    }

    public DecoratingStringBuilderCalculatorLog(StringBuilder log) {
        super(log);
    }

    @Override
    protected String buildCommand(String command, double a, double b, double result) {
        return "[DECORATED] " + a + " " + command + " " + b + " = " + result + "\n";
    }
}
