/**
 * 0(3N)
 * https://www.youtube.com/watch?v=qgizvmgeyUM
 * Also check the explaination and another solution here
 * https://www.techiedelight.com/find-longest-subsequence-formed-by-consecutive-integers/
 * Longest Consecutive Subsequence
Given an integer array, find the length of the longest subsequence formed by the consecutive integers. The subsequence should contain all distinct values, 
and the character set should be consecutive, irrespective of its order.
 */
package Arrays;

import java.util.HashSet;

public class LongestConsecutiveSequence {
    public static int longestSequence(int arr[], int n){

        HashSet<Integer> set = new HashSet<>();
        int longestStreak = 0;
        int currentNum = 0;
        int currentStreak = 0;

        //Add the elements to the set
        for(int num: arr){
            set.add(num);
        }

        for(int num : arr){
            if(!set.contains(num-1)){
                currentNum = num;
                currentStreak = 1;
            }
            while(set.contains(currentNum+ 1)){
                currentNum +=1;
                currentStreak +=1;
            }
            longestStreak = Math.max(longestStreak, currentStreak);
        }
        return longestStreak;
    }
    public static void main (String[] args)
    {
        int[] arr = { 2, 0, 6, 1, 5, 3, 7 };
        int n = arr.length;
 
        System.out.println("The length of the maximum consecutive subsequence is " +
        longestSequence(arr, n));
    }
}
