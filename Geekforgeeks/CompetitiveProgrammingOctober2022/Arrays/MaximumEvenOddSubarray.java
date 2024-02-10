/**Find the length of the longest subarray that has an alternating even orderliness
 * Alternating means, it might begin with even or odd. Once it begins with an even numbber
 * the next number shoukd be odd and the next should be even and so on.
 */
package Arrays;

public class MaximumEvenOddSubarray {
    //Naive Time:O(N^2)
    static int maxEvenOdd(int arr[], int n){
        int res = 1;
        for(int i = 0; i < n; i++){
            int curr = 1;
            for(int j = i + 1; j < n; j++){
                if((arr[j] % 2 == 0 && arr[j-1] % 2 != 0) || (arr[j] % 2 != 0 && arr[j-1] == 0)){
                    curr++;
                }else{
                    break;
                }
            }
            res = Math.max(res, curr);
        }
        return res;
    }
    /**Efficient solution based on Kadane's algorithm. We begin transversing from the 2nd element
     * i = 1, and for every element, there are two cases. Either you begin a new subarray or you extend 
     * the previous subarray. Here we extend the previous subarray if current element is alternating with the 
     * previous element. If it it not alternating with the previous subarray, then we need to begin a new subarray
    */
    static int maxEvenOdd2(int arr[], int n){
        int res = 1;
        int curr = 1;
        for(int i = 1; i < n; i++){
            if((arr[i] % 2 == 0 && arr[i-1] % 2 != 0) || (arr[i] % 2 != 0 && arr[i-1] == 0)){
                curr++;
                res = Math.max(res, curr);
            }else{
                curr = 1;
            }
        }
        return res;
    }
    public static void main(String[] args) 
    {   
        int[] arr = {5, 10, 20, 6, 3, 8};
        int n = arr.length;
        System.out.print(maxEvenOdd(arr, n));
        System.out.print(maxEvenOdd2(arr, n));
    }
}
