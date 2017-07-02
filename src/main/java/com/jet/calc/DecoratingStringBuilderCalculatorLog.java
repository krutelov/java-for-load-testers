package com.jet.calc;

/**
 * Created by a1 on 02/07/2017.
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
