package BinarySearch;

import java.util.HashMap;
import java.util.Map;

/***
 * 
To find two repeated elements in an array, you can use the concept of cyclic sort. Here's the implementation of the twoRepeated function in Java:
 */
public class TwoRepeatedElements {
    public static int[] twoRepeated(int arr[], int n){
        int[] res = new int[2];
        int p = 0;
       for(int i = 0; i < n; i++){
            if(p > 2){
                return res;
            }else{
                for(int j = i+1; j < n; j++){
                    if(arr[i] == arr[j]){
                        res[p] = arr[j];
                        p++;
                        break;
                    }
                }
            }
       }
       return res;
    }

    public static int[] twoRepeated2(int arr[], int n){
        int[] res = new int[2];
        int p = 0;
        Map<Integer, Integer> map = new HashMap<>();
       for(int i = 0; i < n; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
       }
       for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            if(entry.getValue() > 1){
                res[p] = entry.getKey();
                p++;
            }
       }
       return res;
    }

    public static int[] twoRepeated3(int arr[], int N) {
        int[] result = new int[2];

        for (int i = 0; i < N; i++) {
            // Check if the current element is positive or negative
            int index = Math.abs(arr[i]) - 1;

            if (arr[index] > 0) {
                // Mark the element as negative to indicate its presence
                arr[index] = -arr[index];
            } else {
                // If the element is already negative, it means it is a repeated element
                result[0] = Math.abs(arr[i]);
            }
        }

        for (int i = 0; i < N; i++) {
            if (arr[i] > 0) {
                // The first positive element encountered is the second repeated element
                result[1] = i + 1;
                break;
            }
        }

        return result;
    }
    public static void main(String[] args) {
        int[] arr = {4, 2, 1, 4, 3, 2};
        int N = arr.length;
        //int[] result = twoRepeated(arr, N);
        //int[] result = twoRepeated2(arr, N);
        int[] result = twoRepeated3(arr, N);

        System.out.println("Two repeated elements: " + result[0] + " and " + result[1]);
    }
}
