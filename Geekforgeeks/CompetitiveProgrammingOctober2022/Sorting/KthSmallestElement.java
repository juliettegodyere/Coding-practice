package Sorting;

import java.util.Arrays;

public class KthSmallestElement {
    public static void main (String[] args) 
    {
        int arr[] = new int[]{10,5,30,12};
        
        int n = arr.length;int k=3;
        
	    System.out.print(kthSmallest(arr,n,k));
        
    }
    
    static int kthSmallest(int arr[], int n, int k)
    {   
        Arrays.sort(arr);
        return arr[k-1];
    }
    static int kthSmallestLomuto(int arr[],int n,int k){
        int l=0,r=n-1;
        while(l<=r){
            int p=ParititionLomuto.iPartition(arr,l,r);
            if(p==k-1)
                return p;
            else if(p>k-1)
                r=p-1;
            else
                l=p+1;
        }
        return -1;
    }
}
