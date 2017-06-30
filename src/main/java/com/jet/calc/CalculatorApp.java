package com.jet.calc;

import static com.jet.calc.Calculator.*;
import static java.lang.Double.*;

/**
 * Runner for Calculator class
 */
public class CalculatorApp {

    public static void main(String[] args) {
        for (int i = 0; i < args.length; i += 3){
            String command = args[i];
            double a = parseDouble(args[i+1]);
            double b = parseDouble(args[i+2]);
            executeCommand(command, a, b);
            setLog(command, a, b);
        }
        System.out.println(getLog());
    }
}
