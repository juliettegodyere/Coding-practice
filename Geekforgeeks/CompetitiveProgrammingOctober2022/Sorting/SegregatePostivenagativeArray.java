package Sorting;

public class SegregatePostivenagativeArray {

    static void segregate(int[] arr, int n) {
        int[] temp = new int[n];
        int i = 0;
    
        // Copy negative elements to temp
        for (int j = 0; j < n; j++) {
            if (arr[j] < 0) {
                temp[i] = arr[j];
                i++;
            }
        }
    
        // Copy non-negative elements to temp
        for (int j = 0; j < n; j++) {
            if (arr[j] >= 0) {
                temp[i] = arr[j];
                i++;
            }
        }
    
        // Copy elements from temp back to arr
        for (int j = 0; j < n; j++) {
            arr[j] = temp[j];
        }
    }

    static void partitionLomuto(int[] arr, int n) {
        int pivot = 0;
    
        int i = -1;
        for (int j = 0; j < n - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        
        int temp = arr[i + 1];
        arr[i + 1] = arr[n - 1];
        arr[n - 1] = temp;
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
        
        //sortHoare(arr,n);
        //partitionLomuto(arr, n);
        segregate(arr,n);
	
	    for(int x:arr){
            System.out.print(x+" ");
        } 
    }
}
