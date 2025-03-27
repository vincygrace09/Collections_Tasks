package org.example;

import java.util.Map;
import java.util.TreeMap;

public class Map4 {
    public static void main(String[] args) {
        Map<String, Double> personMap = new TreeMap<>();
        personMap.put("Bob", 6.0);
        personMap.put("Alice", 5.6);
        personMap.put("Charlie", 5.9);

        personMap.remove("Charlie");
        System.out.println(personMap);
    }
}
