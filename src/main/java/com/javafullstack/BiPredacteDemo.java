package com.javafullstack;

import java.util.function.BiPredicate;

public class BiPredacteDemo {
    public static void main(String[] args) {
        BiPredicate<Integer, Integer> p =(i, j)->i >10 && j>10;
        System.out.println(p.test(20, 20));
    }
}
