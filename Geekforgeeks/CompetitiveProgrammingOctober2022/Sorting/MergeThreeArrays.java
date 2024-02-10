package Sorting;

import java.util.ArrayList;

public class MergeThreeArrays {
    // A[], B[], C[]: input arrays
    //Function to merge three sorted lists into a single list.
    static ArrayList<Integer> merge3sorted(int A[], int B[], int C[])
    {
        // add ypur code here
        ArrayList<Integer> list = new ArrayList<>();
        int n = A.length;
        int m = B.length;
        int p = C.length;
        int i = 0, j = 0 , k = 0;
        while(i < n && j < m && k < p){
            if(A[i] <= B[j] && A[i] <= C[k]){
                list.add(A[i]);
                i++;  
            }else if(B[j] <= A[i] && B[j] <= C[k]){
                list.add(B[j]);
                j++;
            }else{
                list.add(C[k]);
                k++;
            }
        }
        while(i < n && j < m){
            if(A[i] < B[j]){
                list.add(A[i]);
                i++;
            }else{
                list.add(B[j]);
                j++;
            }
        }
        while(j < m && k < p){
            if(B[j] < C[k]){
                list.add(B[j]);
                j++;
            }else{
                list.add(C[k]);
                k++;
            }
        }
        while(i < n && k < p){
            if(A[i] < C[k]){
                list.add(A[i]);
                i++;
            }else{
                list.add(C[k]);
                k++;
            }
        }
        while(i<n)
            list.add(A[i++]);
        while(j<m)
            list.add(B[j++]); 
        while(k<p)
            list.add(C[k++]); 
        return list;
    }
    public static void main (String[] args) 
    {
        // int a[] = {1, 2, 3, 4} ;
        // int b[] = {1, 2, 3, 4, 5}; 
        // int c[] = {1, 2, 3, 4, 5, 6};
        int a[] = new int[]{7151, 7181, 7186, 7254, 7304, 7318, 7359, 7389, 7413
            , 7413, 7445, 7501 ,7543, 7592, 7600, 7621, 7744, 7798, 7822, 7833,
             7849, 7862, 7902, 7930, 7937, 8007, 8007, 8048, 8087, 8138, 8152, 8167, 8193};
        int b[] = new int[]{8213, 8259};
        int c[] = new int[]{8299, 8338, 8339, 8344, 8369, 8416, 8446, 8466, 8536, 8560, 8582,
             8588, 8701, 8715, 8787, 8810, 8845, 8928, 8986, 8998, 9065, 9151, 9163, 9186, 9386,
              9460, 9488, 9499, 9549, 9560, 9581, 9589, 9719, 9737, 9899, 9908, 9920, 9936};
        System.out.println(merge3sorted(a,b,c));
        
    }
}

