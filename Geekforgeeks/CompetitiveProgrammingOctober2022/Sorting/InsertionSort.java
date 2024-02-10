/**
 * We maintain a window that is already sorted. When we are in the current element,
 * we insert the element in the sorted window and increase the window.
 */
package Sorting;

public class InsertionSort {
    public static void sort(int arr[]){
        int n = arr.length;
        for(int i = 1; i < n; i++){
            int key = arr[i];
            int j = i-1;
            while(j >=0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
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
