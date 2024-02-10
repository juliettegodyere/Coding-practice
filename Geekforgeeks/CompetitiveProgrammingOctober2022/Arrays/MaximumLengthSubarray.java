
/**
 * d maximum length subarray having a given sum 
 * find the maximum length subarray having a given sum.
 * 
 * nums[] = { 5, 6, -5, 5, 3, 5, 3, -2, 0 } 
 * target = 8 Subarrays with sum 8 are 
 * { -5, 5, 3, 5 } 
 * { 3, 5 } 
 * { 5, 3 } 
 * The longest subarray is { -5, 5, 3, 5 } 
 * having length 4
 */
package Arrays;

import java.util.*;

public class MaximumLengthSubarray {
    static void findMaxLenSubarray(int arr[], int n, int target){
        int len = 0;
        int left_idx = 0;
        int right_idx = 0;
        for(int i = 0; i < n; i++){
            int sum = 0;
            int count = 0;
            for(int j = i; j < n; j++){
                sum = sum+arr[j];
                count++;
                if(sum == target){
                    //System.out.println("[" + i + "," + j + "]");
                   // System.out.println("Count : " + count);
                    //res = Math.max(res, count);
                    if(len < count){
                        len = count;
                        left_idx = i;
                        right_idx = j;
                    }
                }
            }
        }
        //return res;
        System.out.println("[" + left_idx + "," + right_idx + "]");
    }
    /**
     * We can use a map to solve this problem in 
     * linear time. The idea is to create an empty 
     * map to store the first subarray’s ending index, 
     * having a given sum. We traverse the given array 
     * and maintain the sum of elements seen so far. 
     * If the target is seen for the first time, insert
     *  the sum with its index into the map. If target-S 
     * is seen before, there is a subarray with the given 
     * sum that ends at the current index, and we update 
     * the maximum length subarray having sum S if 
     * the current subarray has more length.
     * 
     * Initially
     * map(0, -1)
     * target = 0
     * len = 0
     * ending_index = -1
     * 
     * i = 0
     * target = 0 + 5 = 5
     * map.putIfAbsent(5, 0) Yes
     * map.containsKey(target - S) && len < i - map.get(target - S)
     * (map.containsKey(5 - 8 = -3) && 0 < 0 - (-3)) == NO
     * len = 0
     * ending_index = -1
     * 0 5
     * 
     * i = 1
     * target = 5 + 6 = 11
     * map.putIfAbsent(11, 1) yes
     * map.containsKey(target - S) && len < i - map.get(target - S)
     * (map.containsKey(11 - 8 = 3) && 0 < 1 - (3) = -2) == N0
     * len = 0
     * ending_index = -1
     * 0 5
     * 1 11
     * 
     * i = 2
     * target = 11 + (-5) = 6
     * map.putIfAbsent(6, 2)
     * map.containsKey(target - S) && len < i - map.get(target - S)
     * (map.containsKey(6 - 8 = -2) && 0 < 2 - (-2) = 4) == NO
     * len = 0
     * ending_index = -1
     * 0 5
     * 1 11
     * 2 6
     * 
     * i = 3
     * target = 6 + (5) = 11
     * //This line will be omitted because we already have 11
     * map.putIfAbsent(11, 3)
     * map.containsKey(target - S) && len < i - map.get(target - S)
     * (map.containsKey(11 - 8 = 3) & 0 < 3 - (3) = 0) == NO
     * len = 0
     * ending_index = -1
     * Value        key
     * 0            5
     * 1            11
     * 2            6
     * 
     * i = 4
     * target = 11 + (3) = 14
     * map.putIfAbsent(14, 4)
     * map.containsKey(target - S) && len < i - map.get(target - S)
     * (map.containsKey(14 - 8 = 6) && 0 < 4 - (6) = -2 no) == NO
     * len = 0
     * ending_index = -1
     * Value        key
     * 0            5
     * 1            11
     * 2            6
     * 4            14
     * 
     * i = 5
     * target = 14 + (5) = 19
     * map.putIfAbsent(19, 5)
     * map.containsKey(target - S) && len < i - map.get(target - S)
     * (map.containsKey(19 - 8 = 11) && 0 < 5 - (11) = -6 no) NO
     * len = 0
     * ending_index = -1
     * Value        key
     * 0            5
     * 1            11
     * 2            6
     * 4            14
     * 5            19
     * 
     * i = 6
     * target = 19 + (3) = 22
     * map.putIfAbsent(22, 6)
     * map.containsKey(target - S) && len < i - map.get(target - S)
     * (map.containsKey(22 - 8 = 14) && 0 < 6 - (14) = -8 no) NO
     * len = 0
     * ending_index = -1
     * Value        key
     * 0            5
     * 1            11
     * 2            6
     * 4            14
     * 5            19
     * 6            22
     * 
     * i = 7
     * target = 22 + (-2) = 20
     * map.putIfAbsent(20, 7)
     * (map.containsKey(20 - 8 == 12) && 0 < 7 - (12) = -5) == NO
     * len = 0
     * ending_index = -1
     * Value        key
     * 0            5
     * 1            11
     * 2            6
     * 4            14
     * 5            19
     * 6            22
     * 7            20
     * 
     * i = 8
     * target = 20 + (0) = 20
     * //This line will be omitted because we already have 20
     * map.putIfAbsent(20, 8)
     * (map.containsKey(20 - 8 = 12) && 0 < 8 - (12) = -4) == NO
     * 
     * I don't understand this solution
     *      * https://www.youtube.com/watch?v=yDeNqw_dAU0
     */
    public static void findMaxLenSubarray(int[] nums, int S){
        // create an empty HashMap to store the ending index of the first
        // subarray having some sum
        Map<Integer, Integer> map = new HashMap<>();
 
        // insert (0, -1) pair into the set to handle the case when a
        // subarray with sum `S` starts from index 0
        map.put(0, -1);
 
        int target = 0;
 
        // `len` stores the maximum length of subarray with sum `S`
        int len = 0;
 
        // stores ending index of the maximum length subarray having sum `S`
        int ending_index = -1;
 
        // traverse the given array
        for (int i = 0; i < nums.length; i++)
        {
            // sum of elements so far
            target += nums[i];
 
            // if the sum is seen for the first time, insert the sum with its
            // into the map
            map.putIfAbsent(target, i);
 
            // update length and ending index of the maximum length subarray
            // having sum `S`
            if (map.containsKey(target - S)){
                if(len < i - map.get(target - S)){
                    len = i - map.get(target - S);
                    ending_index = i;
                }
            }
        }
 
        // print the subarray
        System.out.println("[" + (ending_index - len + 1) + ", " + ending_index + "]");
    }
    /**
     *
     */

     public static void myApproach(int arr[], int n, int target){

        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < n; i++){
            list.clear();
            for(int j = i; j < n; j++){
                int sum=0;
                for(int k = 0; k < list.size(); k++){
                    sum = sum+list.get(k);
                }
                System.out.println("Sum : " + sum);
                if(sum == target){
                    System.out.println(list.toString());
                    return;
                }
                list.add(arr[j]);
            }
             System.out.println("list : " + list.toString());
            
        }
        System.out.println("Not found"); 

     }
    public static void main(String[] args) 
    {   
        int[] nums = { 5, 6, -5, 5, 3, 5, 3, -2, 0 };
        int target = 8;
        int n = nums.length;
        // findMaxLenSubarray(nums, n, target);
        // findMaxLenSubarray(nums, target);
        myApproach(nums, n, target);
    }
}
