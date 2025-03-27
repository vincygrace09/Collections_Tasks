package org.example;
import java.util.*;
public class ListOperations {
        public static void main(String[] args) {
            List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
            List<Integer> list2 = new ArrayList<>(Arrays.asList(3, 4, 5, 6));
            System.out.println("List 1: " + list1);
            System.out.println("List 2: " + list2);
            System.out.println("Are Lists Equal ?" + list1.equals(list2));
            List<Integer> joinedList = new ArrayList<>(list1);
            joinedList.addAll(list2);
            System.out.println("Joined List: " + joinedList);
            List<Integer> clonedList = new ArrayList<>(list1);
            System.out.println("Cloned List from List 1: " + clonedList);
        }

}
