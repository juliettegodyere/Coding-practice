/**
 * Find the maximum product of two integers in an array
 * Given an integer array, find the maximum product of two integers in it.
 * For example, 
 * consider array {-10, -3, 5, 6, -2}. 
 * The maximum product is the (-10, -3) or (5, 6) pair.
 */

package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxProductTwoIntegers {
    /**
     * A naive solution is to consider every pair of elements and calculate their product. 
     * Update the maximum product found so far if the product of the current pair is greater. 
     * Finally, print the elements involved in the maximum product. This is demonstrated below in C, 
     * Java, and Python:
     * The time complexity of the above solution is O(n2) and doesn’t require any extra space, where 
     * n is the size of the input.
     */
    public static void findMaximumProduct(int[] A, int n){
        int max_product = Integer.MIN_VALUE;
        int left_idx = 0;
        int right_idx = 0;

        for(int i = 0; i < n; i++){
            int cur_product = 0;
            for(int j = i + 1; j < n; j++){
                cur_product = A[i] * A[j];
                if(max_product < cur_product){
                    max_product = cur_product;
                    left_idx = i;
                    right_idx = j;
                }
            }
        }
        System.out.print("Pair is (" + A[left_idx] + ", " + A[right_idx] + ")");
    }
    /**
     * The time complexity can be improved by sorting the array. Then the result is the 
     * maximum of the following:
     * 1. The product of maximum and second maximum integer in the array (i.e., the last two elements in a sorted array).
     * 2. The product of minimum and second minimum integers in the array (i.e., the first two elements in the sorted array).
     * The time complexity of the above solution is O(n.log(n)) and doesn’t require any extra space.
     */
    public static void findMaximumProduct2(int[] A, int n){
        if(n < 2){
            return;
        }
        Arrays.sort(A);
        int left_max = A[0] * A[1];
        int right_max = A[n-1] * A[n-2];
        if(left_max < right_max){
            System.out.print("Pair is (" + A[n - 1] + ',' + A[n - 2] + ')');
        }else{
            System.out.print("Pair is (" + A[0] + ',' + A[1] + ')');
        }
    }
    /**
     * We can solve this problem in linear time as we need the only maximum, 
     * second maximum, minimum, and second minimum elements to solve this problem. 
     * We can compute all these in only a single traversal of the array, which accounts for 
     * O(n) time complexity. 
     */
    // Function to find the maximum product of two integers in an array
    public static void findMaximumProduct(int[] A)
    {
        // to store the maximum and second maximum element in an array
        int max1 = A[0], max2 = Integer.MIN_VALUE;
 
        // to store the minimum and second minimum element in an array
        int min1 = A[0], min2 = Integer.MAX_VALUE;
 
        for (int i = 1; i < A.length; i++)
        {
            // if the current element is more than the maximum element,
            // update the maximum and second maximum element
            if (A[i] > max1)
            {
                max2 = max1;
                max1 = A[i];
            }
 
            // if the current element is less than the maximum but greater than the
            // second maximum element, update the second maximum element
            else if (A[i] > max2) {
                max2 = A[i];
            }
 
            // if the current element is less than the minimum element,
            // update the minimum and the second minimum
            if (A[i] < min1)
            {
                min2 = min1;
                min1 = A[i];
            }
 
            // if the current element is more than the minimum but less than the
            // second minimum element, update the second minimum element
            else if (A[i] < min2) {
                min2 = A[i];
            }
 
            // otherwise, ignore the element
        }
 
        // choose the maximum of the following:
        // 1. Product of the maximum and second maximum element or
        // 2. Product of the minimum and second minimum element
        if (max1 * max2 > min1 * min2) {
            System.out.print("Pair is (" + max1 + ", " + max2 + ")");
        }
        else {
            System.out.print("Pair is (" + min1 + ", " + min2 + ")");
        }
    }

    public static void main (String[] args)
    {
        int[] A = { -10, -3, 5, 6, -20 };
        int n = A.length;
 
        // findMaximumProduct(A, n);
        // findMaximumProduct2(A, n);
        findMaximumProduct(A);

    }
}
