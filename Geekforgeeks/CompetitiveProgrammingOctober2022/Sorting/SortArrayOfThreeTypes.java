/**
 * This video discusses a famous interview problem in which you need to segregate an array of elements containing three types of elements. The types are:

1. Sort an array of 0s, 1s, 2s.
2. Three-way partitioning when multiple occurrences of a pivot may exist.
3. Partitioning around a range
 */
package Sorting;

public class SortArrayOfThreeTypes {
    public static void main (String[] args) 
    {
        int arr[] = new int[]{1,2,0};
        
        int n = arr.length;
        
        sortNaive(arr,n);
	
	    for(int x:arr)
            System.out.print(x+" ");
        
    }
    /**
     * Naive partitioning approach and it a variation of the Hoare partitioning approach.
     * @param arr
     * @param n
     */
    static void sortNaive(int arr[],int n){
        int[] temp=new int[n];int i=0;
        
        for(int j=0;j<n;j++)
            if(arr[j]==0)
                temp[i++]=arr[j];
        for(int j=0;j<n;j++)
            if(arr[j]==1)
                temp[i++]=arr[j];
        for(int k=0;k<n;k++)
            if(arr[k]==2)
                temp[i++]=arr[k];
        for(int j=0;j<n;j++)
            arr[j]=temp[j];
    }
    /**
     * This uses the Dutch National Flag approach
     * @param arr
     * @param n
     */
    static void sortEff(int arr[],int n){
        int l=0,h=n-1,mid=0;
        while(mid<=h){
            switch(arr[mid]){
                case 0:
                    //swapping arr[l] & arr[mid])
                    int temp=arr[l];
                    arr[l]=arr[mid];
                    arr[mid]=temp;
                    
                    l++;mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    //swapping arr[h] & arr[mid])
                    temp=arr[h];
                    arr[h]=arr[mid];
                    arr[mid]=temp;
                    
                    h--;
                    break;
            }
        }
        
    }
}
