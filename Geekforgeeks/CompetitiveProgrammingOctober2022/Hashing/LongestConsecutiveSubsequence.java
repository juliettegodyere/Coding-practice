
/**
 * In this particular problem, we are presented with an array of integers. 
 * Our objective is to find the longest subsequence that contains consecutive elements. To accomplish this, we will explore two distinct approaches: a Naive approach utilizing nested loops, and an Efficient solution employing Hashing .
 * We need to find the longest the consecutive subsequence in the
 * form of x, x+1, x+2 ... x+i with the elements appearing in 
 * different order. Elements like 2, 3, 4, 5, etc you may have 5, 4, 3
 * it's still a subsequence. It can be in any order.
 * Example
 * arr=[1,9,3,4,2,20]
 * The longest consecutive subsequence is 1,2,3,4.
 * Assuming there is 10, 9 and 10 can still form a comsecutive subsequence.
 */
package Hashing;

import java.util.Arrays;
import java.util.HashSet;

public class LongestConsecutiveSubsequence {
    
    /**
     * Hint: 
     * 1. You are going to insert every element into the hash table
     * 2. With 2n lookups we find the result.
     * Example:
     * If you have arr=[1,3,4,3,3,2,9,10]
     * the hash table will store only the distinct elements
     * hash = [1,3,4,2,9,10]
     * One more hint is that we are going to do two lookups to find
     * the required result.
     * We are going to tranverse through the hash table. For every element,
     * we are going to look for x -1. Say x is the current element in the 
     * hash table and say x is 1 which is the first element. We are going to look 
     * for 0 in the hash table. Zero is not present, we will realize that 1 is the 
     * first element of the
     * 
     */
    static int findLongest(int arr[], int n)
    {
        Arrays.sort(arr);
        int res=1,curr=1;
        for(int i=1;i<n;i++){
            if(arr[i]==arr[i-1]+1)
                curr++;
            else{
                res=Math.max(res,curr);
                curr=1;
            }
        }
        res=Math.max(res,curr);
        return res;
    }

    static int findLongest2(int arr[], int n)
    {
        HashSet<Integer> s=new HashSet<>();
        int res = 0;
     
        for (int i = 0; i < n; i++)
            s.add(arr[i]);
     
        for (int i = 0; i < n; i++) {
            if (!s.contains(arr[i] - 1)) {
                int curr = 1;
                while (s.contains(curr+arr[i]))
                    curr++;
                    
                res = Math.max(res, curr);
            }
        }
        return res;
    }

    public static void main (String[] args) 
    {
        int arr[] = new int[]{1, 9, 3, 4, 2, 10, 13};
        
        int n = arr.length;
        
        System.out.println(findLongest(arr, n ));
        
    }
}
