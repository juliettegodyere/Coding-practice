package Hashing.problem;

import java.util.*;

public class PrintNonRepeatedElements {
    static ArrayList<Integer> printNonRepeated(int arr[], int n)
    {
        // add your code
       Map<Integer, Integer> map = new HashMap<>();
       ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }else{
                map.put(arr[i], 1);
            }
        }
        for(Map.Entry<Integer, Integer> mp: map.entrySet()){
            //System.out.println(mp.getKey() + " " + mp.getValue());
            if(mp.getValue() == 1){
                //count++;
               // System.out.print(mp.getKey() + " ");
                list.add(mp.getKey());
            }
        }
        System.out.println(map);
        return list;
    }
    static ArrayList<Integer> printNonRepeated2(int arr[], int n)
    {
        // add your code
       ArrayList<Integer> list = new ArrayList<>();
       for(int i = 0; i < n; i++){
        list.add(arr[i]);
       }
       
        for(int i = 0; i < n; i++){
            if(list.contains(arr[i])){
                //list.remove(i);
            }else{
                //set.add(arr[i]);
                list.add(arr[i]);
            }
        }
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(arr.length);
        return list;
    }
    //Correct Implementation
    static ArrayList<Integer> printNonRepeatedCorrect(int arr[], int n)
    {
        // add your code here
        Map<Integer, Integer> linkedHashMap = new LinkedHashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < n; i++){
            linkedHashMap.put(arr[i], linkedHashMap.getOrDefault(arr[i], 0)+1);
        }
        
        for (Map.Entry<Integer, Integer> entry : linkedHashMap.entrySet()) {
            if (entry.getValue() == 1) {
                list.add(entry.getKey());
            }
        }
        return list;
    }
    public static void main(String[] args) 
	{   
        int arr[] = {1,1,2,2,3,3,4,5,6,7};
        int n = arr.length;
        System.out.println(printNonRepeatedCorrect(arr,n));
	}
}
