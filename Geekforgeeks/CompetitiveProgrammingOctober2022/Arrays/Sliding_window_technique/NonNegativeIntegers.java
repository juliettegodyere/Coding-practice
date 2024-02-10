
/**
 * Given an unsorted array of non nagative integers, find if there is a 
 * subarray with a given sum.
 */
package Arrays.Sliding_window_technique;

public class NonNegativeIntegers {
    public static boolean subArraySum(int[]arr, int sum){
        for(int i = 0; i < arr.length; i++){
            int max_sum = 0;
            for(int j = i; j < arr.length; j++){
                sum +=arr[i];
                if(max_sum == sum){
                    return true;
                }
            }
        }
        return false;
    }
    /**{1, 4, 20, 3, 10, 5}
     * If your array contains only non-nagative number - 
     * 1. We maintain a window of current sum, the curent sum is 1 and we continue
     * adding values as long as the current sum is less than the given sum.
     * If the sum becomes greater than the given sum, you continue removing the 
     * elements from the begining 
     * until we get a smaller or an equal sum.
     * Implementation - 
     * We maintain 2 variables - start and end
     * O(N) time
     * Note: This approach can not work for nagative elements
     */
    public static boolean subArraySum2(int[]arr, int sum){
        int curr_sum = arr[0];
        int start = 0;
        for(int end = 1; end < arr.length; end++){
            // If curr_sum exceeds the sum, then remove the starting elements 
            while(curr_sum > sum && start < end - 1 ){
                curr_sum = curr_sum - arr[start];
                start++;
            }
            // If curr_sum becomes equal to sum, then return true 
            if(curr_sum == sum){
                return true;
            }
            // Add this element to curr_sum 
            if(end < arr.length){
                curr_sum =  arr[end]; 
            }
        }
        return curr_sum == sum;
    }
    public static void main(String[] args) 
	{ 
		int arr[] = {15, 2, 4, 8, 9, 5, 10, 23}; 
		int sum = 23; 
		System.out.println(subArraySum(arr, sum));
	} 
}
