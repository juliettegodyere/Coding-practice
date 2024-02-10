package Sorting;

public class PartitionHoare {
    public static void main (String[] args) 
    {
        int arr[] = new int[]{5,3,8,4,2,7,1,10};
        
        int n = arr.length;
        partition(arr,0,n-1);
        
	    for(int x: arr)
	        System.out.print(x+" ");
    }
    /**
     * {5,3,8,4,2,7,1,10};
     * i = 0, j = 6
     * Swap(arr[i], arr[j])
     * {1,3,8,4,2,7,5,10};
     * i = 2, j = 6
     * {1,3,5,4,2,7,8,10};
     * i = 2, j = 4
     * {1,3,2,4,5,7,8,10};
     *  i = 4, j = 4
     */
    static int partition(int arr[], int l, int h)
    {   
        int pivot=arr[l];
        int i=l-1,j=h+1;
        while(true){
            do{
                i++;
            }while(arr[i]<pivot);
            do{
                j--;
            }while(arr[j]>pivot);
            if(i>=j)return j;
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }
}
