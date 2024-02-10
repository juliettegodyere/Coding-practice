/**Find a pair with the given sum in an array
 * Given an unsorted integer array, find a pair with the given sum in it.
 * For example,

Input:
 
nums = [8, 7, 2, 5, 3, 1]
target = 10
 
Output:
 
Pair found (8, 2)
or
Pair found (7, 3)
 
 
Input:
 
nums = [5, 2, 6, 8, 1, 9]
target = 12
 
Output: Pair not found

 * 
 */

package Arrays;

import java.util.*;

public class PairWithGivenSum {
     /**Brute force solution or naive solution
      *nums = [8, 7, 2]
      target = 10
      *i = 0
      * j = 1
      * nums[0] + nums[1] = 8+7 = 10 no
      * j = 2
      * nums[0] + nums[2] 8+2 == 10 yes
      * pair found (8,2)
      * i = 1
      * j = 2
      * nums[1] + nums[2] 7+2== 10 no
      * i = 2
      * j = 3
      * The time complexity of the above solution is O(n^2) and doesn’t require 
      any extra space, where n is the size of the input.
      *
      */
    public static void findPair(int[] nums, int target){
       int n = nums.length;
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                if(nums[i] + nums[j] == target){
                    System.out.println("Pair found (" + nums[i] + "," + nums[j] + ")");
                    return;
                }
            }
        }
        System.out.println("No Pair found");
    }
    /** 2. Using Sorting 
     * The idea is to sort the given array in ascending order and maintain 
     * search space by maintaining two indices (low and high) that initially 
     * points to two endpoints of the array. Then reduce the search space 
     * nums[low…high] at each iteration of the loop by comparing the sum of 
     * elements present at indices low and high with the desired sum. Increment 
     * low if the sum is less than the expected sum; otherwise, decrement high if 
     * the sum is more than the desired sum. If the pair is found, return it.
     * nums = [8, 2, 7]
     * target = 10
     * low = 0, high = 2
     * 8 + 7 = 15
     * low = 0, high = 1
     * 8+2 = 10 yes
     * pair found (8,2)
     * The time complexity of the above solution is O(n.log(n)) 
     * and doesn’t require any extra space.
     */
    public static void findPair2(int[] nums, int target){
        Arrays.sort(nums);
        int n = nums.length;
        int low = 0;
        int high = n-1;
        while(low < high){
            if(target == (nums[low] + nums[high]) ){
                System.out.println("Pair found (" + nums[low] + "," + nums[high] + ")");
                return;
            }else if(target < (nums[low] + nums[high])){
                low++;
            }else {
                high--;
            }
        }
        System.out.println("No Pair found");
    }
    /** 
     * Using Hashing 
     * We can use a hash table to solve this problem in linear time.
     *  The idea is to insert each array element nums[i] into a map. We 
     * also check if difference (nums[i], target - nums[i]) already exists 
     * in the map or not. If the difference is seen before, print the pair and return. 
     * The algorithm can be implemented as follows in C++, Java, and Python:
     * The time complexity of the above solution is O(n) and requires O(n) extra 
     * space, where n is the size of the input.
     * i = 0
     * map(0,0)
     * map.containsKey(10 - 8) = 2 - No
     * i = 1
     * map(8, 0)
     * map.containsKey(10 - 7) = 3 - No
     * i = 2
     * map(7,1)
     * map.containsKey(10 - 2) = 8 - yes
     * 
    */
    public static void findPair3(int[] nums, int target)
    {
        // create an empty HashMap
        Map<Integer, Integer> map = new HashMap<>();
 
        // do for each element
        for (int i = 0; i < nums.length; i++)
        {
            // check if pair (nums[i], target-nums[i]) exists
 
            // if the difference is seen before, print the pair
            if (map.containsKey(target - nums[i])){
                System.out.printf("Pair found (%d, %d)", nums[map.get(target - nums[i])], nums[i]);
                return;
            }
 
            // store index of the current element in the map
            map.put(nums[i], i);
        }
 
        // we reach here if the pair is not found
        System.out.println("Pair not found");
    }
    

    public static void main (String[] args)
    {
        int[] nums = { 8, 7, 2 };
        int target = 10;
 
        //findPair(nums, target);
        //findPair2(nums, target);
        findPair3(nums, target);
    }

    
}
