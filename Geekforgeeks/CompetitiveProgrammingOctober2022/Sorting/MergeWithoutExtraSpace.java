package Sorting;

import java.util.Arrays;

public class MergeWithoutExtraSpace {
    //Function to merge the arrays.
    public static void merge(long arr1[], long arr2[], int n, int m) 
    {
        // code here 
        int i = 0;
        while(i < n){
            int j = 1;
            if(arr2[0] < arr1[i]){
                long key = arr1[i];
                arr1[i] = arr2[0];
                while(j< m && key > arr2[j]){
                    arr2[j-1] = arr2[j];
                    j++;
                }
                arr2[j-1] = key;
            }
            i++;
        }
    }
    public static void main (String[] args) 
    {
        long a[] = new long[]{1,3,5,7};
        long b[] = new long[]{0,2,6,8,9};
        
        int m = a.length;
        int n = b.length;
        merge(a,b,m,n);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
}
