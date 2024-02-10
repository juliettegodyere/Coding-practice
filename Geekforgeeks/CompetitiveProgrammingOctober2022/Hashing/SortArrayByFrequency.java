package Hashing;

/***
 * Naive Method:
1. Count the frequency of each element in the array using a HashMap.
2. Sort the array based on the frequency of elements using a custom comparator.
3. If two elements have the same frequency, sort them based on their original order in the array.
https://www.youtube.com/watch?v=IAUfxFDnPOc
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;


public class SortArrayByFrequency {
    static ArrayList<Integer> sortByFreq(int arr[], int n) {
        final HashMap<Integer, Integer> mapCount = new HashMap<Integer, Integer>();
        // final HashMap<Integer, Integer> mapIndex = new HashMap<Integer, Integer>();

        // Count the frequency of each element
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            list.add(arr[i]);
        }
        for (int i = 0; i < list.size(); i++) {
            mapCount.put(list.get(i), mapCount.getOrDefault(list.get(i), 0)+1);
            // if(mapCount.containsKey(arr[i])){
            //     mapCount.put(arr[i], mapCount.get(arr[i])+1);
            // }else{
            //      mapCount.put(arr[i], 1);
            //      mapIndex.put(arr[i], i);
            // }
        }
       
        Collections.sort(list, new Comparator<Integer>() {
            public int compare(Integer a, Integer b){
                int freq1 = mapCount.get(a);
                int freq2 = mapCount.get(b);
                if(freq1 != freq2){
                    return freq2 - freq1;
                }else{
                    // return mapIndex.get(a)-mapIndex.get(b);
                    return list.indexOf(a) - list.indexOf(b);
                }
            }
        });

        return list;
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 6, 3, 2, 5, 4, 8, 3, 1, 1, 2};
        int n = arr.length;

        ArrayList<Integer> sortedList = sortByFreq(arr, n);
        System.out.println(sortedList);
    }
}
