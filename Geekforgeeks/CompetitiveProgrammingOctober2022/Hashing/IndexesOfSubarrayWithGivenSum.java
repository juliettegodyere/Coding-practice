package Hashing;

import java.util.ArrayList;
import java.util.HashMap;

public class IndexesOfSubarrayWithGivenSum {
    static ArrayList<Integer> findSubarray(int[] arr, int n, int S) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int prefixSum = 0;
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(-1);

        for (int i = 0; i < n; i++) {
            prefixSum += arr[i];

            if (prefixSum == S) {
                ArrayList<Integer> list = new ArrayList<>();
                list.add(1);
                list.add(i + 1);
                return list;
            }

            if (map.containsKey(prefixSum - S)) {
                ArrayList<Integer> list = new ArrayList<>();
                list.add(map.get(prefixSum - S) + 2);
                list.add(i + 1);
                return list;
            }

            if (!map.containsKey(prefixSum)) {
                map.put(prefixSum, i);
            }
        }

        // If no subarray is found
        return list1;
    }
    //This solution does not work for all possible answers
    public static ArrayList<Integer> findSubarray2(int[] arr, int N, int S) {
        int left = 0, right = 0;
        int sum = 0;

        while (right < N) {
            sum += arr[right];
            while (sum > S) {
                sum -= arr[left];
                left++;
            }
            if (sum == S) {
                ArrayList<Integer> result = new ArrayList<>();
                result.add(left + 1); // 1-based indexing
                result.add(right + 1); // 1-based indexing
                return result;
            }
            right++;
        }
        // If no subarray is found
        ArrayList<Integer> noSubarray = new ArrayList<>();
        noSubarray.add(-1);
        return noSubarray;
    }
    //Accepted code
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
                list.add(i+1);
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

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int n = arr.length;
        int S = 15;

        System.out.println( findSubarray(arr, n, S));
    }
}
