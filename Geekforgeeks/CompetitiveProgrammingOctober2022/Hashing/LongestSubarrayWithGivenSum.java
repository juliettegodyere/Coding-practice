/**
 * First is to compute the prefix sum and add the elements to
 * the set.
 * Example:
 * arr=[8,3,1,5,-6,6,2,2]
 * prefix_sum = [8,11,12,17,11,17,19,21]
 * If I am a current prefix sum and the current prefix sum minus the given sum
 * and the result already exist in the prefix sum, then the subarray from the 
 * previous element to the current element in the subarray is the length.
 * eg
 * 8-4 = 4 - This does not exist in the prefix_sum
 * 11-4= 7 - This does not exist in the prefix_sum
 * 12-4=8 - 8 already exist in the prefix_sum array
 * Therefore, the length of the subarray is from the index of 12 to the index of the 
 * element before before the result
 * index 1-2 of arr
 */

package Hashing;

import java.util.HashMap;

public class LongestSubarrayWithGivenSum {
    public static void main (String[] args) 
    {
        int arr[] = new int[]{1,2,3,7,5};
        int n = arr.length;
        int sum = 15;
        
        System.out.println(largestSubarrayWithSumX(arr, n, sum));
        
    }

    static int largestSubarrayWithSumXNaive(int[] arr, int n, int k){
        int max_sum = 0;
        for(int i=0;i<n;i++){
            int curr_sum=0;
            for(int j=i;j<n;j++){
               curr_sum+=arr[j];
               if(curr_sum==k){
                    max_sum = Math.min(max_sum, j-i+1);
               }
                    
            }
        }
        return max_sum;
    }
    
    static int largestSubarrayWithSumX(int[] arr, int n, int k)
      {
             // HashMap to store (sum, index) tuples
             HashMap<Integer, Integer> map = new HashMap<>();
             int prefix_sum = 0, maxLen = 0;
 
             // traverse the given array
             for (int i = 0; i < n; i++) {
                 
                  // accumulate sum
                  //{1,2,3,7,5}
                  prefix_sum += arr[i];
                 
                  // when subarray starts from index '0'
                  if (prefix_sum == k){
                    maxLen = i + 1;
                  }
                      
 
                  // make an entry for 'sum' if it is
                  // not present in 'map'
                  if (!map.containsKey(prefix_sum)) {
                      map.put(prefix_sum, i);
                  }
 
                  // check if 'sum-k' is present in 'map'
                  // or not
                  if (map.containsKey(prefix_sum - k)) {
                       
                      // update maxLength
                    //   if (maxLen < (i - map.get(prifix_sum - k)))
                    //       maxLen = i - map.get(prifix_sum - k);
                    maxLen = Math.max(maxLen, i - map.get(prefix_sum-k));
                  }
             }
              
             return maxLen;            
      }
}
