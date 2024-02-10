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
https://www.techiedelight.com/find-longest-bitonic-subarray-array/
 */
package Arrays;

public class LongestBitonicSubarray {
    public static int findBitonicSubarray(int arr[], int n){
        int max = Integer.MIN_VALUE;
        int inc[] = new int[n];
        int dec[] = new int[n];

        inc[0] = 1;
        dec[n-2] = 1;

        for(int i = 1; i < n; i++){
            inc[i] = arr[i] > arr[i - 1] ? inc[i - 1]+1 : 1;
        }
        for(int i = n-2; i >= 0; i--){
            dec[i] = arr[i] > arr[i + 1] ? dec[i + 1]+1 : 1;
        }

        for(int i = 0; i < n; i++){
            if(inc[i] + dec[i] - 1 > max){
                max = inc[i] + dec[i] - 1;
            }
        }

        return max;
    }
    public static void main(String[] args)
    {
        int[] A = { 3, 5, 8, 4, 5, 9, 10, 8, 5, 3, 4 };
        int n = A.length;
        System.out.println(findBitonicSubarray(A, n));
    }
}
