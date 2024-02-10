/**
 * The Chocolate distribution problem. Each array value represents the number of chocolate on that bag.
 * eg [2, 7, 9]. This means in index 0, there are 2 chocolates inside the packet, in index 1, there are 7 chocolates.
 * and there are m number of children. The rules are
 * 1. Every child should get exactly one packet
 * 2. Minimize the diff between the min chocolate that one child gets and the maximum chocolate that another child gets. i.e we need
 * to produce the minimum value in a set of n elements.
 * 
 * The Chocolate Distribution Problem is a classic problem that can be solved using sorting. Here's the algorithm along with an explanation:

Chocolate Distribution Problem Algorithm:
1. Sort the array: First, sort the array of chocolate packets in ascending order.

2. Initialize variables: Initialize two variables - one for the minimum difference (minDiff) and another for the current difference (currDiff). Also, initialize a variable to represent the starting index (start) for the selected subarray.

Traverse the array: Iterate through the sorted array and calculate the difference between the current element and the element at the (i + m - 1)th index, where m is the number of students.

Update minimum difference: If the current difference is smaller than the minimum difference, update the minimum difference and store the current index as the starting index.

Return the result: After traversing the array, the minimum difference will be the minimum unfairness among the subarrays. The subarray starting from the start index with m elements will be the desired distribution.

Explanation:
The idea behind this algorithm is to sort the array so that similar chocolate packets are placed close to each other. By doing so, the minimum difference between the elements in any contiguous subarray will give the minimum unfairness.

Sorting: Sorting the array allows us to easily identify the subarray with the minimum difference. Once the array is sorted, we can iterate through it to find the minimum difference efficiently.

Minimum Difference: By calculating the difference between adjacent elements in the sorted array, we can identify the subarray with the minimum difference. The minimum difference represents the minimum unfairness among the selected subarrays.

Selecting the Subarray: Once the minimum difference is found, we can identify the starting index of the subarray with the minimum difference. This subarray will be the contiguous set of chocolate packets that can be distributed to students to minimize the unfairness.

Return Result: The minimum difference and the corresponding subarray represent the optimal solution to the Chocolate Distribution Problem.
 */

package Sorting;

import java.util.Arrays;

public class ChocolateDistributionProblem {

    static int minDiff(int arr[],int n,int m){
        if(m>n){
            return -1;
        }
        Arrays.sort(arr);
        int res=arr[m-1]-arr[0];
        for(int i=0;(i+m-1)<n;i++)
            res=Math.min(res,arr[i+m-1]-arr[i]);
        return res;
    }


    static int findMinDifference(int[] arr, int n, int m) {
        if (m > n) {
            return -1; // Not enough chocolates for each student
        }
        Arrays.sort(arr);

        int minDifference = Integer.MAX_VALUE;

        // Find the minimum difference between the maximum and minimum elements in each subarray of size m
        for (int i = 0; i + m - 1 < n; i++) {
            int difference = arr[i + m - 1] - arr[i];
            minDifference = Math.min(minDifference, difference);
        }

        return minDifference;
    }
/**
 * 
 * arr= [7, 3, 2, 4, 9, 12, 56]
 * m = 3
 * After sorting
 * arr=[2, 3, 4, 7, 9, 12, 56]
 * intial
 * res = 4 - 2 => arr[m-1] - arr[i]
 * i = 1
 * res = 7 - 3 => arr[m-1+i] - arr[i]
 * i = 2
 * res = 9 - 2 => arr[m-1+i] - arr[i]
 *  i = 3
 * res = 12 - 4 => arr[m-1+i] - arr[i]
 *  i = 4
 * res = 56 - 9 => arr[m-1+i] - arr[i]
 */
    public static void main (String[] args) 
    {
        int[] arr = {12, 4, 7, 9, 2, 23, 25, 41, 30, 40, 28, 42, 30, 44, 48, 43, 50};
        
        int n = arr.length;int m=7;
        
        System.out.println(minDiff(arr,n,m));
        System.out.println(findMinDifference(arr,n,m));
        
    }
    
    
}
