package Arrays.subarrays;

import java.util.ArrayList;
import java.util.List;

/**
 * Largest Sum Contiguous Subarray (Kadane's Algorithm)
 */

public class MaximumSubarraySum {
    //Naive
    /**
     * {-3, 8, -2, 4, -5, 6}
     * res = -3
     * i = 0
     * curr = 0
     * j = 0
     * curr = 0+(-3) = -3
     * res = -3
     * j = 1
     * curr = -3+8 = 5
     * res = 5
     * j = 2
     * curr = 5+ -2 = 3
     * res = 5
     * j = 3
     * curr = 5 + 4 = 9
     * res = 9
     * j = 4
     * curr = 9 + -5 = 4
     * res = 9
     * j = 5
     * curr = 9 + 6 = 15
     * res = 15
     * 
     */
    static int maxSum(int arr[], int n){
        int res = arr[0];
        for(int i = 0; i < n; i++){
            int curr = 0;
            for(int j = i; j < n; j++){
                curr = curr+arr[j];
                res = Math.max(res,curr);
            }
        }
        return res;
    }
    /** Efficient Time:0(N)
     * arr = {-3, 8, -2, 4, -5, 6};
     * intially
     * res = -3
     * maxEnding = -3
     * 
     * i = 1
     * maxEnding = max(-3+8, 8) = 8
     * res = max(-3, 8) = 8
     * 
     * i = 2
     * maxEnding = max(8+-2, -2) = 6
     * res = max(8, 6) = 8
     * 
     * i = 3
     * maxEnding = max(8+4, 4) = 12
     * res = max(8, 12) = 12
     * 
     * i = 4
     * maxEnding = max(12-5, -5) = 7
     * res = max(12, 7) = 12
     * 
     * i = 5
     * maxEnding = max(7+6, 6) = 13
     * res = max(12, 13) = 13
     */
    static int maxSum2(int arr[], int n){
        int res = arr[0];
        int maxEnding = arr[0];
        for(int i =1; i < n; i++){
            maxEnding = Math.max(maxEnding+arr[i], arr[i]);
            res = Math.max(res,maxEnding);
        }
        return res;
    }

    static int[] maxAndMinSum(int arr[], int n){
        int maxSum = arr[0];
        int minSum = arr[0];
        int maxEnding = arr[0];
        int minEnding = arr[0];
        
        for(int i = 1; i < n; i++) {
            maxEnding = Math.max(maxEnding + arr[i], arr[i]);
            minEnding = Math.min(minEnding + arr[i], arr[i]);
            
            maxSum = Math.max(maxSum, maxEnding);
            minSum = Math.min(minSum, minEnding);
        }
        
        return new int[]{maxSum, minSum};
    }    

    public static int myApproach(int arr[], int n){

        List<Integer> list = new ArrayList<>();
        int maxSum = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++){
            list.clear();
            for(int j = i; j < n; j++){
                int sum=0;
                for(int k = 0; k < list.size(); k++){
                    sum = sum+list.get(k);
                }
                // System.out.println("Sum : " + sum);
                maxSum = Math.max(maxSum, sum);
                list.add(arr[j]);
            }
            //  System.out.println("list : " + list.toString());
            
        }
        return maxSum;

     }

     //Kadanes algorithm
     static int maxSubArraySum(int a[])
     {
         int size = a.length;
         int max_so_far = Integer.MIN_VALUE, max_ending_here
                                             = 0;
  
         for (int i = 0; i < size; i++) {
             max_ending_here = max_ending_here + a[i];
             if (max_so_far < max_ending_here)
                 max_so_far = max_ending_here;
             if (max_ending_here < 0)
                 max_ending_here = 0;
         }
         return max_so_far;
     }

    public static void main(String[] args) 
    {   
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        int n = arr.length;
        //System.out.print(maxSum(arr, n));
        System.out.println(maxSum2(arr, n));
        System.out.println(myApproach(arr, n));
    }
}
