package DynamicProgramming;

/**
 * Longest Bitonic Subarray Problem
 * The Longest Bitonic Subarray (LBS) problem is to find a subarray of a given sequence in which 
 * the subarray’s elements are first sorted in increasing order, then in decreasing order, and the 
 * subarray is as long as possible. Strictly ascending or descending subarrays are also accepted.
 * https://www.youtube.com/watch?v=k4vMVTp6AuI
 * The problem differs from the problem of finding the longest bitonic subsequence. Unlike subsequences, 
 * subarrays are 
 * required to occupy consecutive positions within the original array.
The idea is to maintain two arrays, I[] and D[]:

I[i] store the length of the longest increasing subarray, ending at arr[i].
D[i] store the length of the longest decreasing subarray, starting from arr[i].
Finally, the length of the longest bitonic subarray is maximum among all I[i] + D[i] - 1. We can also 
keep track of two endpoints of the longest bitonic subarray found so far to print LBS.
https://www.techiedelight.com/find-longest-bitonic-subarray-array**/

public class LengthOfBitonicSubsequence {
    static int lbs( int arr[], int n )
    {
        int i, j;
 
        /* Allocate memory for LIS[] and initialize LIS values as 1 for
            all indexes */
        int[] lis = new int[n];
        for (i = 0; i < n; i++)
            lis[i] = 1;
 
        /* Compute LIS values from left to right */
        for (i = 1; i < n; i++)
            for (j = 0; j < i; j++)
                if (arr[i] > arr[j] && lis[i] < lis[j] + 1)
                    lis[i] = lis[j] + 1;
 
        /* Allocate memory for lds and initialize LDS values for
            all indexes */
        int[] lds = new int [n];
        for (i = 0; i < n; i++)
            lds[i] = 1;
 
        /* Compute LDS values from right to left */
        for (i = n-2; i >= 0; i--)
            for (j = n-1; j > i; j--)
                if (arr[i] > arr[j] && lds[i] < lds[j] + 1)
                    lds[i] = lds[j] + 1;
 
 
        /* Return the maximum value of lis[i] + lds[i] - 1*/
        int max = lis[0] + lds[0] - 1;
        for (i = 1; i < n; i++)
            if (lis[i] + lds[i] - 1 > max)
                max = lis[i] + lds[i] - 1;
 
        return max;
    }
 
    public static void main (String[] args)
    {
        int arr[] = {0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5,
                    13, 3, 11, 7, 15};
        int n = arr.length;
        System.out.println("Length of LBS is "+ lbs( arr, n ));
    }
}
