package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class List2 {
    public static void main(String[] args){
        List<String> name = Arrays.asList("Arun","Varun","Swea","Rahul");
        System.out.println("Before: " + name);
        Collections.replaceAll(name, "Arun", "Varun");
        System.out.println("After: " + name);

    }
}
