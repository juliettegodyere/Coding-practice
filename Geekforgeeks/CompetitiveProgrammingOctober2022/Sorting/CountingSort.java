/**
 * https://www.youtube.com/watch?v=pEJiGC-ObQE
 * https://www.programiz.com/dsa/counting-sort#:~:text=Counting%20sort%20is%20a%20sorting,index%20of%20the%20auxiliary%20array.
 */
package Sorting;

import java.util.Arrays;

public class CountingSort {
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
     public static void main (String[] args){
        int[] A = { 0, 1, 2, 2, 1, 0, 0, 2, 0, 1, 1, 0 };
        int n = A.length;
        sort(A, n);
        System.out.println(Arrays.toString(A));
    }
}
