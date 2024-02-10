package BinarySearch.Lecture;
import java.util.*;

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int N = nums.length;
        int res_sum =0;
        for(int i = 0; i < N; i++){
            int j = i + 1;
            int k = N - 1;
            int min = Integer.MAX_VALUE;
            while(i < j){
                int sum = nums[i] + nums[j] + nums[k];
                int distance = Math.abs(target-sum);
                if(distance < min){
                    min = distance;
                    res_sum = sum;
                }else if(sum < target){
                    j++;
                }else{
                    k--;
                }
            }
        }
        return res_sum;
    }
}