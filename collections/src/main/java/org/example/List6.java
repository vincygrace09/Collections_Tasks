package org.example;

import java.util.*;

public class List6 {
    public static void rotateLeft(List<Integer> list, int pos) {
        Collections.rotate(list, -pos);
    }
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        rotateLeft(list, 2);
        System.out.println("Rotated List: " + list);
    }
}

