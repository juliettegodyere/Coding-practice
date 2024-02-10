/**
 * Replace every array element with the product of every other element without using a division operator
 * Given an integer array, replace each element with the product of every other element without using the 
 * division operator.
 * https://www.techiedelight.com/replace-element-array-product-every-element-without-using-division-operator/
 */

package Arrays;

import java.util.Arrays;

public class ReplaceElementByProduct {
    /**
     * Naive approach
     * Does not work
     */
    public static int[] findProduct(int[] A, int n){
        int output[] = new int[n];
        for(int i = 0; i < n; i++){
            int left_product = 1;
            int right_product = 1;
            for(int j = 0; j < n; j++){
                left_product *=A[j];
            }
            for(int k = n-2; k >= 0; k--){
                right_product *=A[k];
            }
            output[i] = left_product * right_product;
        }
        for(int i = 0; i < n; i++){
            A[i] = output[i];
        }
        return A;
    }
    /**Replace every element of the array by product of all other elements using the division process
     * https://www.geeksforgeeks.org/replace-every-element-of-the-array-by-product-of-all-other-elements/
     */
    public static int[] findProduct2(int[] A, int n){
        int total_product = 1;
        for(int i = 0; i < n; i++){
            total_product *=A[i];
        }
        for(int i = 0; i < n; i++){
            A[i] = total_product / A[i];
        }
        return A;
    }
    /**
     * Function to replace each array element with every other
     * element's product without using the division operator
     * initially
     * A = { 2, 3, 3, 5, 7 }
     * left = [1,0,0,0,0]
     * i = 1
     * left[1] = A[1 - 1] * left[1 - 1];
     * left = [1,2,0,0,0]
     * i = 2
     * left[2] = A[2 - 1] * left[2 - 1];
     * left = [1,2,6,0,0]
     * i = 3
     * left[3] = A[3 - 1] * left[3 - 1];
     * left = [1,2,6,18,0]
     * i = 4
     * left[4] = A[4 - 1] * left[4 - 1];
     * left = [1,2,6,18,90]
     * 
     * right = [0,0,0,0,1]
     * j = 3
     * right[3] = A[3 + 1] * right[3 + 1]
     * right = [0,0,0,7,1]
     * j = 2
     * right[2] = A[2 + 1] * right[2 + 1]
     * right = [0,0,35,7,1]
     * j = 1
     * right[1] = A[1 + 1] * right[1 + 1]
     * right = [0,105,35,7,1]
     * j = 0
     * right[0] = A[0 + 1] * right[0 + 1]
     * right    = [315,105,35,7,1]
     * left     = [1,2,6,18,90]
     * i = 0
     * A[0] = 1 * 315
     * A = [315, 3, 3, 5, 7]
     * i = 1
     * A[1] = 2 * 105 = 210
     * A = [315, 210, 3, 5, 7]
     * i = 2
     * A[2] = 6 * 35 = 210
     * A = [315, 210, 210, 5, 7]
     * i = 3
     * A[3] = 18 * 7 = 126
     * A = [315, 210, 210, 126, 7]
     * i = 4
     * A[4] = 90 * 1 = 90
     * A = [315, 210, 210, 126, 90]
     * 
     */
    public static void findProduct(int[] A){
        // get length of the array
        int n = A.length;
 
        // base case
        if (n == 0) {
            return;
        }
 
        // use two auxiliary arrays
        int[] left = new int[n];
        int[] right = new int[n];
 
        // `left[i]` stores the product of all elements in subarray[0…i-1]
        left[0] = 1;
        for (int i = 1; i < n; i++) {
            left[i] = A[i - 1] * left[i - 1];
        }
 
        // `right[i]` stores the product of all elements in subarray[i+1…n-1]
        right[n - 1] = 1;
        for (int j = n - 2; j >= 0; j--) {
            right[j] = A[j + 1] * right[j + 1];
        }
 
        // replace each element with the product of its left and right subarray
        for (int i = 0; i < n; i++) {
            A[i] = left[i] * right[i];
        }
    }
    public static void main(String[] args)
    {
    int[] A = { 2, 3, 3, 5, 7 };
    int n = A.length;
    findProduct(A, n);
 
        // print the modified array
        System.out.println(Arrays.toString(A));
    }
}
