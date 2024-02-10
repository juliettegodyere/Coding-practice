/**An element is called a majority element if it appears more than 
 * n by 2 (N/2) in the array. Where n is the size of the array. if you have an array of size 5
 * then the majority element should appear at least 3 times. if you have an array of size 6,
 * then the majority element should appear at least 4 times. Because 6/2 is 3 and it should be 
 * more than 3 times.
*/
package Arrays;

import java.util.*;

public class MajorityElement {
    //Naive appoach. 
    static int findMajority(int arr[], int n){
        int sub = n/2;

        for(int i = 0; i < n; i++){
            int count = 1;
            for(int j = i+1; j < n; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if(count > sub){
                return i;
            }
        }
        return -1;
    }
    /**The efficient approach is based on Moore's voting algorithm. https://www.techiedelight.com/find-majority-element-in-an-array-boyer-moore-majority-vote-algorithm/
     * It works in two phases
     * (1) This phase finds out a candidate - it guarantees that if there is a majority element
     * in the array, that this candidate is going to be the majority element
     * (2) The second phase checks whether the candidate found out by the first phase is actually
     * a majority element. the need of the second phase is only there when you do not have a majority 
     * element in the array. Note that this algorithm may not give you the first index of the array.
     * It may give you the middle element. 
     * Boyer–Moore majority vote algorithm
We can find the majority element using linear time and constant space using the Boyer–Moore majority vote algorithm. 
The algorithm can be expressed in pseudocode as the following steps:

 Initialize an element m and a counter i = 0
 for each element x of the input sequence:
   if i = 0, then
     assign m = x and i = 1
   else
     if m = x, then assign i = i + 1
   else
     assign i = i – 1
 return m
The algorithm processes each element of the sequence, one at a time. When processing an element x,

If the counter is 0, set the current candidate to x, and set the counter to 1.
If the counter is non-zero, increment or decrement it according to whether x is a current candidate.
At the end of this process, if the sequence has a majority, it will be the element stored by the algorithm. 
If there is no majority element, the algorithm will not detect that fact and may output the wrong element. 
In other words, the Boyer–Moore majority vote algorithm produces correct results only when the majority element 
is present in the input.
    A[] = {1,2,3} 
    res = 0
    count = 1
    i = 1
    arr[0] == arr[1] n0
    count = 0
    res = 1
    count = 1
    i = 2
    arr[1] == arr[2] n0
    count = 0
    res = 2
    count 0;
    A[] = {3,1,3,3,2}
    res = 0
    count = 1
    i = 1
    arr[0] == arr[1] no
    count = 0
    res = 1
    count = 1
    i = 2
    arr[1] == arr[2] no
    count = 0
    res = 2
    count = 1
    i = 3
    arr[2] == arr[3] yes
    count = 2
    i = 4
    arr[2] == arr[4] no
*/
    static int findMajority2(int arr[], int n){
        // `res` stores the majority element (if present)
        int res = 0; 
        int count = 1;

        for(int i = 1; i < n; i++){
            // otherwise, increment the counter if `i` is a current candidate
            if(arr[res] == arr[i]){
                count++;
            }
            // otherwise, decrement the counter if `i` is a current candidate
            else{
                count--;
            }
             // if counter `COUNT` becomes 0
            if(count == 0){
                // set the current candidate to `i`
                res = i; 

                // reset the counter to 1
                count = 1;
            }
        }
        count = 0;
        for(int i = 0; i < n; i++){
            if(arr[res]== arr[i]){
                count++;
            }
        }
        if(count <= n/2){
            res = -1;
        }
        return res;
    }
    /**
     * 2. Linear-time Solution
     * We can use hashing to solve this problem in linear time. The idea is to store each element’s 
     * frequency in a map and return it if its frequency becomes more than n/2. If no such element is 
     * present, then the The majority element doesn’t exist in the array, and return -1.
     */
    public static int findMajorityElement(int[] nums, int n){

        Map<Integer, Integer> map = new HashMap<>();

        for(int i: nums){
            map.put(i, map.getOrDefault(i, 0)+ 1);
        }

        // return the element if its count is more than `n/2`
        for (Map.Entry<Integer, Integer> entry: map.entrySet())
        {
            if (entry.getValue() > n/2) {
                return entry.getKey();
            }
        }

        return -1;
    }


    public static void main(String[] args) 
    {   
        int[] arr = {1, 8, 7, 4, 1, 2, 2, 2, 2, 2, 2};
        int n = arr.length;
        System.out.println(findMajorityElement(arr, n));
    }
}
