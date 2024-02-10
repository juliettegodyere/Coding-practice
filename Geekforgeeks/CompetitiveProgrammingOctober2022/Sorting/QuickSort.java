package Sorting;

public class QuickSort {
    /**
     * Quick with Lomuto partition
     * @param arr
     * @param l
     * @param h
     */
    static void qSortLomuto(int arr[],int l,int h){
        if(l<h){
            int p=ParititionLomuto.iPartition(arr,l,h);
            qSortLomuto(arr,l,p-1);
            qSortLomuto(arr,p+1,h);
        }
    }
    static void qSortHoare(int arr[],int l,int h){
        if(l<h){
            int p=PartitionHoare.partition(arr,l,h);
            qSortHoare(arr,l,p);
            qSortHoare(arr,p+1,h);
        }
    }
    public static void main (String[] args) 
    {
        int arr[] = new int[]{8,4,7,9,3,10,5};
        
        int n = arr.length;
        qSortLomuto(arr,0,n-1);
        //qSortHoare(arr,0,n-1);
        
	    for(int x: arr)
	        System.out.print(x+" ");
        
    }
}
