package Mathematics;

import java.util.ArrayList;
import java.util.List;

/**
 * https://www.geeksforgeeks.org/find-the-missing-number/
 */

public class MissingNumber {
    static void findMissing(int arr[], int N) {
        int temp[] = new int[N+1]; // Initialize temp array with length N
    
        for (int i = 0; i < N; i++) {
            temp[arr[i] - 1] = 1; // Mark present numbers in the temp array
        }
    
        for (int i = 0; i < N; i++) {
            if (temp[i] == 0) {
                System.out.println("The missing number is " + (i + 1)); // Add 1 to get the actual missing number
            }
        }
    }

    // Function to find missing number
    static int getMissingNo(int a[], int n)
    {
        int x1 = a[0];
        int x2 = 1;

        // For xor of all the elements in array
        for (int i = 1; i < n; i++)
            x1 = x1 ^ a[i];

        // For xor of all the elements from 1 to n+1
        for (int i = 2; i <= n + 1; i++)
            x2 = x2 ^ i;

        return (x1 ^ x2);
    }

/* Driver code */
    public static void main(String [] args){
        int arr[] = {1, 2, 4, 6, 3, 7, 8 };
        int N = arr.length;

        findMissing(arr, N);
    }
}
