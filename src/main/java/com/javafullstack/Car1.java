package com.javafullstack;

public class Car1 implements Vehicle1{
    public static void main(String[] args) {
        Car1 car1 = new Car1();
        car1.start();
        car1.m1();
        car1.m2();
        car1.m3();
    }

    @Override
    public void start() {
        System.out.println("Car1 has started...");
    }
    public void m3(){
        System.out.println("Car has cleaned in Class...");
    }
}
