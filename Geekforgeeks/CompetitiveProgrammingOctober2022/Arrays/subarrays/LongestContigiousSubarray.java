package Arrays.subarrays;



public class LongestContigiousSubarray {
    static int maxLengthOfMaxSubarray(int arr[], int n) {
        int maxLength = 1; // Minimum length of any subarray is 1
        int maxEnding = arr[0];
        int lengthEndingHere = 1;
    
        for (int i = 1; i < n; i++) {
            // Calculate the maximum sum ending at the current index
            maxEnding = Math.max(maxEnding + arr[i], arr[i]);
            
            // Update the length of the subarray ending at the current index
            if (maxEnding == arr[i]) {
                lengthEndingHere = 1; // Start a new subarray
            } else {
                lengthEndingHere++; // Extend the existing subarray
            }
    
            // Update the maximum length if the length of the current subarray is greater
            maxLength = Math.max(maxLength, lengthEndingHere);
        }
    
        return maxLength;
    }

    //This solution is same as longest contiguous subarray 
    static int maxSubArraySum(int a[], int size)
    {
        int max_so_far = Integer.MIN_VALUE,
        max_ending_here = 0,start = 0,
        end = 0, s = 0;
 
        for (int i = 0; i < size; i++) 
        {
            max_ending_here += a[i];
 
            if (max_so_far < max_ending_here) 
            {
                max_so_far = max_ending_here;
                start = s;
                end = i;
            }
 
            if (max_ending_here < 0) 
            {
                max_ending_here = 0;
                s = i + 1;
            }
        }
        return (end - start + 1);
    }
    public static void main(String[] args) 
    {   
        int[] arr = { -2, -3, 4, -1, -2, 1, 5, -3};
        int n = arr.length;
        //System.out.print(maxSum(arr, n));
        System.out.println(maxLengthOfMaxSubarray(arr, n));
        System.out.println(maxSubArraySum(arr, n));
    }    
}
