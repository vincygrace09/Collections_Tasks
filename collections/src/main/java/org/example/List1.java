package org.example;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class List1 {
    public static void main(String[] args){
        ArrayList<Integer> age =new ArrayList<>(10);
        age.add(12);
        age.add(43);
        age.add(21);
        age.add(28);
        System.out.println("Capacity before trim: " + age.size());
        age.trimToSize();
        System.out.println("Capacity after trim: " + age.size());

    }
}
