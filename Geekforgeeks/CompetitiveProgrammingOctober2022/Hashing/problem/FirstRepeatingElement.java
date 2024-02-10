package Hashing.problem;

import java.util.*;

public class FirstRepeatingElement {
    public static int firstRepeated(int[] arr, int n) {
        // Your code here
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<n;i++)
        {
            if(hm.containsKey(arr[i]))
                hm.put(arr[i],hm.get(arr[i])+1);
            else
                hm.put(arr[i],1);
        }
        for(int i=0;i<n;i++) 
        {
            if(hm.get(arr[i]) > 1)
                return i+1;
        }
        return -1;
    }

     public static int firstRepeated2(int[] arr, int n) {
        // Your code here
        Map<Integer,Integer> lm = new LinkedHashMap<>();
        for(int i=0;i<n;i++) {
            lm.put(arr[i], lm.getOrDefault(arr[i], 0)+1);
        }
        for(Map.Entry<Integer,Integer> entry: lm.entrySet()){
            if(entry.getValue() > 1)
                return entry.getKey();
        }
        return -1;
    }

    
    public static void main(String[] args) 
	{   
        int arr[] = {1, 2, 2, 1, 3, 4, 4};
        int n = arr.length;
        System.out.println(firstRepeated2(arr,n));
	}
}
