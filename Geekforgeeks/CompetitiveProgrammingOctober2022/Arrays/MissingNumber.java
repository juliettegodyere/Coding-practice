/**
 * How do you find the missing number in a given integer array of 1 to 100?
 * https://medium.com/javarevisited/20-array-coding-problems-and-questions-from-programming-interviews-869b475b9121
 */

package Arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MissingNumber {
    /**
     * Approach 2 (Using summation of first N natural numbers): 
     * The idea behind the approach is to use the summation of the first N numbers.
     * Find the sum of the numbers in the range [1, N] 
     * using the formula N * (N+1)/2. Now find the sum of all the elements in the array 
     * and subtract it from the sum of the first N natural numbers. This will give the 
     * value of the missing element.
     * Follow the steps mentioned below to implement the idea:
     * Calculate the sum of the first N natural numbers as sumtotal= N*(N+1)/2.
     * Traverse the array from start to end.
     * Find the sum of all the array elements.
     * Print the missing number as SumTotal – sum of array
     * 
     * https://www.youtube.com/watch?v=MPJe14plo28
     */
    public static void findMissingNum(int[] A, int N){
        int sumtotal= ((N + 1) * (N + 2)) / 2;
        int sum = 0;
       for(int i = 0; i < N; i++){
        sum+=A[i];
       }
        System.out.println(sumtotal - sum);
    }
    public static void findMissingNum2(int[] A, int n){
        int temps[] = new int[n+1];
        for (int i = 0; i <= n; i++) {
            temps[i] = 0;
        }

        for(int i = 0; i < n; i++){
            temps[A[i]-1] = 1;
        }
        for(int i = 0; i <= n; i++){
            if(temps[i] == 0){
                System.out.println(i + 1);
            }
        }
    }

    //The missing and repeating number
    public static void findMissingRepeatingNumber(int[] a, int n){
        int arr[] = new int[2];
    
        for(int i = 0; i < n; i++){
            int x = Math.abs(a[i])-1;
            if(a[x] < 0){
                // Repeating number
                arr[0] = x+1;
            }else{
                a[x] = -a[x]; // Marking visited
            }
        }
    
        for(int i = 0; i < n; i++){
            if(a[i] > 0){
                arr[1] = i + 1; // Missing number
                break;
            }
        }
    
        System.out.println("The Repeating number is " + arr[0]);
        System.out.println("The missing number is " + arr[1]);
    }

    public static void main(String[] args) {
                    // 0, 1, 2, 3, 4, 5, 6, 7, 8, 9
        int[] arr = {1, 2, 4, 5, 6, 6};
                     //1, 2, 3, 4, 5, 6, 7, 8, 9, 10
        int n = arr.length;
        findMissingNum2(arr, n);
        findMissingRepeatingNumber(arr, n);

    }
}
