package com.jet.edu;


import static com.jet.edu.Chat.start;

/**
 * Chat application.
 */
public class Chat {
    public static final int PORT;
    public static int port = 0;

    static {
        PORT = 8888;
    }

    public static void start() {
        int port = 5555;
        port = (int) Math.random();
    }

    public static int start(int port) { //formal
        port = 6666;
        return port;
    }
}

class ChatRunner {
    public static void main(String[] args) {
        int port = 5555;
        port = Chat.start(port); //fact
        System.out.println(port);


        int result = superFunction(arg1, a2, a3);
    }
}


/**
 *
 */
class Calculator {
    public static final int MY_SUPER_CONST = 0;

    /**
     * @param a
     * @param b
     * @return
     */
    public static int add(int a, int b) {
        return a + b;
    }


}

class CalculatorRunner {
    public static void main(String[] args) {
        System.out.println(Calculator.add(1, 1));
    }
}


class Человек {
    public static void сделайРемонт() {
        вынесиМусор(); //call
        вынесиМебель();
    }


    private static void вынесиМусор(String what) {
        System.out.println("выношу " + what);
    }

    private static void вынесиМусор() {
        вынесиМусор("");
        System.out.println("Да сколько можно выносить ВЕСЬ мусор!!!");
    }

    private static void вынесиМебель() {
        System.out.println("Да сколько можно!!!");
        System.out.println("Уже вынес давно!!!!");
    }

}


















