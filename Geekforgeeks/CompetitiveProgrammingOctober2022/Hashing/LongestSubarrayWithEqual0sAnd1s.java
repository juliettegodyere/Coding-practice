
/**
 * The idea is to replace every zero with -1 and compute
 * the subarray with zero sum. 
 */
package Hashing;

import java.util.*;

public class LongestSubarrayWithEqual0sAnd1s {
    public static void main (String[] args) {
        int arr[] = new int[]{1, 1, 1, 0, 1, 0, 1, 1, 1};
        int len = arr.length;
        
        System.out.println(largestZeroSubarray(arr, len));
    }
    
    static int largestZeroSubarray(int arr[], int n)
    {
        Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
        int sum = 0, maxLen = 0;
        for(int i = 0; i < n; i++)
             arr[i] = (arr[i] == 0) ? -1 : 1;
         
        for(int i = 0; i < n; i++){
            sum += arr[i];
            if (sum == 0)
                maxLen = i+1;
             
            if(hm.containsKey(sum) == true){
                // if(maxLen < i - hm.get(sum + n))
                //  maxLen = i - hm.get(sum + n);
                maxLen = Math.max(maxLen, i - hm.get(sum));
                
            }else {
                hm.put(sum, i);
            }
        }
        return maxLen;
    }
}
