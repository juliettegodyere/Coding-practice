package Arrays;

import java.util.ArrayList;
import java.util.List;

public class StrongestNeighbour {
    /**
     * Given an array arr[] of N positive integers. The task is to find the maximum for every adjacent pair in the array.

Examples:

Input: 1 2 2 3 4 5
Output: 2 2 3 4 5

Input: 5 5
Output: 5
     */

     static List<Integer> findStrongest(int []arr, int n){
        List<Integer> res = new ArrayList<>();
        int max = Integer.MIN_VALUE;

        for(int i = 1; i < n; i++){
            max = Math.max(arr[i], arr[i-1]);
            res.add(max);
        }
        return res;
     }

     public static void main(String[] args){
        int arr[] = {1, 2, 2, 3, 4, 5}, n = arr.length;

       System.out.println(findStrongest(arr, n));
     }
}
