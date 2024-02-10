package Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class MaximumInAllSubarraysOfSizeK {
    public static void printMax(int[] arr, int n, int k){
        for(int i = 0; i < n-k+1; i++){
            int mx = arr[i];
            for(int j = i+1; j < i+k; j++){
               mx = Math.max(mx, arr[j]);

            }
           System.out.print(mx + ",");
        }
    }

     static void printMax2(int arr[], int n, int k)
    {
      
        Deque<Integer> dq = new ArrayDeque<Integer>();

      
       
        for (int i = 0; i < k; ++i) {
            
            while (!dq.isEmpty() && arr[i] >= arr[dq.peekLast()])
                dq.removeLast(); 

            
            dq.addLast(i);
        }

       
        for (int i=k; i < n; ++i) {
            
            System.out.print(arr[dq.peek()] + " ");

            
            while ((!dq.isEmpty()) && dq.peek() <= i - k)
                dq.removeFirst();

           
            while ((!dq.isEmpty()) && arr[i] >= arr[dq.peekLast()])
                dq.removeLast();

           
            dq.addLast(i);
        }

        
        System.out.print(arr[dq.peek()]);
    }
    public static void main(String[] args)
    {
        int arr[] = {-7, 1, 5, 2, -4, 3, 0 };
        int arr_size = arr.length;
 
        // Function call
        printMax(arr, arr_size, 3);
    }
}
