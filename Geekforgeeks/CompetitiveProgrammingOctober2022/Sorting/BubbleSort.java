package Sorting;

/**
 * Bubble sort bubbles the largest element to the last position until all the arrays are swapped.
 */

public class BubbleSort {
    static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    /**
     * arr=[2,10,8,7]
     * 
     */
    public static void sort(int arr[]){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    swap(arr, j, (j+1));
                }
            }
        }
    }
    /**
     * Optimized solution, incase the array is sorted.
     * i = 0
     * j=0 [3,5,10,20,40] swapped = false
     * j=1 [3,5,10,20,40] swapped = false
     * j=2 [3,5,10,20,40] swapped = false
     * j=3 [3,5,10,20,40] swapped = false
     * Then you dont need to continue sort. You break out
     * @param arr
     * @param n
     */
    static void bubbleSort(int arr[], int n){
        boolean swapped;
        
        for(int i = 0; i < n; i++){
            
            swapped = false;
            
            for(int j = 0; j < n - i - 1; j++){
                if( arr[j] > arr[j + 1]){
                    
                    // swapping
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    
                    swapped = true;
                    
                }
            }
            if(swapped == false)
            break;
        }
    }
    public static void main (String[] args) {
	    int a[] = {2, 1, 4, 3};
	    sort(a);
	    
	    for(int i = 0; i < 4; i++){
	        System.out.print(a[i] + " ");
	    }
	}
}

/**initial
 * i = 0, j = 0
 * a = [2, 1,4,3]
 * 
 * loop 1
 * i = 0, j = 0
 * a = [1, 2, 4, 3]
 * i = 0, j = 1
 * i = j = 2
 * a = [1, 2, 3, 4]
 * 
 * loop 2
 * i = 1, j = 0
 */
