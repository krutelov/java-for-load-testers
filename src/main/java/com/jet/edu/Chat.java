package com.jet.edu;


import static com.jet.edu.Chat.start;

/**
 * Chat application.
 */
public class Chat {
    public static final int PORT;

    static {
        PORT = 8888;
    }

    public static void start() {
        System.out.println(PORT);
    }

    public static void start(int port) {
        System.out.println(port);
    }

    public static void sendMessage(String message) {

    }
}

class ChatRunner {
    public static void main(String[] args) {
        //.....
        start();
        start(9999);

        Chat.sendMessage("kkk");
        Chat.getMessages();
    }
}




class Человек {
    public static void сделайРемонт() {
        вынесиМусор();
        вынесиМебель();

    }

    private static void вынесиМебель() {
        System.out.println("Да сколько можно!!!");
        System.out.println("Уже вынес давно!!!!");
    }

    private static void вынесиМусор() {
        System.out.println("Да сколько можно!!!");
    }

}


















