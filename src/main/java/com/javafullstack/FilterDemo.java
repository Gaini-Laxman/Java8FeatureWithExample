package com.javafullstack;

import java.util.Arrays;
import java.util.List;

public class FilterDemo {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Anitha", "Anuska","Anupama","Laxman","Leela");
        names.stream().filter(n->n.startsWith("A")).forEach(System.out::println);
    }
}
