package Sorting;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Find the minimum difference in the array.
 */

public class MinimumDifference {
    static int getMinDiffNaive(int arr[], int n){
        int res = Integer.MAX_VALUE;
        for(int i = 1; i < n; i++){
            for(int j = 0;j < i;j++){
                System.out.print("i: " + i + " arr[i] " + arr[i]);
                 System.out.println(" j: " + j+ " arr[j] " + arr[j]);
                res = Math.min(res, Math.abs(arr[i] - arr[j]));
            }
        }
        return res;
    }
    static int getMinDiffEff(int arr[], int n){
        Arrays.sort(arr);
        
        int res = Integer.MAX_VALUE;
        for(int i = 1; i < n; i++){
            res = Math.min(res, arr[i] - arr[i-1]);
        }
        return res;
    }
	public static void main (String[] args) {
		int[] arr = {1, 8,12, 5, 18};
        int n = arr.length;

        System.out.println(getMinDiffNaive(arr,n));
		
	}
}
