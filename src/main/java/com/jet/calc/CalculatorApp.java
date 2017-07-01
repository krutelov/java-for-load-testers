package com.jet.calc;

import static java.lang.Double.*;

/**
 * Runner for Calculator class
 */
public class CalculatorApp {

    public static void main(String[] args) {
        Calculator calc1 = new Calculator();
        Calculator calc2 = new Calculator();

        for (int i = 0; i < 6; i += 3){
            String command = args[i];
            double a = parseDouble(args[i+1]);
            double b = parseDouble(args[i+2]);
            calc1.executeCommand(command, a, b);
        }
        for (String logLine : calc1.getLog()){
            System.out.println(logLine);
        }

        for (int i = 6; i < args.length; i += 3){
            String command = args[i];
            double a = parseDouble(args[i+1]);
            double b = parseDouble(args[i+2]);
            calc2.executeCommand(command, a, b);
        }
        for (String logLine : calc2.getLog()){
            System.out.println(logLine);
        }
    }
}
