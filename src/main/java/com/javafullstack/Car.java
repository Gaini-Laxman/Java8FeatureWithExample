package com.javafullstack;

public class Car implements Vehicle {
    public static void main(String[] args) {
        Car c = new Car();
        Vehicle.repaired();
        Vehicle.clean();
        c.start();


    }
    @Override
    public void start() {
        System.out.println("Car Started...");
    }
}
