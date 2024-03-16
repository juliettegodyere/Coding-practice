/**A circular subarray includes normal subarray and also the subarrays which are formed by
 * connecting the last element back to the first element,.
 * 
 */

package Arrays.subarrays;

public class MaximumCircularSubarraySum {
    //Naive O(N^2)
    static int maxCirSum(int arr[], int n){
        int res = arr[0];
        for(int i = 0; i < n; i++){
            int curr_max = arr[i];
            int curr_sum = arr[i];

            for(int j = 1; i < n; j++){
                int index = (i + j)%n;
                curr_sum += arr[index];
                curr_max = Math.max(curr_max, curr_sum);
            }
            res = Math.max(res, curr_max);
        }
        return res;
    }
    /**Efficient approach 0(N)
     * Take the maximum of the following two.
     * (1) maximum sum of the normal subarray (Easy, Kadane)
     * (2) Maximum sum of a circular subarray (How to find this) - The idea is to find out
     * the minimum sum subarray, using modified Kadane's algorithm and sunstract this sum from
     * the overall array sum. Theta(N)
     */
    static int normalMaxSum(int arr[], int n){
        //Kadane's algorithm
        int res = arr[0];
        int maxEnding = arr[0];
        for(int i =1; i < n; i++){
            maxEnding = Math.max(maxEnding+arr[i], arr[i]);
            res = Math.max(res,maxEnding);
        }
        return res;
    }
    static int overallMaxSum(int arr[], int n){
        int max_normal = normalMaxSum(arr, n);
        if(max_normal < 0){
            return max_normal;
        }
        int arr_sum = 0;
        for(int i = 0; i < n;i++){
            arr_sum += arr[i];
            //This line handles the minimum subarray part. 
            //When you are finding out the maximum sum in an inverted array, you are 
            //basically finding out the minimum sum in your original array. So instead of 
            //substracting the minimum sum, we are adding the maximum sum
            arr[i] = -arr[i];
        }
        int max_circular = arr_sum + normalMaxSum(arr, n);
        return Math.max(max_circular, max_normal);
    }
    public static void main(String[] args) 
    {   
        int[] arr = {-3, 8, -2, 4, -5, 6};
        int n = arr.length;
        System.out.print(maxCirSum(arr, n));
        System.out.print(overallMaxSum(arr, n));
    }
}
