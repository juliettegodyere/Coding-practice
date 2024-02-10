package Sorting;

public class SegregateEvenOdd {
    static void segregate(int[] arr, int n) {
        int[] temp = new int[n];
        int i = 0;
    
        // Copy negative elements to temp
        for (int j = 0; j < n; j++) {
            if (arr[j] % 2 == 0) {
                temp[i] = arr[j];
                i++;
            }
        }
    
        // Copy non-negative elements to temp
        for (int j = 0; j < n; j++) {
            if (arr[j] % 2 != 0) {
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
    
        int i = -1;
        for (int j = 0; j < n - 1; j++) {
            if (arr[j]%2 == 0) {
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

    public static void main (String[] args) 
    {
        int arr[] = new int[]{13,1,18,7,10, 13};
        
        int n = arr.length;
        
        //sortHoare(arr,n);
        partitionLomuto(arr, n);
        //segregate(arr,n);
	
	    for(int x:arr){
            System.out.print(x+" ");
        } 
    }
}
