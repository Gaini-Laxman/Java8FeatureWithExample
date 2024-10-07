package com.javafullstack;

public class Car implements Vehicle {
    public static void main(String[] args) {
        Car2 c = new Car2();
        Vehicle.repaired();
        Vehicle.clean();
        c.start();


    }
    @Override
    public void start() {
        System.out.println("Car Started...");
    }
}
