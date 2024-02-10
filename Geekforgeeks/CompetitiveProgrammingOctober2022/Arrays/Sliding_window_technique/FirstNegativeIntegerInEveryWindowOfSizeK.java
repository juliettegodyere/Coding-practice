package Arrays.Sliding_window_technique;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

import LinkedList.SinglyLinkedList.LinkedList;

//https://www.geeksforgeeks.org/first-negative-integer-every-window-size-k/
public class FirstNegativeIntegerInEveryWindowOfSizeK {
    public static long[] printFirstNegativeInteger(long A[], int n, int k)
    {
        long arr[] = new long[n-k+1];
        boolean flag = false;
        for(int i =0; i < n-k+1; i++){
            for(int j =0; j < k; j++){
                if(A[i+j] < 0){
                    arr[i] = A[i+j];
                    flag = true;
                    break;
                }
            }
            if(!flag){
                arr[i] = 0;
            }
        }
        return arr;
    }

    public static long[] printFirstNegativeInteger2(long A[], int n, int k) {
        long[] arr = new long[n - k + 1];
        int windowStart = 0;
        boolean flag = false;
    
        for (int windowEnd = 0; windowEnd < n; windowEnd++) {
            if (A[windowEnd] < 0) {
                flag = true;
            }
    
            if (windowEnd - windowStart + 1 == k) {
                if (flag) {
                    arr[windowStart] = A[windowStart];
                } else {
                    arr[windowStart] = 0;
                }
    
                if (A[windowStart] < 0) {
                    flag = false;
                }
    
                windowStart++;
            }
        }
    
        return arr;
    }

    //Sliding window. Prefered solution
    public static long[] printFirstNegativeInteger3(long A[], int n, int k){
        Deque<Integer> dq = new ArrayDeque<>();
        ArrayList<Long> lt = new ArrayList<>();

        for(int i = 0; i < k; i++){
            if(A[i] < 0){
                dq.add(i);
            }
        }

        for(int i = k; i < n; i++){
            if(!dq.isEmpty()){
                lt.add(A[dq.peek()]);
            }else{
                lt.add(0L);
            }

            while(!dq.isEmpty() && dq.peek() < (i - k +1)){
                dq.remove(dq.peekFirst());
            }
            if(A[i] < 0){
                dq.add(i);
            }
        }
        if(!dq.isEmpty()){
                lt.add(A[dq.peek()]);
        }else{
                lt.add(0L);
        }
        long[] ans = new long[lt.size()];
        for(int i = 0; i < lt.size(); i++){
            ans[i] = lt.get(i);
        }
        return ans;
    }
    
    public static void main(String[] args) 
    {   
        long arr[] = {12, -1, -7, 8, -15, 30, 16, 28};
        int n = arr.length, k = 2;

       long ar[] = printFirstNegativeInteger3(arr, n, k);

       for(int i =0; i < ar.length; i++){
            System.out.print(ar[i] + " ");
        }
    }
   
}
