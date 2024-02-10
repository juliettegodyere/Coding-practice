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
    static int[] buildPrefixSum(int[] arr, int n){
        int [] prefix_sum = new int[n];

        prefix_sum[0] = arr[0];

        for(int i = 1; i <= n; i++){
            prefix_sum[i] = prefix_sum[i - 1] + arr[i];
        }
        return prefix_sum;
    }
    static int getsum2(int[] prefix_sum, int n, int right, int left){
        int sum = 0;
        if(left != 0){
            sum = prefix_sum[right]  - prefix_sum[left - 1];
        }else{
            sum = prefix_sum[right];
        }
        return sum;
    }
}
