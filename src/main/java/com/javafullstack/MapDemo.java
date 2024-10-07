package com.javafullstack;

import java.util.Arrays;
import java.util.List;

public class MapDemo {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("india", "uk","usa" );
        names.stream().map(String::toUpperCase).map(n->n+"-"+n.length()).forEach(System.out::println);
    }
}
