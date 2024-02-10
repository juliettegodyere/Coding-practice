/**Find the maximum value of arr[j] - arr[i] such that j > i
 * 
 */

package Arrays;

public class MaximumDifference {
    //Naive approach. Time: Theta(N^2)
    /**{2, 3, 10,6, 4, 8, 1};
     * max = 3 - 2 = 1
     * i = 0
     * j = 1
     * max = (1, 3-2) = 1
     * i = 0
     * j = 2
     * max = (1, 10 - 2) = 8
     * i = 0
     * j = 3
     * max = (8, 6 - 2) = 8
     */
    static int maxDiff(int arr[], int n){
        int max = arr[1] - arr[0];
        for(int i = 0; i < n-1; i++){
            for(int j = i+1; j < n; j++){
                max = Math.max(max, arr[j]-arr[i]);
            }
        }
        return max;
    }
    //Efficient solution. Time: Theta(N). 
    /**The idea here is that we are not considering
     * every i for array j. We are only considering the minimum value and
     * updating the minimum value when required.
     * {2, 3, 10,6, 4, 8, 1}
     * max = 3 - 2 = 1
     * minval = 2
     * j = 1
     * max = (1, 3-2) = 1
     * minval = (2, 3) = 2
     * j = 2
     * max = (1, 10-2) = 8
     * minval = (2, 10) = 2
     * j = 3
     * max = (8, 6-2) = 8
     * minval = (2, 6) = 2
     * j = 4
     * max = (8, 4-2) = 8
     * minval = (2, 4) = 2
     * j = 5
     * max = (8, 8-2) = 8
     * minval = (2, 8) = 2
     * j = 6
     * max = (8, 1-2) = 8
     * minval = (2, 1) = 1
     */
    static int maxDiff2(int arr[], int n){
        int max = arr[1] - arr[0];
        int minVal = arr[0];
        for(int j = 1; j < n; j++){
            max = Math.max(max, arr[j]-minVal);
            minVal = Math.min(minVal, arr[j]);
            
        }
        return max;
    }
    public static void main(String[] args) 
    {   
        int[] arr = {2, 3, 10,6, 4, 8, 1};
        int n = arr.length;
        System.out.print(maxDiff2(arr, n));
        

    }
}
