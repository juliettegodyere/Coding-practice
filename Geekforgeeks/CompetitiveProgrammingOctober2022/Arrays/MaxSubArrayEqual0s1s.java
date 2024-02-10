/**
 * Find the largest subarray having an equal number of 0’s and 1’s
 * Given a binary array containing 0’s and 1’s, find the largest subarray with equal numbers of 0’s and 1’s.
 * For example,
 * Input:  { 0, 0, 1, 0, 1, 0, 0 }
 * Output: Largest subarray is { 0, 1, 0, 1 } or { 1, 0, 1, 0 }
 * https://www.techiedelight.com/find-maximum-length-sub-array-equal-number-0s-1s/
 */
package Arrays;

import java.util.HashMap;
import java.util.Map;

public class MaxSubArrayEqual0s1s {
    /**
     * A naive solution would be to consider all subarrays and, for each subarray, 
     * count the total number of 0’s and 1’s present. If the subarray contains an equal 
     * number of 0’s and 1’s, update the largest subarray if required. The time complexity 
     * of the naive solution is O(n3) as there are n2 subarrays in an array of size n, and it 
     * takes O(n) time to find count 0’s and 1’s. We can optimize the method to run in O(n2) 
     * time by calculating the count of 0’s and 1’s in constant time.
     * 
     */
    static String findEqual0s1sSub(int[] nums, int n){
        
        int left_idx = 0;
        int right_idx = 0;
        int max_count_0 = 0;
        int max_count_1 = 0;

        for(int i = 0; i < n; i++){
            int count_0 = 0;
            int count_1 = 0;
            int j = 0;
            for(j = i; j < n; j++){
                if(nums[j] == 0){
                    count_0++;
                }
                if(nums[j] == 1){
                    count_1++;
                }
                //System.out.println("Count 0 " + count_0);
                //System.out.println("Count 1 " + count_1);
                if(count_0 == count_1){
                    if(max_count_0 < count_0){
                        max_count_0 = count_0;
                        left_idx = i;
                    }
                    if(max_count_1 < count_1){
                        max_count_1 = count_1;
                        right_idx = j;
                    }
                }
            }
            
        }
        return "[" + left_idx + ", " + right_idx +"]";

    }
    /**
     * We can use the map to solve this problem in linear time. The idea is to replace 0 with -1 and 
     * find out the largest subarray with a sum of 0. To find the largest subarray with a sum of 0, 
     * create an empty map that stores the first subarray’s ending index having a given sum. 
     * Then traverse the given array and maintain the sum of elements seen so far.
     * If the sum is seen for the first time, insert the sum with its index into the map.
     * If the sum is seen before, there exists a subarray with a sum of 0, which ends at the current index, 
     * and update the largest subarray if the current subarray has more length.
     */
    // Function to find the largest subarray having an equal number
    // of 0's and 1's
    public static String findEqual0s1sSub2(int[] nums, int n)
    {
        // create an empty `HashMap` to store the ending index of the first
        // subarray having some sum
        Map<Integer, Integer> map = new HashMap<>();
 
        // insert (0, -1) pair into the set to handle the case when a
        // subarray with zero-sum starts from index 0
        map.put(0, -1);
 
        // `len` stores the maximum length of subarray with zero-sum
        int len = 0;
 
        // stores ending index of the largest subarray having zero-sum
        int ending_index = -1;
 
        int sum = 0;
 
        // Traverse through the given array
        for (int i = 0; i < nums.length; i++)
        {
            // sum of elements so far (replace 0 with -1)
            sum += (nums[i] == 0)? -1: 1;
 
            // if the sum is seen before
            if (map.containsKey(sum))
            {
                // update length and ending index of largest subarray having zero-sum
                if (len < i - map.get(sum))
                {
                    len = i - map.get(sum);
                    ending_index = i;
                }
            }
            // if the sum is seen for the first time, insert the sum with its
            // index into the map
            else {
                map.put(sum, i);
            }
        }
 
        // print the subarray if present
        if (ending_index != -1)
        {
            return "[" + (ending_index - len + 1) + ", " +
                                    ending_index + "]";
        }
        else {
            return "No subarray exists";
        }
    }
    public static void main(String[] args) 
    {   
        int[] nums = {0, 0, 1, 0, 1, 0, 0};
        int n = nums.length;
        System.out.println(findEqual0s1sSub(nums, n));
        System.out.println(findEqual0s1sSub2(nums, n));
    }
}
