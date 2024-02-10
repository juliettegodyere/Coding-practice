/**
 * https://www.geeksforgeeks.org/longest-sub-array-sum-k/
 */
package Arrays.Sliding_window_technique;

import java.util.ArrayList;
import java.util.HashMap;

public class LongestSubarrayWithGivenSum {
    static int lenOfLongSubarr(int[] arr, int n, int k){
    int maxlength = 0;
 
    for (int i = 0; i < n; i++) {
       int Sum = 0;
      for (int j = i; j < n; j++) {
        Sum += arr[j];
        if (Sum == k) {
          maxlength = Math.max(maxlength, j - i + 1);
        }
      }
    }
 
    // Return the maximum length
    return maxlength;          
  }
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        // Your code here
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0, j = 0, sum = 0;

        if(s == 0){
            list.add(-1);
            return list;
        }
        while(j < n){
            sum += arr[j];
            
            if(sum < s){
                j++;
            }else if(sum == s){
                list.add(i + 1);
                list.add(j+1);
                return list;
            }else if(sum > s){
                while(sum > s){
                    sum -= arr[i];
                    i++;
                }
                if(sum == s){
                    list.add(i+1);
                    list.add(j+1);
                    return list;
                }
                j++;
            }
        }
        list.add(-1);
        return list;
        
    } 
    static int lenOfLongSubarr2(int[] arr, int n, int k)
      {
             // HashMap to store (sum, index) tuples
             HashMap<Integer, Integer> map = new HashMap<>();
             int sum = 0, maxLen = 0;
 
             // traverse the given array
             for (int i = 0; i < n; i++) {
                 
                  // accumulate sum
                  sum += arr[i];
                 
                  // when subarray starts from index '0'
                  if (sum == k)
                      maxLen = i + 1;
 
                  // make an entry for 'sum' if it is
                  // not present in 'map'
                  if (!map.containsKey(sum)) {
                      map.put(sum, i);
                  }
 
                  // check if 'sum-k' is present in 'map'
                  // or not
                  if (map.containsKey(sum - k)) {
                       
                      // update maxLength
                      if (maxLen < (i - map.get(sum - k)))
                          maxLen = i - map.get(sum - k);
                  }
             }
              
             return maxLen;             
      }
    public static void main (String[] args)
    {
        int arr[] = {1, 2, 3, 4}, n = arr.length, k = 0;

       System.out.println(subarraySum(arr, n, k));
    }
}
