/**
 * Check if an array is sorted in increasing order.
 * 
 */

package Arrays;

public class SortedIncreasingOrder {
    //My approarch O(N). The efficient solution. time complexity 0(n)
    static boolean isSorted(int[] arr, int n){
        for(int i = 1; i < n; i++){
            if(arr[i] < arr[i-1]){
                return false;
            }
        }
        return true;
    }
    //Naive Approach O(n^2)
    static boolean isSorted2(int[] arr, int n){
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++ ){
                if(arr[j] < arr[i]){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) 
    {   
        int[] arr = {5, 12, 30, 2, 35};
        int n = arr.length;
        System.out.print(isSorted(arr, n));

    }
}
