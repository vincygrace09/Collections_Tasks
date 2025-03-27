package org.example;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Map3 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "A");
        map.put(3, "C");
        map.put(2, "B");
        map.put(5, "E");
        map.put(4, "D");

        System.out.println("Original Map: " + map);
        int searchKey = 2;
        String searchValue = "B";
        System.out.println("Contains Key " + searchKey + "? " + map.containsKey(searchKey));
        System.out.println("Contains Value '" + searchValue + "'? " + map.containsValue(searchValue));
        int keyToGet = 3;
        System.out.println("Value for Key " + keyToGet + ": " + map.get(keyToGet));
        TreeMap<Integer, String> sortedMap = new TreeMap<>(Comparator.reverseOrder());
        sortedMap.putAll(map);
        System.out.println("Sorted Map: " + sortedMap);
        map.clear();
        System.out.println("Map after deletion: " + map);
    }
}
