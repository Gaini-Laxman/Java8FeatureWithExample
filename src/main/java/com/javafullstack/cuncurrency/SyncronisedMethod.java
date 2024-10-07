package com.javafullstack.cuncurrency;

public class SyncronisedExample{
    public static void main(String[] args) {
        Counter counter = new Counter();
        Thread t1 = new Thread(() -> {
            for (int i=0; i<1000; i++){
                counter.increament();
            }
        });
        Thread t2 = new Thread(() ->{
            for (int i=0; i<1000; i++){
                counter.increament();
            }
        });
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(counter.getCount());
    }
    
}
