
/**
 * Pair with given sum in unsorted array
 * We have already discussed this question for sorted array during searching 
 * tutorial session. In that example, we used the two pointer technique. however,
 * that will not work in this case unless you sort the array will will lead to 
 * higher time complexity.
 */
package Hashing;

import java.util.HashSet;

public class PairWithGivenSum {
    public static void main (String[] args) {
        int arr[] = new int[]{3, 8, 4, 7, 6, 1};
        int len = arr.length;
        int x = 14;
        System.out.println(pairWithSumX(arr, len, x));
    }
    
    static int pairWithSumX(int arr[],int n, int X){
        HashSet<Integer> us = new HashSet<>();
        for(int i = 0; i < n; i++){
            if(us.contains(X - arr[i]))
              return 1;
              
            us.add(arr[i]);
        }
        return 0;
        
    }
}
