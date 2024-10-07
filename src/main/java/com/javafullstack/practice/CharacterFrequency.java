package com.javafullstack.practice;


import java.util.HashMap;
import java.util.Map;

public class CharacterFrequency {
    public static void main(String[] args) {
        String s = "Innovation";
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                int count = map.get(c) + 1; // Fix variable type and name
                map.put(c, count); // Update count in map
            } else {
                map.put(c, 1); // Add new character to map
            }
        }

        // Iterate over the entry set
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
