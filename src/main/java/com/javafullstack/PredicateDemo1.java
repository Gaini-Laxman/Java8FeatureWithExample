package com.javafullstack;

import java.util.function.Predicate;

public class PredicateDemo1 {
    public static void main(String[] args) {
        String[] names = {"Anitha", "Anuska", "Mounika", "Manisha","Laxman", "Leela","VikaramAditya","Vineeta"};
        Predicate<String> p = name -> name.charAt(0)=='A';
        for (String name : names){
            if (p.test(name)){
                System.out.println(name);
            }
        }
    }
}
