package com.javafullstack;

public interface Vehicle1 {
    public void start();
    public default void m1(){
        System.out.println("Car1 has repaired!!!");
    }
    public default void m2(){
        System.out.println("Car has Clean in Interface");
    }
    public static void clean(){
        System.out.println("Clean has been completed!!!");
    }
}
