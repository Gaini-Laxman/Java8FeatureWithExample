package com.javafullstack;

public class LambdaExpressionDemo {
    interface MyFunctionalInterface {
        void calculate(int a, int b, int c);
    }

    static MyFunctionalInterface sum = (a, b, c) -> System.out.println("Sum : " + (a + b + c));

    public static void main(String[] args) {
        int a = 10, b = 20, c = 30;
        sum.calculate(a, b, c);
    }
}

