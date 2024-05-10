package com.javafullstack;

import java.util.Random;
import java.util.stream.Collectors;

public class RandomCharacterGenerator {

    private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        String randomString = generateRandomString(5);
        System.out.println("Random String: " + randomString);
    }

    public static String generateRandomString(int length) {
        return RANDOM.ints(length, 0, CHARACTERS.length())
                .mapToObj(CHARACTERS::charAt)
                .map(Object::toString)
                .collect(Collectors.joining());
    }
}


