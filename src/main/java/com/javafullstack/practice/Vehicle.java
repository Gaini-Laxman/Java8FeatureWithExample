package com.javafullstack.practice;

public abstract class Vehicle {
    public abstract void engine();
}

 class Car extends AbstractClass {
     @Override
     public void engine() {
         System.out.println("Car Engine");
     }
    public static void main(String[] args) {
        AbstractClass ab = new Car();
        ab.engine();
    }
 }