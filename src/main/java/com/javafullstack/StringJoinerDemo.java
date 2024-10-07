package com.javafullstack;

import java.util.StringJoiner;

public class StringJoinerDemo {
    public static void main(String[] args) {
        StringJoiner sj = new StringJoiner("-");
        sj.add("Laxman");
        sj.add("Java Fullstack");
        sj.add("Developer");
        System.out.println("String Join : "+sj);
    }
}
