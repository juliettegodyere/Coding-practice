/**
 * We are given an array, with 3 indexes. We are given that elements from 
 * low-mid are sorted and so is also elements from mid+1 - high.
 * 
 */
package Sorting;

public class MergeThreeIndexArray {
    public static void merge(int arr[], int low, int mid, int high){
        int n1=mid-low+1, n2=high-mid;

        int left[] = new int[n1];
        int right[] = new int[n2];

        for(int i=0;i<n1;i++)
            left[i]=arr[i+low];
        for(int j=0;j<n2;j++)
            right[j]=arr[mid+1+j];
        
        int i=0,j=0,k=low;
        while(i<n1 && j<n2){
            if(left[i]<=right[j])
                arr[k++]=left[i++];
            else
                arr[k++]=right[j++];
        }
        while(i<n1)
            arr[k++]=left[i++];
        while(j<n2)
            arr[k++]=right[j++]; 
    }
    public static void main (String[] args) 
    {
        int a[] = new int[]{10,15,20,40,8,11,15,22,25};
	    int l=0,h=8,m=3;
        
        merge(a,l,m,h);
	    for(int x: a)
	        System.out.print(x+" ");
        
    }
}
