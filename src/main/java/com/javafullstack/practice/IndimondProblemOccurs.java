package com.javafullstack.practice;

class A {
    void check() {
        System.out.println("Class A");
    }
}

class B extends A {
    void check() {
        System.out.println("Class B");
    }
}

class C extends A {
    void check() {
        System.out.println("Class C");
    }
}

// This would cause a diamond problem in a language supporting multiple inheritance
class D extends B, C {
    // The compiler would have to resolve which check() method to use
}
class IndimondProblemOccurs{
    public static void main(String[] args) {
        D d = new D();
        d.check();

    }
}
