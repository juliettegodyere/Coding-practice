package Arrays;

import java.util.ArrayList;
import java.util.List;

public class MaximumSubarraySum {
    //Naive
    /**
     * {-3, 8, -2, 4, -5, 6}
     * res = -3
     * i = 0
     * curr = 0
     * j = 0
     * curr = 0+(-3) = -3
     * res = -3
     * j = 1
     * curr = -3+8 = 5
     * res = 5
     * j = 2
     * curr = 5+ -2 = 3
     * res = 5
     * j = 3
     * curr = 5 + 4 = 9
     * res = 9
     * j = 4
     * curr = 9 + -5 = 4
     * res = 9
     * j = 5
     * curr = 9 + 6 = 15
     * res = 15
     * 
     */
    static int maxSum(int arr[], int n){
        int res = arr[0];
        for(int i = 0; i < n; i++){
            int curr = 0;
            for(int j = i; j < n; j++){
                curr = curr+arr[j];
                res = Math.max(res,curr);
            }
        }
        return res;
    }
    /** Efficient Time:0(N)
     * arr = {-3, 8, -2, 4, -5, 6};
     * intially
     * res = -3
     * maxEnding = -3
     * 
     * i = 1
     * maxEnding = max(-3+8, 8) = 8
     * res = max(-3, 8) = 8
     * 
     * i = 2
     * maxEnding = max(8+-2, -2) = 6
     * res = max(8, 6) = 8
     * 
     * i = 3
     * maxEnding = max(8+4, 4) = 12
     * res = max(8, 12) = 12
     * 
     * i = 4
     * maxEnding = max(12-5, -5) = 7
     * res = max(12, 7) = 12
     * 
     * i = 5
     * maxEnding = max(7+6, 6) = 13
     * res = max(12, 13) = 13
     */
    static int maxSum2(int arr[], int n){
        int res = arr[0];
        int maxEnding = arr[0];
        for(int i =1; i < n; i++){
            maxEnding = Math.max(maxEnding+arr[i], arr[i]);
            res = Math.max(res,maxEnding);
        }
        return res;
    }

    public static int myApproach(int arr[], int n){

        List<Integer> list = new ArrayList<>();
        int maxSum = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++){
            list.clear();
            for(int j = i; j < n; j++){
                int sum=0;
                for(int k = 0; k < list.size(); k++){
                    sum = sum+list.get(k);
                }
                // System.out.println("Sum : " + sum);
                maxSum = Math.max(maxSum, sum);
                list.add(arr[j]);
            }
            //  System.out.println("list : " + list.toString());
            
        }
        return maxSum;

     }

    public static void main(String[] args) 
    {   
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        int n = arr.length;
        //System.out.print(maxSum(arr, n));
        System.out.println(maxSum2(arr, n));
        System.out.println(myApproach(arr, n));
    }
}
