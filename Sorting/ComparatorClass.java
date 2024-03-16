package Sorting;

import java.util.*;

public class ComparatorClass {
    public static void main(String[] args) {
       // List<String> list = new ArrayList<>(Arrays.asList("Bread", "Rice", "Bean"));
        //Collections.sort(list, Comparator.reverseOrder());
        // List<Integer> num = new ArrayList<>(Arrays.asList(20, 1, 100, 5));

        // Collections.sort(list, (s1, s2) -> s1.compareTo(s2));
        //Collections.sort(list, (s1, s2) -> s2.compareTo(s1));

        // Optional<Integer> getMin = num.stream().min((s1, s2) -> s1.compareTo(s2));
        // Optional<Integer> getMax = num.stream().max((s1, s2) -> s1.compareTo(s2));
        // System.out.println(getMin.get());
        // System.out.println(getMax.get());

       // System.out.println(list);

        // Create a HashMap
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(3, "Three");
        hashMap.put(1, "One");
        hashMap.put(2, "Two");

        // Convert HashMap to List of Map.Entry
        List<Map.Entry<Integer, String>> entryList = new ArrayList<>(hashMap.entrySet());

        // Sort the list using Comparator
        // Collections.sort(entryList, new Comparator<Map.Entry<Integer, String>>() {
        //     @Override
        //     public int compare(Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2) {
        //         // Compare entries based on keys
        //         return o1.getKey().compareTo(o2.getKey());
        //     }
        // });

        //Simplified
        Collections.sort(entryList, (entry1, entry2) -> entry1.getKey().compareTo(entry2.getKey()));

        // Print the sorted entries
        for (Map.Entry<Integer, String> entry : entryList) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }

}
