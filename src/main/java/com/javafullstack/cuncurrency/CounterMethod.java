package com.javafullstack.cuncurrency;

public class Counter {
    private int count = 0;
     //syncronization method
    public synchronized void increament(){
        count++;
    }
    public int getCount(){
        return count;
    }
}
