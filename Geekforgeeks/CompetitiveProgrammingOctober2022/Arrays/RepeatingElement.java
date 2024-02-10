/**
 * Find the two repeating elements in a given array.
 * Given an array arr[] of N+2 elements. All elements of the array are 
 * in the range of 1 to N. And all elements occur once except two numbers 
 * which occur twice. Find the two repeating numbers. 
 * Input: arr = [4, 2, 4, 5, 2, 3, 1], N = 5
 * Output: 4 2
 * Explanation: The above array has n + 2 = 7 elements with all elements occurring once 
 * except 2 and 4 which occur twice. So the output should be 4 2.
 * Input: arr = [2, 1, 2, 1, 3], N = 3
 * Output: 1 2
 * Explanation: The above array has n + 2 = 5 elements with all elements occurring once except 
 * 1 and 2 which occur twice. So the output should be 1 2.
 * https://www.geeksforgeeks.org/find-the-two-repeating-elements-in-a-given-array/
 */
package Arrays;

import java.util.HashSet;

public class RepeatingElement {
    //Time Complexity: O(N*N), Iterating over the array of size N for all the N elements.
    public static void findRepeatingNumber(int nums[], int n){
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                if(nums[j] == nums[i]){
                    System.out.println(nums[j] + " ");
                }
            }
        }
    }
    /**
     * Find the two repeating elements in a given array using Visited Array:
     * The idea is to keep track of elements. Whenever an element is encountered that is 
     * already present then print that element.
     * Time Complexity: O(N), Traversing the array of size N
     * Auxiliary Space: O(N), Count array of size N to keep track of elements
     */
    public static void findRepeatingNumber2(int nums[], int n){
        int temp[] = new int[n];
        for(int i = 0; i < n; i++){
            if(temp[nums[i]] == 1){
                System.out.println(nums[i] + " ");
            }else{
                temp[nums[i]]++;
            }
        }
    }
    /**Find the two repeating elements in a given array using Array Elements as an Index:
     * The idea is to use the original array to mark the elements in the array by making them 
     * negative and when an index is found which is already marked then that index would be our possible answer.
     * 1. Traverse over the array and go to index arr[i] and make it negative.
     * 2. If that number is already negative then that index(i.e. arr[i]) is a repeating element.
     * 3. Take absolute value while marking indexes may be the current number is negative.
     * Time Complexity: O(N), Traversing over the array of size N. 
     * Auxiliary Space: O(1) 
     */
    public static void findRepeatingNumber3(int nums[], int n){
        int i;
        System.out.print("Repeating elements are ");
  
        for (i = 0; i < n; i++) {
            int abs_val = Math.abs(nums[i]);
            if (nums[abs_val] > 0)
                nums[abs_val] = -nums[abs_val];
            else
                System.out.print(abs_val + " ");
        }
    }
    /**Find the two repeating elements in a given array using Hash Set:
     * The idea is to use a set, insert the elements in the set, and check simultaneously 
     * whether that is already present the set or not.
     * Follow the steps below to solve the problem:
     * 1. Traverse over the array and check whether the ith element is present in the set or not.
     * 2. If it present then print that element
     * 3. Otherwise that element into the set.
     * 
     */
    static void printRepeating(int arr[], int size)
    {
        HashSet<Integer> s = new HashSet<>();
        System.out.print("Repeating elements are ");
        for (int i = 0; i < size; i++) {
            if (!s.isEmpty() && s.contains(arr[i]))
                System.out.print(arr[i] + "  ");
            s.add(arr[i]);
        }
    }
    public static void main(String[] args) 
    {   
        int[] arr = {4, 2, 4, 5, 2, 3, 1};
        int n = arr.length;
        findRepeatingNumber2(arr, n);
    }
}
