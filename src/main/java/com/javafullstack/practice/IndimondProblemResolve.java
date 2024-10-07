package com.javafullstack.practice;

interface A {
    default void check(){
        System.out.println("Class A");
    }
}
interface B extends A{
    default void check(){
        System.out.println("Class B");
    }
}
interface C extends A {
    @Override
    default void check() {
        System.out.println("Class C");
    }
}
class D implements B, C {
    @Override
    public void check() {
        B.super.check();
        C.super.check();

        System.out.println("Class D");
    }
}
public class IndimondProblem {
    public static void main(String[] args) {
        D d = new D();
        d.check();
    }
}
