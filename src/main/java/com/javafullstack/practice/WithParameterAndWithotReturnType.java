package com.javafullstack.practice;

public class WithParameterAndWithotReturnType {
    void add(int a, int b){
        int c = a+b;
        System.out.println("Addition :"+c);
    }

    public static void main(String[] args) {
        WithParameterAndWithotReturnType wpwr = new WithParameterAndWithotReturnType();
        wpwr.add(30,30);
    }
}
