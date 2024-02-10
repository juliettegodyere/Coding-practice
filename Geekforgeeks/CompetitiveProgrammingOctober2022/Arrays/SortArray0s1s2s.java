/**
 * Sort an array of 0’s, 1’s, and 2’s
 * Given an array containing only 0’s, 1’s, and 2’s, sort it in linear time and using constant space.
 * For example,
 * Input:  { 0, 1, 2, 2, 1, 0, 0, 2, 0, 1, 1, 0 }
 * Output: { 0, 0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2 }
 * https://www.youtube.com/watch?v=pEJiGC-ObQE
 * https://www.programiz.com/dsa/counting-sort#:~:text=Counting%20sort%20is%20a%20sorting,index%20of%20the%20auxiliary%20array.
 */
package Arrays;

import java.util.Arrays;

public class SortArray0s1s2s {
    /**
     * A simple solution would be to perform a counting sort. We count the total number of 0’s, 1’s, 
     * and 2’s and then put them in the array in their correct order. The time complexity of this 
     * solution is O(n), where n is the size of the input. However, this requires two traversals of 
     * the array.
     */

     public static void sort(int[] arr, int n){
        //Find the max element in the array
        int max_value = arr[0];
        for(int i = 1; i < n; i++){
            if (arr[i] > max_value)
                max_value = arr[i];
        }
        System.out.println(max_value);
        //Create a count of size max value
        int[] count = new int[max_value + 1];

        // Initialize count array with all zeros.
        for (int i = 0; i < max_value; i++) {
            count[i] = 0;
        }
        //Count the occurences of each index and store the result in the index
        for(int i = 0; i < n; i++){
            count[arr[i]]++;
        }
        //Update the count array such that the count array contains the actual position of the elements
        for(int i = 1; i <= max_value; i++){
            count[i] = count[i] + count[i - 1];
        }

        //Build another output array.
        int[] b = new int[n];
        /**
         * This will be the sorted array. We are going to sort from right to left.
         * We are starting the loop from n-1 to maintain the stability of the array.
         * 1. take the value in a[n-1]
         * 2. Go to that index in the count array count[arr[n-1]]
         * 3. Decrement the value count[arr[n-1]]--
         * 4. Store a[n-1] inside b[count[arr[n-1]]--]
         * 
         */
        for(int i = n-1; i >= 0; i--){
            b[--count[arr[i]]] = arr[i];
        }
       // System.out.println(Arrays.toString(b));

        //Copy array b into array arr
        for(int i = 0; i < n; i++){
            arr[i] = b[i];
        }
     }
     private static void swap(int[] A, int i, int j)
    {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
     //Linear time partition routine to sort an array containing 0, 1, and 2.
    // It is similar to 3–way partitioning for the Dutch national flag problem.
    //https://www.geeksforgeeks.org/sort-an-array-of-0s-1s-and-2s/
    //https://www.techiedelight.com/sort-array-containing-0s-1s-2s-dutch-national-flag-problem/
    public static void sort2(int[] A){
        int lo = 0, mid = 0;
        int end = A.length - 1;
 
        while (mid <= end){
            switch(A[mid]){
                case 0:
                    swap(A, A[lo], A[mid]);
                    lo++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    swap(A, A[mid], A[end]);
                    end--;
                    break;
                default:
            }
        }
    }
     public static void main (String[] args){
        int[] A = { 0, 1, 2, 2, 1, 0, 0, 2, 0, 1, 1, 0 };
       // sort(A, n);
        sort2(A);
        System.out.println(Arrays.toString(A));
    }
}
