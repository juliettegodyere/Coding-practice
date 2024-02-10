package Arrays.Sliding_window_technique;

import java.util.Deque;
import java.util.LinkedList;

/**
 * To find the sum of the minimum and maximum elements of all subarrays of size k using a sliding window approach, 
 * you can maintain two double-ended queues (Deque) to keep track of the maximum and minimum elements in the current window. 
 * Here's a Java implementation:
 * https://www.geeksforgeeks.org/sum-minimum-maximum-elements-subarrays-size-k/
 */

public class SumMaximumMinimumElement {
 
    // Returns sum of min and max element of all subarrays 
    // of size k 
    public static int SumOfKsubArray(int arr[] , int k) 
    { 
        int sum = 0;  // Initialize result 
   
        // The queue will store indexes of useful elements 
        // in every window 
        // In deque 'G' we maintain decreasing order of 
        // values from front to rear 
        // In deque 'S' we  maintain increasing order of 
        // values from front to rear 
        Deque<Integer> S=new LinkedList<>(),G=new LinkedList<>();
 
        // Process first window of size K 
        int i = 0; 
        for (i = 0; i < k; i++) 
        { 
            // Remove all previous greater elements 
            // that are useless. 
            while (!S.isEmpty() && arr[i] >= arr[S.peekLast()]) 
                S.removeLast(); // Remove from rear 
   
            // Remove all previous smaller that are elements 
            // are useless. 
            while ( !G.isEmpty() && arr[i] <= arr[G.peekLast()]) 
                G.removeLast(); // Remove from rear 
   
            // Add current element at rear of both deque 
            G.addLast(i); 
            S.addLast(i); 
        } 
   
        // Process rest of the Array elements 
        for (  ; i < arr.length; i++ ) 
        { 
            // Element at the front of the deque 'G' & 'S' 
            // is the largest and smallest 
            // element of previous window respectively 
            sum += arr[S.peekFirst()] + arr[G.peekFirst()]; 
   
            // Remove all elements which are out of this 
            // window 
            while ( !S.isEmpty() && S.peekFirst() <= i - k) 
                S.removeFirst(); 
            while ( !G.isEmpty() && G.peekFirst() <= i - k) 
                G.removeFirst(); 
   
            // remove all previous greater element that are 
            // useless 
            while ( !S.isEmpty() && arr[i] >= arr[S.peekLast()]) 
                S.removeLast(); // Remove from rear 
   
            // remove all previous smaller that are elements 
            // are useless 
            while ( !G.isEmpty() && arr[i] <= arr[G.peekLast()]) 
                G.removeLast(); // Remove from rear 
   
            // Add current element at rear of both deque 
            G.addLast(i); 
            S.addLast(i); 
        } 
   
        // Sum of minimum and maximum element of last window 
        sum += arr[S.peekFirst()] + arr[G.peekFirst()]; 
   
        return sum; 
    } 
 
    public static void main(String args[]) 
    {
        int arr[] = {2, 5, -1, 7, -3, -1, -2} ; 
        int k = 4; 
        System.out.println(SumOfKsubArray(arr, k));
    }

}
