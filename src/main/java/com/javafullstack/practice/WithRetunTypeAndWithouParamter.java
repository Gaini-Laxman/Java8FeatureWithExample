package com.javafullstack.practice;

public class WithRetunTypeAndWithouParamter {
    int add(){
        int a = 50;
        int b = 60;
        int c =  a+b;
        return c ;
    }

    public static void main(String[] args) {
        WithRetunTypeAndWithouParamter wrwp = new WithRetunTypeAndWithouParamter();
        int sum = wrwp.add();
        System.out.println("Addition :"+ sum);
    }
}
