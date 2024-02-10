/**
 * Also check out MoveZerosToEnd.java file
 * A simple solution would be to count the total 
 * number of 0’s present in the array, say k, and 
 * fill the first k indices in the array by 0 and 
 * all remaining indices by 1. Alternatively, we can 
 * count the total number of 1’s present in the array k 
 * and fill the last k indices in the array by 1 and all 
 * remaining indices by 0. This approach is demonstrated 
 * below in C, Java, and Python:
 */

package Arrays;

import java.util.Arrays;

public class SortBinaryArray {
    /**
     * The time complexity of the above solution is O(n) 
     * and doesn’t require any extra space, where n 
     * is the size of the input.
     * 
     */
    static int[] sort(int[] nums, int n){
        int count = 0;
        for(int i = 0; i < n; i++){
            if(nums[i] == 0){
                int temp = nums[i];
                nums[i] = nums[count];
                nums[count] = temp;
                count++;
            }
        }
        return nums;
    }

    /**
     * Method 2
     * Instead of counting the total number of zeroes, 
     * if the current element is 0, we can place 0 at 
     * the next available position in the array. After 
     * all elements in the array are processed, we fill 
     * all remaining indices by 1. Following is the C++, 
     * Java, and Python program that demonstrates it:
     * The time complexity of the above solution is O(n)
     *  and doesn’t require any extra space, where n is 
     * the size of the input.
     */
    static void sort2(int[] nums, int n){
        int k = 0;
        for(int i = 0; i < n; i++){
            if(nums[i] == 0){
                nums[k] = 0;
                k++;
            }
        }
        for(int i = k; i < n; i++){
            nums[k] = 1;
            k++;
        }
    }
    public static void main (String[] args)
    {
        int[] nums = { 0, 0, 1, 0, 1, 1, 0, 1, 0, 0 };
        int n = nums.length;
        sort2(nums, n);
        System.out.println(Arrays.toString(nums));
    }
}
