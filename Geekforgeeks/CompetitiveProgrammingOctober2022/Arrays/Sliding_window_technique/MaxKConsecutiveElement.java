/**
 * Given an array of integers, and a number k, find the maximum sum of K 
 * consecutive elements
 */

package Arrays.Sliding_window_technique;

public class MaxKConsecutiveElement {
    /**
     * Time complexity is O(N - K)*K
     * {8,30,-5,20}
     * max_sum = -1
     * i = 0
     * sum = 0
     * j = 0
     * sum = + sum = arr[0+0]
     * j = 1
     * sum = + sum = arr[0+30
     * j = 2
     * sum = + sum = arr[0+0]]
     */
    public static int maxSum(int[] arr, int n, int k){
        int max_sum = Integer.MIN_VALUE;
        for(int i = 0; i+k-1 < n; i++){
            int sum = 0;
            for(int j = 0; j < k; j++){
                sum += arr[i+j];
            }
            max_sum = Math.max(max_sum, sum);
        }
        return max_sum;
    }
    /**
     * Sliding window technique: The linear time solution.
     * {1, 8, 30, -5, 20, 7} where k = 3
     * 1. Compute the sum of the first window. The is from 0 - 2 because k = 3
     * 2. We can get the sum of the next window in O(1) time. How? We sunstract the 1st 
     * element of the previous window and add the current window. Window = 1, 8, 30
     * window, in this case it is 1 and add the 1st element in the next window which is -5.
     * Window = 8, 30, -5
     * 3. We find the max between the max_sum and the curr
     * 
     */
    public static int maxSum2(int[] arr, int n, int k){
        int windowSum = 0;
        for(int i =0; i < k; i++){
            windowSum+=arr[i];
        }
        int maxSum = windowSum;
        for(int end = k; end < n; end++){
            windowSum+=arr[end] - arr[end-k];
            maxSum = Math.max(maxSum, windowSum);
        }
        return maxSum;
    }
    //Improved brute force Time: 0(n+k)
    public static int maxSum3(int[] arr, int n, int k){
        int mSum = Integer.MIN_VALUE;

        for(int i =0; i < n-k; i++){
            int wSum = 0;
            for(int j = i; j < i + k; j++){
                wSum +=arr[j];
            }
            mSum = Math.max(mSum, wSum);
        }
        return mSum;
    }
    static void main(String args[]) 
    { 
       int arr[] = {1, 8, 30, -5, 20, 7}, n = 6, k = 3;

       System.out.println(maxSum(arr, n, k));

    } 
}
