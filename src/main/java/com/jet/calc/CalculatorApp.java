package com.jet.calc;

import static java.lang.Double.*;

/**
 * Runner for Calculator class
 */
public class CalculatorApp {

    public static void main(String[] args) {
        Calculator calc1 = new Calculator();
        calc1.setLog(new StubLogger());

        for (int i = 0; i < args.length; i += 3){
            String command = args[i];
            double a = parseDouble(args[i+1]);
            double b = parseDouble(args[i+2]);
            calc1.executeCommand(command, a, b);
        }
        for (String logLine : calc1.getLog()){
            System.out.println(logLine);
        }
    }
}
