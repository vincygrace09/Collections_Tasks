package org.example;

import java.util.HashSet;
import java.util.Set;

public class Set3 {
    public static void main(String[] args) {
        Set<String> vehicles = new HashSet<>();
        vehicles.add("Car");
        vehicles.add("Bike");
        vehicles.add("Bus");

        System.out.println("Vehicles: " + vehicles);
        vehicles.remove("Bus");
        System.out.println("After Removal: " + vehicles);
        System.out.println("Contains Car " + vehicles.contains("Car"));
    }
}
