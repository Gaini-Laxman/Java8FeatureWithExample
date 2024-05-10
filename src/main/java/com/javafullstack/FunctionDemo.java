package com.javafullstack;

import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        Function<String,Integer> f = String::length;
        System.out.println(f.apply("Laxman"));
        System.out.println(f.apply("Anitha"));
    }
}
