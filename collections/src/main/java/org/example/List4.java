package org.example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class List4 {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4);
        List<Integer> list2 = Arrays.asList(3, 4, 5, 6);

        Set<Integer> unique = new HashSet<>(list1);
        unique.addAll(list2);

        Set<Integer> same = new HashSet<>(list1);
        same.retainAll(list2);

        unique.removeAll(same);
        System.out.println("Unique elements: " + unique);
    }
}
