package com.javafullstack;

import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        Consumer<String> c = (name) -> {
            try {
                System.out.println(name + " " + "Good Evening!!!");
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        c.accept("Laxman");
        c.accept("Anitha");
        c.accept("Vikamaditya");
    }
}
