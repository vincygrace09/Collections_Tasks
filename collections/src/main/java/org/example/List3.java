package org.example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class List3 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 2, 3, 5);
        Set<Integer> unique = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();
        for (Integer num : list) {
            if (!unique.add(num)) {
                duplicates.add(num);
            }
        }
        System.out.println("Duplicate elements: " + duplicates);
    }
}
