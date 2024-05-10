package com.javafullstack;

public class MethodReference {
    public static void m2() {
        System.out.println("This is Method2");
    }
    public static void main(String[] args) {
        myInterface1 mi = MethodReference::m2;
        mi.m1();
    }

}
