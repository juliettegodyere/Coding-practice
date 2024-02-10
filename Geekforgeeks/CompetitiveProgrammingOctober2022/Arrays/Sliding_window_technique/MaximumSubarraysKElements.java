package Arrays.Sliding_window_technique;

import java.util.ArrayList;

public class MaximumSubarraysKElements {
    static ArrayList <Integer> max_of_subarrays(int arr[], int n, int k)
    {
        // Your code here
        ArrayList<Integer> list = new ArrayList<>();
        int max_val = Integer.MIN_VALUE;

        for(int i =0; i < k; i++){
            max_val = Math.max(max_val, arr[i]);
        }
        //System.out.println(max_val);

        return list;
    }
    public static void main(String[] args) 
    {   
        int arr[] = {1, 8, 30, -5, 20, 7}, n = 6, k = 3;

        System.out.println(max_of_subarrays(arr, n, k));
    }
   
}
