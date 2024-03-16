/**
 * Given a fixed array and multiple queries of following type in the array.
 * How to efficiently perform this queries.
 * arr[] = {2,8,3,9,6,5,4}
 * getSum(0,2)
 * getSum(1,3)
 * get(2,6)
 * output(13,20,27)
 */

package Arrays.Prefix_sum;

public class prefix_sum {
    /**
     * A simple solution is to run a loop. worst case complexity O(N) time
     */
    static int getSum(int[] arr, int n, int right, int left){
        int sum = 0;
        for(int i = left; i <= right; i++){
            sum +=arr[i];
        }
        return sum;
    }
    /**
     * A prefix sum array is an array which has sum of elements from 0 - 1
     * at index i. 
     * arr[] = {2,8,3,9,6,5,4} for this array
     * prefix_sum = [2, 10, 13,22, 28,33,37]
     * It will take O(N) time to build the prefix sum array
     */
    public static int[] calculatePrefixSum(int[] arr, int n) {
        int[] prefixSum = new int[n];
        prefixSum[0] = arr[0];

        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }

        return prefixSum;
    }
    public static int getSubarraySum(int[] prefixSum, int n, int start, int end) {
        if (start == 0) {
            return prefixSum[end];
        } else {
            return prefixSum[end] - prefixSum[start - 1];
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 3, -2, 4, -1, 2, 1, -5, 4};
        int[] prefixSum = calculatePrefixSum(arr, arr.length);

        int start = 3;
        int end = 5;
        int sum = getSubarraySum(prefixSum, arr.length, start, end);
        System.out.println("Sum of subarray [" + start + ", " + end + "]: " + sum);
    }
}
