package Arrays.subarrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Maximum Product Subarray
 */

public class MaximumProductSubarray {
    static void maxSubarrayProduct(int arr[])
    {
        int n = arr.length;
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++){
            int result = 1;
            for(int j = i; j < n; j++){
                result = result * arr[j];
                max = Math.max(max, result);
                //System.out.println(result);
            }
        }
        System.out.println(max);
    }

      public static void main (String[] args)
    {
        int[] A = {-1, -3, -10, 0, 60};
 
        maxSubarrayProduct(A);
    }
}

