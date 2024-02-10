package Arrays.Sliding_window_technique;
//Given an array arr[] and an integer K, the task is to calculate the sum of all subarrays of size K.
//https://www.geeksforgeeks.org/sum-of-all-subarrays-of-size-k/
public class SumOfAllSubarraysOfSizeK {

    static void calcSumNaive(int arr[], int n, int k) { 
        
        for(int i = 0; i < n-k+1; i++){
            int sum = 0;
            for(int j = 0; j < k; j++){
                sum+=arr[i+j];
            }
            System.out.print(sum + " ");
        }

    } 

    // Function to find the sum of  
    // all subarrays of size K 
    static void calcSum(int arr[], int n, int k) 
    { 
    
        // Loop to consider every  
        // subarray of size K 
        for (int i = 0; i <= n - k; i++) { 
            
            // Initialize sum = 0 
            int sum = 0; 
    
            // Calculate sum of all elements 
            // of current subarray 
            for (int j = i; j < k + i; j++) 
                sum += arr[j]; 
    
            // Print sum of each subarray 
            System.out.print(sum+ " "); 
        } 
    } 
    //Using slinding window
    static void calcSumEff(int arr[], int n, int k) { 
        int sum = 0;
        for(int i = 0; i < k; i++){
            sum+=arr[i];
        }
        System.out.print(sum + " ");
        for(int i = k; i < n; i++){
            sum+=arr[i]-arr[i-k];
            System.out.print(sum + " ");
        }
    } 
    public static void main(String[] args) { 
    int arr[] = { 1, 2, 3, 4, 5, 6 }; 
    int n = arr.length; 
    int k = 3; 
   
    // Function Call 
    calcSumNaive(arr, n, k);  
} 
}
