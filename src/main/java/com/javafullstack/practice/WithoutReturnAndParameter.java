package com.javafullstack.practice;

public class WithoutReturnAndParameter {
    // without Return Type and Without Parameter
    void add() {
        int a = 10;
        int b = 20;
        int c = a + b;
        int d = a - b;

        System.out.println("Addition : " + c);
    }

    void sub() {
        int d = 20;
        int e = 10;
        //int c = a + b;
        int f = d - e;
        System.out.println("Subtraction :" + f);
    }

    public static void main(String[] args) {
        WithoutReturnAndParameter wrp = new WithoutReturnAndParameter();
        wrp.add();
        wrp.sub();
    }
}
