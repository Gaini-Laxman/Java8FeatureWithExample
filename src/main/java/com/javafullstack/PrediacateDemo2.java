package com.javafullstack;

import java.util.function.Predicate;

public class PrediacateDemo2 {
    public static void main(String[] args) {
        String[] names = {"Anitha", "Anuska","Vikramaditya","Veneeth"};
        Predicate<String> p = name->name.charAt(0) =='A';
        for(String name : names){
            if(p.test(name)){
                System.out.print(name+" ");
            }
        }
    }
}
