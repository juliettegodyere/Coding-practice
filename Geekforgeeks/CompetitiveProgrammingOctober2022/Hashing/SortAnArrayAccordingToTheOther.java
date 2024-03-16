package Hashing;

import java.util.Arrays;
import java.util.HashMap;

public class SortAnArrayAccordingToTheOther {
    static void sortA1ByA2(int A1[], int N, int A2[], int M,
                           int ans[])
    {
        HashMap<Integer, Integer> mp = new HashMap<>();
        int ind = 0;

        for(int i = 0; i < N; i++){
            mp.put(A1[i], mp.getOrDefault(A1[i], 0)+1);
        }

        for(int i = 0; i < M; i++){
            if(mp.containsKey(A2[i])){
                for(int j = 0; j < mp.get(A2[i]); j++){
                    ans[ind] = A2[i];
                    ind++;
                }
            }
            mp.remove(A2[i]);
        }

        int idx = ind;
        // store the remaining elements of A1 in sorted
        // order in ans array
        for (HashMap.Entry<Integer, Integer> it :mp.entrySet()) {
 
            // it.second = frequency of remaining elements
            for (int j = 1; j <= it.getValue(); j++)
                ans[ind++] = it.getKey();
        }
        Arrays.sort(ans, idx, N);

        
    }
    static void printArray(int arr[], int n)
    {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    public static void main(String[] args)
    {
        int A1[] = { 2, 1, 2, 5, 7, 1, 9, 3, 6, 8, 8 };
        int A2[] = { 2, 1, 8, 3 };
        int n = A1.length;
        int m = A2.length;
 
        // The ans array is used to store the final sorted
        // array
        int ans[] = new int[n];
        sortA1ByA2(A1, n, A2, m, ans);
 
        System.out.println("Sorted array is ");
        printArray(ans, n);
    }
}
