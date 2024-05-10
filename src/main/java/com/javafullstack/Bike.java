package com.javafullstack;

public class Bike implements Vehicle{
    public static void main(String[] args) {
        Bike b = new Bike();
        b.start();
        b.m3();
        b.m4();
    }

    @Override
    public void start() {
        System.out.println("Bike has Started...");
    }

    @Override
    public void m1() {
        Vehicle.super.m1();

    }

    @Override
    public void m2() {
        Vehicle.super.m2();

    }
}
