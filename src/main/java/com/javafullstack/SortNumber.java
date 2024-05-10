package com.javafullstack;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortNumber {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(4, 5, 7, 1, 9, 0);
        list.sort((i, j) -> (i < j) ? -1 : 1);
        System.out.println(list);
    }
}
