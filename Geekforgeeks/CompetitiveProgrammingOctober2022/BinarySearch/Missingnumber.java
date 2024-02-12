package BinarySearch;

import java.util.HashSet;
import java.util.Set;

public class Missingnumber {
    static int missingNumber(int array[], int n) {
        // Your Code Here
        int maxval = Integer.MIN_VALUE;
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < n; i++){
            maxval = Math.max(maxval, array[i]);
            set.add(array[i]);
        }
        System.out.println(set);

        for(int i = 1; i < maxval; i++){
            if(!set.contains(i)){
                return i;
            }
        }
        return 0;
    }

    /**
     * Approach 2 (Using summation of first N natural numbers): The idea behind the approach is to use the summation of the first N numbers.

    Find the sum of the numbers in the range [1, N] using the formula N * (N+1)/2. Now find the sum of all the elements in the array and subtract it from the sum of the first N natural numbers. This will give the value of the missing element.

    Follow the steps mentioned below to implement the idea:

    Calculate the sum of the first N natural numbers as sumtotal= N*(N+1)/2.
    Traverse the array from start to end.
    Find the sum of all the array elements.
    Print the missing number as SumTotal – sum of array
     * @param nums
     * @param n
     * @return
     */
    public static int getMissingNo(int[] nums, int n)
    {
       int sum = 0;
        for(int i=0;i<n;i++){
            sum = sum + nums[i];
        }
        return ((n * (n+1))/2 - sum);
    }
    public static void main(String[] args){
        int array[] = {6,1,2,8,3,4,7,10,5};
        int n = array.length;

        System.out.println(missingNumber(array, n));
    }
}
