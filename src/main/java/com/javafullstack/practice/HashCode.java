package com.javafullstack.practice;
import com.javafullstack.Bike;
import com.javafullstack.Car;


public class HashCode {
    public static void main(String[] args) {
        Car c1 = new Car();
        Bike b1 = new Bike();
        System.out.println("Bike HahCode : "+b1.hashCode());
        System.out.println("Car HashCode : "+c1.hashCode());
        System.out.println();
    }
}
