/**
 * https://www.youtube.com/watch?v=N3UHZ4ir2Uk
 * https://www.techiedelight.com/find-largest-sub-array-formed-by-consecutive-integers/
 * Find the largest subarray formed by consecutive integers
 * Given an integer array, find the largest subarray formed by consecutive integers. 
 * The subarray should contain all distinct values.
 * For example,
 * Input:  { 2, 0, 2, 1, 4, 3, 1, 0 }
 * Output: The largest subarray is { 0, 2, 1, 4, 3 }
 * https://www.geeksforgeeks.org/length-largest-subarray-contiguous-elements-set-1/
 * Length of the largest subarray with contiguous elements | Set 1
 */
package Arrays;

import java.util.HashSet;

public class LargestSubarrayConsecutiveIntegers {
    // Utility functions to find minimum and maximum of
    // two elements
 
    static int min(int x, int y) 
    {
        return (x < y) ? x : y;
    }
 
    static int max(int x, int y) 
    {
        return (x > y) ? x : y;
    }
 
    // Returns length of the longest contiguous subarray
    static int findLength(int arr[], int n) 
    {
        int max_len = 1;  // Initialize result
        for (int i = 0; i < n - 1; i++) 
        {
            // Initialize min and max for all subarrays starting with i
            int mn = arr[i], mx = arr[i];
 
            // Consider all subarrays starting with i and ending with j
            for (int j = i + 1; j < n; j++) 
            {
                // Update min and max in this subarray if needed
                mn = min(mn, arr[j]);
                mx = max(mx, arr[j]);
 
                // If current subarray has all contiguous elements
                if ((mx - mn) == j - i)
                    max_len = max(max_len, mx - mn + 1);
            }
        }
        return max_len;  // Return result
    }

    public static void main (String[] args)
    {
        int[] A = {2, 0, 2, 1, 4, 3, 1, 0 };
 
        findLength(A, A.length);
    }
}
