package com.javafullstack.cuncurrency;

import java.util.concurrent.locks.ReentrantLock;

public class CountetReentrant {
    private int count = 0;
    private ReentrantLock lock = new ReentrantLock();

    public void increament(){
        lock.lock();
        try {
            count++;
        }finally {
            lock.unlock();
        }
    }

    public int getCount() {
        return count;
    }
}
