/**
 * Rearrange an array with alternate high and low elements
Google Translate Icon
Given an integer array, rearrange it such that every second element becomes greater than its left and right elements. Assume no duplicate elements are present in the array.

For example,

Input:  {1, 2, 3, 4, 5, 6, 7}
Output: {1, 3, 2, 5, 4, 7, 6}
 
Input:  {9, 6, 8, 3, 7}
Output: {6, 9, 3, 8, 7}
 
Input:  {6, 9, 2, 5, 1, 4}
Output: {6, 9, 2, 5, 1, 4}

An efficient solution doesn’t involve sorting the array or the use of extra space. 
The idea is to start from the second array element and increment the index by 2 for 
each loop’s iteration. If the last element is greater than the current element, swap 
the elements. Similarly, if the next element is greater than the current element, swap both 
elements. At the end of the loop, we will get the desired array that satisfies given constraints.
 */
package Arrays;

import java.util.Arrays;

public class RearrageAlternateHighLow {
    // Utility function to swap elements `A[i]` and `A[j]` in the array
    private static void swap(int[] A, int i, int j){
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
 
   /**A = { 9, 6, 8, 3, 7 };
    * Initially
    * i = 1
    * A[1 - 1] > A[1] - 9 > 6 yes
    * swap(9, 6);
    * A = { 6, 9, 8, 3, 7 };
    * 1 + 1 < 5 && A[1 + 1] > A[1] 2 < 5 && 8 > 9 No
    *  i = 3
    * A[3 - 1] > A[3] - 8 > 3 yes
    *  swap(8, 3);
    * A = { 6, 9, 3, 8, 7 };
    * 3 + 1 < 5 && A[3 + 1] > A[3] 4 < 5 && 7 > 8 No
    *  i = 5
    */
    public static void rearrangeArray(int[] A)
    {
        // start from the second element and increment index
        // by 2 for each iteration of the loop
        for (int i = 1; i < A.length; i += 2)
        {
            // if the previous element is greater than the current element,
            // swap the elements
            if (A[i - 1] > A[i]) {
                swap(A, i - 1, i);
            }
 
            // if the next element is greater than the current element,
            // swap the elements
            if (i + 1 < A.length && A[i + 1] > A[i]) {
                swap(A, i + 1, i);
            }
        }
    }
    //My solution
    public static void rearrangeArray2(int[] A)
    {
        // start from the second element and increment index
        // by 2 for each iteration of the loop
        for (int i = 1; i < A.length; i++)
        {
            // if the previous element is greater than the current element,
            // swap the elements
            if(i % 2 == 1){
                if (A[i] < A[i-1]) {
                    swap(A, i - 1, i);
                }
            }else if(i % 2 == 0){
                if (A[i] > A[i-1]) {
                    swap(A, i - 1, i);
                }
            }
        }
    }
 
    public static void main (String[] args)
    {
        int[] A = {10, -1, 7, -5, 6, -9};
 
        rearrangeArray(A);
 
        // print output array
        System.out.println(Arrays.toString(A));
    }
}
