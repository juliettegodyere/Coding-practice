package Arrays.Sliding_window_technique;

//This can only work if you have positive elements. If the array comprises of both positive and nagative elements, this approach will not work.
// Given a sorted array, of non nagative integers. Find if there is a subarray of given sum.


public class SubarrayWithGivenSum {

    static boolean subArraySum(int arr[], int n, int sum) 
	{ 
        for(int i = 0; i < n; i++){
            int Intsum = 0;
            for(int j = i; j < n; j++){
                Intsum+=arr[j];
                if(Intsum == sum){
                    return true;
                }
            }
        }
        return false;
    }

    int subArraySum2(int arr[], int n, int sum) 
	{ 
		int curr_sum = arr[0], start = 0, i; 

		// Pick a starting point 
		for (i = 1; i <= n; i++) 
		{ 
			// If curr_sum exceeds the sum, then remove the starting elements 
			while (curr_sum > sum && start < i-1) 
			{ 
				curr_sum = curr_sum - arr[start]; 
				start++; 
			} 
			
			// If curr_sum becomes equal to sum, then return true 
			if (curr_sum == sum) 
			{ 
				int p = i-1; 
				System.out.println("Sum found between indexes " + start 
						+ " and " + p); 
				return 1; 
			} 
			
			// Add this element to curr_sum 
			if (i < n) 
			curr_sum = curr_sum + arr[i]; 
			
		} 

		System.out.println("No subarray found"); 
		return 0; 
	}
    

	public static void main(String[] args) 
	{ 
		int arr[] = {15, 2, 4, 8, 9, 5, 10, 23}; 
		int n = arr.length; 
		int sum = 23; 
		System.out.println(subArraySum(arr, n, sum)); 
	}
}
