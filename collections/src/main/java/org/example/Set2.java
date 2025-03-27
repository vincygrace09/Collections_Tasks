package org.example;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set2 {
    public static void main(String[] args) {
        Set<Integer> linkedHashSet = new LinkedHashSet<>(Arrays.asList(45, 78, 90, 1, 8, 0, 23));
        Set<Integer> treeSet = new TreeSet<>(linkedHashSet);

        System.out.println("LinkedHashSet: " + linkedHashSet);
        System.out.println("TreeSet: " + treeSet);
    }
}
