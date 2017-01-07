package arrayacollections;


import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Treemap_Hashmap {
    public static void main(String[] args) {

        Map<Integer, Integer> unsortMap = new HashMap<Integer, Integer>();
        unsortMap.put(1000, 10);
        unsortMap.put(1004, 5);
        unsortMap.put(1006, 6);
        unsortMap.put(1007, 20);
        unsortMap.put(1009, 1);
        unsortMap.put(1008, 7);
        unsortMap.put(1003, 8);
        unsortMap.put(1002, 99);
        unsortMap.put(1001, 50);
        unsortMap.put(1005, 2);
        

        System.out.println("Unsort Map......");
        printMap(unsortMap);

        System.out.println("\nSorted Map......By Value");
        Map<Integer, Integer> sortedMap = sortByValue(unsortMap);
        printMap(sortedMap);

    }

    private static <unsortMap> Map<Integer,Integer> sortByValue(Map<Integer, Integer> unsortMap) {

        // 1. Convert Map to List of Map
        List<Map.Entry<Integer, Integer>> list =
                new LinkedList<Map.Entry<Integer, Integer>>(unsortMap.entrySet());

        // 2. Sort list with Collections.sort(), provide a custom Comparator
        //    Try switch the o1 o2 position for a different order
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            public int compare(Map.Entry<Integer, Integer> o1,
                               Map.Entry<Integer, Integer> o2) {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });

        // 3. Loop the sorted list and put it into a new insertion order Map LinkedHashMap
        Map<Integer, Integer> sortedMap = new LinkedHashMap<Integer, Integer>();
        for (Map.Entry<Integer, Integer> entry : list) {
        	sortedMap.put(entry.getKey(), entry.getValue());
        }
        return sortedMap;
    }

    public static <K, V> void printMap(Map<K, V> map) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            System.out.println("Key : " + entry.getKey()
                    + " Value : " + entry.getValue());
        }
    }

}