package com.javafullstack;


import java.util.function.Function;

public class FunctionDemo1 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 20, 10};
        Function<int[], Integer> sum = (index) -> index[0] + index[1] + index[2] + index[3] + index[4];

        System.out.println(sum.apply(arr));

    }
}
