
/**
 * Longest Sub-Array with Sum 0 | Problem of the Day : 18/08/22 | Siddharth Hazra
 * https://www.youtube.com/watch?v=yDeNqw_dAU0
 * To find the largest subarray with a sum of 0, create an empty map that stores 
 * the first subarray’s ending index having a given sum. Then traverse the given array 
 * and maintain the sum of elements seen so far. If the sum is seen for the first time, 
 * insert the sum with its index into the map.
 * If the sum is seen before, there exists a subarray with a sum of 0, which ends at the 
 * current index, and update the largest subarray if the current subarray has more length.
 */
package Arrays;

import java.util.*;

public class MaxSubarrayWithZeroSumCount {
    /**Using Brute force
     * We can optimize the method to run in O(n2) time by calculating the subarray 
     * sum in constant time.
     * 
     */
    static int printAllSubarrays(int[] num, int n ){
        int sum = 0;
        int count = 0;
        for(int i = 0; i < n; i++){
            sum = num[i];
            for(int j = i+1; j < n; j++){
                sum = sum + num[j];
                if(sum == 0){
                    System.out.println("Subarray [" + i + "…" + j + "]");
                    count++;
                }
            }
        }
        return count;
    }
    public static int printAllSubarrays2(int[] nums, int n){
        // create an empty set to store the sum of elements of each
        // subarray `nums[0…i]`, where `0 <= i < nums.length`
        Map<Integer, Integer> map = new HashMap<>();
 
        int sum = 0;
        int count = 0;
 
        // traverse the given array
        for (int i = 0; i < n; i++){
            sum += nums[i];
            if(sum == 0){
                count++;
            }else{
                if (map.containsKey(nums[i]) == false) {
                    map.put(sum, 1);
                }else{
                    count+=map.get(sum);
                    map.put(sum, (map.get(sum)+1));
                }
            }
        }
 
        // we reach here when no subarray with zero-sum exists
        return count;
    }
    public static int printAllSubarrays3(int[] nums, int n){
        // create an empty set to store the sum of elements of each
        // subarray `nums[0…i]`, where `0 <= i < nums.length`
        Map<Integer, Integer> map = new HashMap<>();
 
        int sum = 0;

        // insert (0, -1) pair into the set to handle the case when a
        // subarray with zero-sum starts from index 0
        map.put(0, -1);

        // `len` stores the maximum length of subarray with zero-sum
        int len = 0;

        // traverse the given array
        for (int i = 0; i < n; i++){
            sum += nums[i];

            if(map.containsKey(nums[i])){
                if(len < i - map.get(sum)){
                    len = i - map.get(sum);
                }
            }else{
                map.put(sum, i);
            }
        }
 
        return len;
    }
    public static void main (String[] args)
    {
        int[] nums = {6, 3, -1, -3, 4, -2, 2, 4, 6, -12, -7};
        int n = nums.length;
        System.out.println("Count " + printAllSubarrays3(nums, n));
    }
}