package Arrays;

import java.util.Arrays;

public class MoveZerosToEnd {
    //Move all zeros to the end. Naive approach. O(N^2)
    static int [] moveZeros(int arr[], int n){
        for(int i = 0; i < n; i++){
            if(arr[i] == 0){
                for(int j = i+1; j < n; j++){
                    if(arr[j] != 0){
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }
        return arr;
    }
    /**Efficient method. Here we keep track of non zero elements
     *  Using partitioning logic of Quicksort
     * We can also solve this problem in one scan of the array by modifying Quicksort’s 
     * partitioning logic. The idea is to use 0 as a pivot element and make one pass of the 
     * partition process. The partitioning logic reads all elements and swap every non-pivot 
     * element with the first occurrence of the pivot.
     * **/
    static int [] moveZeros2(int arr[], int n){
        int count = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;
                count++;
            }
        }
        return arr;
    }

    static int [] moveZeros3(int arr[], int n){
        int i = 0;
        int j = n-1;
        while(i < j){
            if(arr[i] == 0){
                if(arr[j] == 0)
                    j--;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j--;
            }
            i++;
            
        }
        return arr;
    }

    public static void main(String[] args) 
    {   
        int[] arr = {1, 2, 0, 0, 0, 3, 6};
        int n = arr.length;
        moveZeros3(arr, n);
        System.out.println(Arrays.toString(arr));
    }
}
