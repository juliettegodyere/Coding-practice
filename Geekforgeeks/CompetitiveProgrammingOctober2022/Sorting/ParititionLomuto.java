package Sorting;

public class ParititionLomuto {
    public static void main (String[] args) 
    {
        int arr[] = new int[]{10,80,30,90,40,50,70};
        
        int n = arr.length;
        iPartition(arr,0,n-1);
        
	    for(int x: arr)
	        System.out.print(x+" ");
        
    }
    /** {10,80,30,90,40,50,70}
     * Initially i = -1, j = 0
     * loop 1
     * j=0
     * i=0,
     * {10,80,30,90,40,50,70}
     * loop 2
     * j=1
     * loop 3
     * j=2
     * i = 1
     * {10,30,80,90,40,50,70}
     * loop 4
     * j=3
     * loop 5
     * j=4
     * i = 2
     * {10,30,40,90,80,50,70}
     * loop 6
     * j=5
     * i=3
     * {10,30,40,50,80,90,70}
     * outside the loop
     * i =4
     * {10,30,40,50,70,90,80}
     */
    static int iPartition(int arr[], int l, int h)
    {   
        int pivot=arr[h];
        int i=l-1;
        for(int j=l;j<=h-1;j++){
            if(arr[j]<pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[i+1];
        arr[i+1]=arr[h];
        arr[h]=temp;
        return i+1;
    }
}
