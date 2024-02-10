package Arrays.Sliding_window_technique;

import java.util.ArrayDeque;
import java.util.Deque;
/**
 * https://www.geeksforgeeks.org/sliding-window-maximum-maximum-of-all-subarrays-of-size-k/
 */
public class MaximumElementOfEachSubarrayOfSizeK {
    public static void findMaxElement(int arr[], int n, int k){
        Deque<Integer> dq = new ArrayDeque<>();

        for(int i = 0; i < k; i++){
            while(!dq.isEmpty() && arr[i] >= arr[dq.peekLast()]){
                dq.removeLast();
            }
            dq.addLast(i);
        }

        for(int i = k; i < n; i++){
            System.out.println(arr[dq.peekFirst()] + " ");

            while(!dq.isEmpty() && dq.peek() <= i - k){
                dq.removeFirst();
            }

            while(!dq.isEmpty() && arr[i] >= arr[dq.getLast()]){
                dq.removeLast();
            }
            dq.addLast(i);
        }
        System.out.println(arr[dq.peek()] + " ");
    }
    public static void main(String[] args)
    {
        int arr[] = { 12, 1, 78, 90, 57, 89, 56 };
        int K = 3;
       
          // Function call
        findMaxElement(arr, arr.length, K);
    }
}
