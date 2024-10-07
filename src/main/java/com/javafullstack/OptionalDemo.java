package com.javafullstack;

public class OptionalDemo {
    public static void main(String[] args) {
        String s = null;
        if (s != null && !s.isBlank()) {
            System.out.println(s.length());
        } else {
            System.out.println("String is null or blank.");
        }
    }
}

