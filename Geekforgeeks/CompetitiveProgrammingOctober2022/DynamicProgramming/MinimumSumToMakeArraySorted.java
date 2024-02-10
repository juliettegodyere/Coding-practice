
/**
 * This is a variation of Longest Increasing sequence (LIS).
 * Find the minimum number of numbers you can delete from the array to make it sorted
 * Example
 * arr1 = [5,10,3, 6, 7, 8]
 * You need to delete 2 elements
 * 
 * - If our array is sorted in the decreasing order,
 * arr2 = [1, 2, 3] 
 * You need to delete 0 elements
 * 
 * If the elements are sorted in the increasing order,
 * arr3 = [3,2,1] You need to delete 2 elements
 * 
 * The simple solution is to find the LIS of this array. The length of LIS of the arr1
 * is 4, the minimum number of elements that you need to delete to make the array sorted
 * is whatever element that is not in the LIS. 
 * Therefore N-LIS(arr,n) where N is the length of the array
 */
package DynamicProgramming;

public class MinimumSumToMakeArraySorted {
    
}
