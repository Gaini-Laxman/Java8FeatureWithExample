package com.javafullstack;

public class Bus implements Vehicle{
    public static void main(String[] args) {
        Bus bb = new Bus();
        bb.start();
        bb.m3();
        bb.m4();
    }
    @Override
    public void start() {
        System.out.println("Bus started...");

    }
}
