package org.example;

import java.util.HashMap;
import java.util.Map;

public class Map1 {
    public static void main(String[] args) {
        Map<String, Integer> city = new HashMap<>();
        city.put("Hyd", 8419600);
        city.put("Pune", 3980400);

        System.out.println(city);
    }
}
