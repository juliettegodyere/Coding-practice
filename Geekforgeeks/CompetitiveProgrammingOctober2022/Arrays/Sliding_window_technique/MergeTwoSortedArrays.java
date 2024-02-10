
/**
 * In-place merge two sorted arrays
 * Given two sorted arrays, X[] and Y[] of size m and n each, merge elements of X[] 
 * with elements of array Y[] by maintaining the sorted order, i.e., fill X[] with the 
 * first m smallest elements and fill Y[] with remaining elements.
 * https://www.techiedelight.com/inplace-merge-two-sorted-arrays/
 */
package Arrays.Sliding_window_technique;

import java.util.Arrays;

public class MergeTwoSortedArrays {
    /**
     * Function to in-place merge two sorted arrays X[] and Y[].
     * invariant: `X[]` and `Y[]` are sorted at any point
     * int[] X = { 1, 4, 7, 8, 10 };
        int[] Y = { 2, 3, 9 };
        i = 0
        1 > 2 No
        i = 1
        4 > 2 yes
        nt[] X = { 1, 2, 7, 8, 10 };
        int[] Y = { 4, 3, 9 };
        first = 4
        n = 3
        k = 1
        if(Y[k] < first = 3 < 4) yes
        Y[0] = Y[1]; => 
        int[] Y = { 3, 3, 9 };
        k= 2
        2 < 3 && if(Y[k] < first = 9 < 4) no
        k = 3 k loop ends
        int[] Y = { 3, 4, 9 };
     */
    public static void merge(int[] X, int[] Y)
    {
        int m = X.length;
        int n = Y.length;
 
        // Consider each element `X[i]` of array `X` and ignore the element if it is
        // already in the correct order; otherwise, swap it with the next smaller
        // element, which happens to be the first element of `Y`.
        for (int i = 0; i < m; i++)
        {
            // compare the current element of `X[]` with the first element of `Y[]`
            if (X[i] > Y[0])
            {
                // swap `X[i]` with `Y[0]`
                int temp = X[i];
                X[i] = Y[0];
                Y[0] = temp;
 
                int first = Y[0];
 
                // move `Y[0]` to its correct position to maintain the sorted
                // order of `Y[]`. Note: `Y[1…n-1]` is already sorted
                int k;
                for (k = 1; k < n && Y[k] < first; k++) {
                    Y[k - 1] = Y[k];
                }
 
                Y[k - 1] = first;
            }
        }
    }
 
    public static void main (String[] args)
    {
        int[] X = { 1, 4, 7, 8, 10 };
        int[] Y = { 2, 3, 9 };
 
        merge(X, Y);
 
        System.out.println("X: " + Arrays.toString(X));
        System.out.println("Y: " + Arrays.toString(Y));
    }
}
