package com.javafullstack;

public interface Vehicle2 {
    void startVehicle();
}

class Car2 implements Vehicle2 {
    public void startVehicle() {
        System.out.println("Car Has Started....");
    }

    public void start() {
    }
}

class Bike2 implements Vehicle2 {
    public void startVehicle() {
        System.out.println("Bike Started....");
    }
}

class Bus2 implements Vehicle2 {
    public void startVehicle() {
        System.out.println("Bus Started...");
    }
}

