/**
 * The idea is to create a 3rd temp array and store the result of 
 * arr1[i] - arr2[i] in the given index
 */

package Hashing;

import java.util.HashMap;

public class LongestCommonSpanWithSameSpan {

	static int longestCommonSumNaive(int[] arr1, int[] arr2, int n) 
	{ 
		int max_sum = 0;
        for(int i=0;i<n;i++){
            int sum1=0, sum2 =0;
            for(int j=i;j<n;j++){
               sum1+=arr1[j];
			   sum2+=arr2[j];
               if(sum1==sum2){
                    max_sum = Math.min(max_sum, j-i+1);
               }
                    
            }
        }
        return max_sum;
	}
    // Returns largest common subarray with equal 
	// number of 0s and 1s 
	static int longestCommonSum(int[] arr1, int[] arr2, int n) { 
		// Find difference between the two 
		int[] arr = new int[n]; 
		for (int i = 0; i < n; i++) {
			arr[i] = arr1[i] - arr2[i]; 
		}
		HashMap<Integer, Integer> hM = new HashMap<>(); 

		int sum = 0;
		int max_len = 0; 

		for (int i = 0; i < n; i++) { 
			sum += arr[i]; 

			// To handle sum=0 at last index 
			if (sum == 0) {
				max_len = i + 1; 
			}

			// If this sum is seen before, 
			// then update max_len if required 
			if (hM.containsKey(sum)) {
				max_len = Math.max(max_len, i - hM.get(sum)); 
			}else {
				hM.put(sum, i); 
			}
				
		} 
		return max_len; 
	} 

	// Driver code 
	public static void main(String args[]) 
	{ 
			int[] arr1 = {0, 1, 0, 1, 1, 1, 1}; 
			int[] arr2 = {1, 1, 1, 1, 1, 0, 1}; 
			int n = arr1.length; 
			System.out.println(longestCommonSum(arr1, arr2, n)); 
	}
}
