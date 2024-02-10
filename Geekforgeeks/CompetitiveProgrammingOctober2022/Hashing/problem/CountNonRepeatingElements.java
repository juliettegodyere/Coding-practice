package Hashing.problem;

import java.util.*;

public class CountNonRepeatingElements {
    static long countNonRepeated(int arr[], int n)
    {
        // add your code
       Map<Integer, Integer> map = new HashMap<>();
       long count = 0;
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
                count++;
            }
        }
        //System.out.println(Arrays.toString(map));
        return count;
    }
    public static void main(String[] args) 
	{   
        int arr[] = {1,1,2,2,3,3,4,5,6,7};
        int n = arr.length;
        System.out.println(countNonRepeated(arr,n));
	}
}
