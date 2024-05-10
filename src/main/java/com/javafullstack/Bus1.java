package com.javafullstack;

public class Bus1 implements Vehicle1{
    public static void main(String[] args) {
     Bus1 bus1 =new Bus1();
     bus1.m1();
     bus1.m2();
      bus1.start();

    }
    @Override
    public void start() {
        System.out.println("Bus1 has started..");
    }
    public void m1(){
        System.out.println("Bus1 has repaired..");
    }
    public void m2(){
        System.out.println("Bus1 has cleaned");
    }
}
