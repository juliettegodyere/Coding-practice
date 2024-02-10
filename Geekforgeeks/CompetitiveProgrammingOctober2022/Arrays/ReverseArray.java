/**
 * We are given an array. We are required to reverse
 * the array inplace.
 */

package Arrays;

public class ReverseArray {
    //Theta(N)
    static int[] reverse(int[] arr, int n){
        int low = 0;
        int high = n-1;
        while(low<high){
            int temp = arr[low];

            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
        return arr;
    }
    public static void main(String[] args) 
    {   
        int[] arr = {3, 7, 6, 5, 10};
        int n = arr.length;
        int[] reveresed = reverse(arr, n);
        for(int i = 0; i < n; i++){
            System.out.print(reveresed[i] + ",");
        }

    }
}
