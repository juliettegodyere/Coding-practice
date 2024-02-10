package Hashing;

import java.util.*;

public class CountDistinctElements {
    static int countElements(int arr[], int n){

        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < n; i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i], 1);
            }
        }
        return map.size();
    }
    static int countElements2(int arr[], int n){

        HashSet<Integer> set = new HashSet<>();
        
        for(int i = 0; i < n; i++){
            set.add(arr[i]);
        }
        return set.size();
    }
    //Improved method. Time: 0(N), space 0(N)
    static int countElements3(Integer arr[], int n){

        HashSet<Integer> set = new HashSet<>(Arrays.asList(arr));
        
        return set.size();
    }
    public static void main(String[] args) 
	{   
        int arr[] = {15,12,13,12,13,13,18};
        Integer arr2[] = {15,12,13,12,13,13,18};
        int n = arr.length;
        System.out.println(countElements(arr,n));
        System.out.println(countElements3(arr2,n));
	}
}
