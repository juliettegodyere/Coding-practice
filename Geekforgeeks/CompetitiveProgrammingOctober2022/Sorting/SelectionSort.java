/**
 * The idea behind selection sort is, you find the minimum element and swap it
 * with the first element in the array. You find the second smallest and swap it with the 
 * second element in the array etc.
 */
package Sorting;

public class SelectionSort {
    static void swap(int arr[], int i, int min){
        int temp = arr[i];
        arr[i] = arr[min];
        arr[min] = temp;
    }
   
    /**
     * arr=[1,2,4,3]
     * i = 0, min_ind = 0, j = 1
     * 2 < 1 no
     * i = 0, min_ind = 0, j = 2
     * 4 < 1 no
     * i = 0, min_ind = 0, j = 3
     * 3 < 1 no
     * i = 1, min_ind = 1, j = 2
     * 4 < 2 no
     * i = 1, min_ind = 1, j = 3
     * 3 < 2 no
     * i = 2, min_ind = 2, j = 3
     * 3 < 4 yes
     * 
     */
    public static void sort(int arr[]){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            int min_ind = i;
            for(int j = i + 1; j < n; j++){
                if(arr[j] < arr[min_ind]){
                    min_ind = j;
                }
            }
            
            int temp = arr[i];
            arr[i] = arr[min_ind];
            arr[min_ind] = temp;
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
