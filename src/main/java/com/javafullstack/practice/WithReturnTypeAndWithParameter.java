package com.javafullstack.practice;

public class WithReturnTypeAndWithParameter {
    int add(int a, int b) {
        int c = a + b;
        return c;
    }

    public static void main(String[] args) {
        WithReturnTypeAndWithParameter wrwp = new WithReturnTypeAndWithParameter();
        int result = wrwp.add(120, 200);
        System.out.println("Result : " + result);
    }
}
