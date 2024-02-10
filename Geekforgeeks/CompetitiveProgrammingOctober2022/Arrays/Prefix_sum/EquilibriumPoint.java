/**
 * Given an array of integers, find if it has equilibruim point.
 * Equilibrium point is a point such that some of the elements before it
 * is equal to some of the element after it.
 * Example
 * arr[] = [3, 4, 8, -9, 20, 6]
 * 20 is the point of equilibruim because the sum of 3+4+8+-9 = 6 and 6 is
 * after 20.
 */

package Arrays.Prefix_sum;

public class EquilibriumPoint {
    //Naive solution
    static boolean isEquilibiurmPoint(int[] arr, int n){
        for(int i = 0; i < n; i++){
            int l_sum = 0; int r_sum = 0;
            for(int j = 0; j < i; j++){
                l_sum += arr[j];
            }
            for(int k = i+1; k < n; k++){
                r_sum += arr[k];
            }
            if(l_sum == r_sum){
                //return arr[i];
                return true;
            }
        }
        return false;
    }
    /**
     * We are using the prefix sum technique but we do not compute prefix sum
     * The idea is, we first compute the total sum of the array. Then we compute from left to right
     */

     static boolean isEquilibiurmPoint2(int[] arr, int n){
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += arr[i];
        }
        int l_sum = 0;
        for(int i = 0; i < n; i++){
            if(l_sum == sum - arr[i]){
                return true;
            }
            l_sum += arr[i];
            sum -= arr[i];
        }
        return false;
    }
}
