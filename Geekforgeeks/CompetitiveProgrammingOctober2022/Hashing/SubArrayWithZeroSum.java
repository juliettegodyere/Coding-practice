package Hashing;

import java.util.*;

public class SubArrayWithZeroSum {
    public static void main (String[] args) 
    {
        int arr[] = new int[]{5, 3, 9, -4, -6, 7, -1};
        int n = arr.length;
        
        System.out.println(ZeroSumSubarray(arr, n));
        
    }
    
    //The idea is to use prefix sum and hashing technic together
    static int ZeroSumSubarray(int arr[], int n)
    {
        Set<Integer> us = new HashSet<Integer>();
        int prefix_sum = 0;
        us.add(0);
        for(int i = 0; i < n; i++)
        {
            prefix_sum += arr[i];
            if(us.contains(prefix_sum) == true)
              return 1;
            if(prefix_sum == 0){
                return 1;
            } 
            us.add(prefix_sum);
        }
        
        return 0;
    }
}
