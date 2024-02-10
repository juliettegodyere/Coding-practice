/** The values that are presented in the array are heights of box.
 * So you have different sizes of different box. Example of your array size os 
 * [2,0,2], the sizes of your box is 2, 0, 2. The question is how much water you can collect
 * between the start and the end boxes. if your array is in increasing or decreasing order,
 * you will collect no water.
 * 
 */
package Arrays;

public class TrappingRainWater {
    /* The Naive aproach. You can not store water in the rightmose or the leftmost box.
    you can only store water in the midle boxes. That is why we started the loop from 1 to n - 1.
    For find the maximum value on the right side and the maximum value on the left side. if we have
    [3, 0, 1, 2 ,5], lmax = 3 and rmax = 5. The min(lmax, rmax) = 3, 
     Time complexity Theta(N^2)
     */
    static int getWater(int arr[], int n){
        int res = 0;
        for(int i = 1; i < n-1; i++){
            int lMax = arr[i];
            for(int j = 0; j < i; j++){
                lMax = Math.max(lMax, arr[j]);
            }
            int rMax = arr[i];
            for(int j = i+1; j < n; j++){
                rMax = Math.max(rMax, arr[j]);
            }
            res = res + (Math.min(lMax, rMax) - arr[i]);
        }
        return res;
    }
    //Efficient method. Time complexity Theta(N) and Theta(N) space
    static int getWater2(int arr[], int n){
        int res = 0;
        int lMax[] = new int[n];
        int rMax[] = new int[n];

        lMax[0] = arr[0];
        for(int i = 1; i < n; i++){
            lMax[i] = Math.max(arr[i], lMax[i-1]);
        }
        rMax[n-1] = arr[n-1];
        for(int i = n-2; i >= 0; i--){
            rMax[i] = Math.max(arr[i], rMax[i+1]);
        }
        for(int i = 1; i < n-1; i++){
            res = res + (Math.min(lMax[i], rMax[i]) - arr[i]);
        }
        return res;

    }

    public static void main(String[] args) 
    {   
        int[] arr = {5, 0, 6, 2, 3};
        int n = arr.length;
        System.out.print(getWater(arr, n));
        System.out.print(getWater2(arr, n));
    }
}
