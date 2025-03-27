package org.example;

import java.util.TreeMap;

public class Map2 {
    public static void main(String[] args) {
        TreeMap<String, Integer> map1 = new TreeMap<>();
        map1.put("A", 1);
        map1.put("B", 2);

        TreeMap<String, Integer> map2 = new TreeMap<>(map1);
        System.out.println(map2);
    }
}
