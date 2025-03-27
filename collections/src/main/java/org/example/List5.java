package org.example;

import java.util.*;

public class List5 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 4, 5);
        Set<Integer> set = new HashSet<>(list);
        System.out.println("Converted Set: " + set);
        List<Integer> newList = new ArrayList<>(set);
        System.out.println("Converted List: " + newList);
    }
}
