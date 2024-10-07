package com.javafullstack;

import java.util.Arrays;
import java.util.List;

public class FilterDemo1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 15, 20, 25, 30);
        list.stream().filter(i -> i >= 20).forEach(System.out::println);
    }

}
