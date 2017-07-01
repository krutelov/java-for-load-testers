package com.jet.calc;

/**
 * Simple stub that prints all commands
 */
public class StubLogger implements CalculatorLogger{
    public void setLog (String command, double a, double b, double result){
        System.out.println(a + " " + command + " " + b + " = " + result);
    }

    public String[] getLog() {
        String[] fakeLog = {"log working", "log working"};
        return fakeLog;
    }
}
