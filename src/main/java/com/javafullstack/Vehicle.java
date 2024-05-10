package com.javafullstack;

public interface Vehicle {
    public void start();
    public default void m1(){
        System.out.println("Bike has clean...");
    }
    public default void m2(){
       System.out.println("Bike repaired...");
    }
    public static void repaired(){
        System.out.println("Car has repaired..");
    }
    public default void m3(){
        System.out.println("Bus repaired...");
    }
    public default void m4(){
        System.out.println("Bus has clean...");
    }
    public static void clean(){
        System.out.println("Clean Has been Completed..");
    }
}
