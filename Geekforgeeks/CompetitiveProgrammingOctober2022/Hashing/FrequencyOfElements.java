package Hashing;

import java.util.*;

public class FrequencyOfElements {
    static void getFreq(int arr[], int n){

        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < n; i++){
            //System.out.println(map.containsKey(arr[i]));
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }else{
                map.put(arr[i], 1);
            }
        }
        for(Map.Entry<Integer, Integer> m: map.entrySet()){
            System.out.println("Key: " + m.getKey() + " Values: " + m.getValue());
        }
    }
    static void getFreq2(int arr[], int n){

        Map<Integer, Integer> map = new HashMap<>();
        
        for(int x: arr){
            map.put(x, map.getOrDefault(x, 0)+1);
        }
        for(Map.Entry<Integer, Integer> m: map.entrySet()){
            System.out.println("Key: " + m.getKey() + " Values: " + m.getValue());
        }
    }
    public static void main(String[] args) 
	{   
        int arr[] = {10,12,10,15,12,20,12,10};
        int n = arr.length;
        
        getFreq2(arr,n);
	}
}
