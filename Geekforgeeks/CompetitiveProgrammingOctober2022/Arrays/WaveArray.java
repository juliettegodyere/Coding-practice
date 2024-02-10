package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WaveArray {

    // A utility method to swap two numbers.
    static void swap(int arr[], int a, int b)
    {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

     public static void convertToWave(int[] a, int n) {
        // code here
        Arrays.sort(a);
        for(int i = 1; i < n; i+=2){
            swap(a, i, i-1);
        }
    }
 
    // This function sorts arr[0..n-1] in wave form, i.e.,
    // arr[0] >= arr[1] <= arr[2] >= arr[3] <= arr[4]....
    static void sortInWave(int arr[], int n)
    {
        // Traverse all even elements
        for(int i = 0; i < n-1; i+=2){
            //swap odd and even positions
            if(i > 0 && arr[i - 1] > arr[i])
              swap(arr, i, i-1);
            if(i < n-1 && arr[i + 1] > arr[i])
              swap(arr, i, i+1);
        }
    }
    public static void main(String[] args) 
    {   
        int[] arr = {10, 5, 6, 3, 2, 20, 100, 80};
        int n = arr.length;
        //convertToWave(arr, n);
        sortInWave(arr, n);
        Integer[] integerArray = Arrays.stream(arr).boxed().toArray(Integer[]::new);

        List<Integer> list = new ArrayList<>(Arrays.asList(integerArray));
        list.forEach(element -> System.out.print(element+ ","));

    }
}
