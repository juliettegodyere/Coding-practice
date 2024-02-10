/**
 * This video discusses a famous interview problem in which you need to segregate 
 * an array of elements containing two types of elements. The types are:

1. Segregate negative and positive elements.
2. Segregate even and odd elements.
3. Sort a binary array.
 */
package Sorting;

public class SortArrayOfTwoType {
    static void sortNaive(int arr[],int n){
        int[] temp=new int[n];int i=0;
        
        for(int j=0;j<n;j++)
            if(arr[j]<0)
                temp[i++]=arr[j];
        for(int j=0;j<n;j++)
            if(arr[j]>=0)
                temp[i++]=arr[j];
        for(int j=0;j<n;j++)
            arr[j]=temp[j];
    }
    static void sortHoare(int arr[],int n){
        int i=-1,j=n;
        while(true)
        {
            do{i++;}while(arr[i]<0);
            do{j--;}while(arr[j]>=0);
            if(i>=j)return;
            
            //swapping arr[i] & arr[j]
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            
        }
    }
    public static void main (String[] args) 
    {
        int arr[] = new int[]{13,-12,18,-10};
        
        int n = arr.length;
        
        sortHoare(arr,n);
	
	    for(int x:arr)
            System.out.print(x+" ");
        
    }
}
