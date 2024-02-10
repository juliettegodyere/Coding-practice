/**
 * Longest Increasing Subsequence (LIS)
 * Given an array arr[] of size N, the task is to find the length of the Longest Increasing Subsequence (LIS) i.e., the longest possible subsequence in which the elements of the subsequence are sorted in increasing order.

Examples: 

Input: arr[] = {3, 10, 2, 1, 20}
Output: 3
Explanation: The longest increasing subsequence is 3, 10, 20

Input: arr[] = {3, 2}
Output:1
Explanation: The longest increasing subsequences are {3} and {2}
Check other solutions here https://www.geeksforgeeks.org/longest-increasing-subsequence-dp-3/
 */
package Arrays;

public class LongestIncreasingSequence {
    // lis() returns the length of the longest
    // increasing subsequence in arr[] of size n
    static int lis(int arr[], int n)
    {
        int lis[] = new int[n];
        int i, j, max = 0;
 
        // Initialize LIS values for all indexes
        for (i = 0; i < n; i++)
            lis[i] = 1;
 
        // Compute optimized LIS values in
        // bottom up manner
        for (i = 1; i < n; i++)
            for (j = 0; j < i; j++)
                if (arr[i] > arr[j] && lis[i] < lis[j] + 1)
                    lis[i] = lis[j] + 1;
 
        // Pick maximum of all LIS values
        for (i = 0; i < n; i++)
            if (max < lis[i])
                max = lis[i];
 
        return max;
    }
 
    // Driver code
    public static void main(String args[])
    {
        int arr[] = {0,8,4,12,2,10,6,14,1,9,5,13,3,11,7,15};
        int n = arr.length;
 
        // Function call
        System.out.println("Length of lis is "
                           + lis(arr, n));
    }
}
