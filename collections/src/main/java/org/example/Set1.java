package org.example;

import java.util.Iterator;
import java.util.Set;
import java.util.*;
public class Set1 {
    public static void main(String[] args) {
        Set<String> months = new HashSet<>(Arrays.asList("Jan", "Feb", "March", "April"));
        for (String month : months) {
            System.out.println(month);
        }
    }
}
