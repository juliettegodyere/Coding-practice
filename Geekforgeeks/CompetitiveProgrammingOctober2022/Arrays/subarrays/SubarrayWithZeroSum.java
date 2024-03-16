
/**
 * Check if a subarray with 0 sum exists or not
 * Input:  { 3, 4, -7, 3, 1, 3, 1, -4, -2, -2 } 
 * Output: Subarray with zero-sum exists. The subarrays with a sum of 0 are: 
 * { 3, 4, -7 } 
 * { 4, -7, 3 } 
 * { -7, 3, 1, 3 } 
 * { 3, 1, -4 } 
 * { 3, 1, 3, 1, -4, -2, -2 } 
 * { 3, 4, -7, 3, 1, 3, 1, -4, -2, -2 }
 * Note that the problem deals with subarrays that are contiguous, i.e., 
 * whose elements occupy consecutive positions in the array.
 */
package Arrays.subarrays;

import java.util.*;

public class SubarrayWithZeroSum {
    /**Using Brute force
     * We can optimize the method to run in O(n2) time by calculating the subarray 
     * sum in constant time.
     * 
     */
    static void printAllSubarrays(int[] num, int n ){
        int sum = 0;

        for(int i = 0; i < n; i++){
            sum = num[i];
            for(int j = i+1; j < n; j++){
                sum = sum + num[j];
                if(sum == 0){
                    System.out.println("Subarray [" + i + "…" + j + "]");
                }
            }
        }
    }
    public static Boolean hasZeroSumSubarray(int[] nums)
    {
        // create an empty set to store the sum of elements of each
        // subarray `nums[0…i]`, where `0 <= i < nums.length`
        Set<Integer> set = new HashSet<>();
 
        // insert 0 into the set to handle the case when subarray with
        // zero-sum starts from index 0
        set.add(0);
 
        int sum = 0;
 
        // traverse the given array
        for (int value: nums){
            // sum of elements so far
            sum += value;
            System.out.println(sum);
            // if the sum is seen before, we have found a subarray with zero-sum
            if (set.contains(sum)) {
                return true;
            }
 
            // insert sum so far into the set
            set.add(sum);
        }
 
        // we reach here when no subarray with zero-sum exists
        return false;
    }
    public static void main (String[] args)
    {
        int[] nums = { 3, 4, -7, 3, 1, 3, 1, -4, -2, -2 };
        int n = nums.length;
        printAllSubarrays(nums, n);
        System.out.println(hasZeroSumSubarray(nums));
    }
}
