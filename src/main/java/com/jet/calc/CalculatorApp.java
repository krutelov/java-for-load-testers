package com.jet.calc;


public class CalculatorApp {
    public static int memory = 0;
    public static int currentMemory = 0;

    public static void main(String[] args) {

        System.out.println(Calculator.add(1,2));
        System.out.println(Calculator.sub(1,2));
        Calculator.saveToMemory();
        System.out.println(Calculator.div(1,2));
        System.out.println(Calculator.showMemory());
        System.out.println(Calculator.mult(1,2));
        System.out.println(Calculator.showMemory());
        Calculator.addMemory();
        System.out.println(Calculator.showMemory());

    }
}