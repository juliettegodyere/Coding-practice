/**
 * The minimum jumps to reach the last element in the array from the first cell.
 * Example:
 * arr=[3,4,2,1,2,1]
 * here you can make minimum of 2 jumps. from 3 ie cell 1, you can make one jump to 
 * 4 ie the 2nd cell then from there you can make 4 jumps to the 1 ie last cell.
 * 
 * A simple solution is that we begin from the last cell, we consider all the cells 
 * from which we can reach the last cell. Then we recursively find out the minimum 
 * jumps for all those cells from which we can reach the last cell. We take the minimum
 * of all those jumps and we add 1 to it. If we have am array which the elements are
 * zero, in that case, it will not be possible to reach the last cell. In those cases,
 * we return infinite.
 */
package Recursion;

public class MinimumJumpsToEnd {
    static int minJumps(int arr[], int n) {
        if (n == 1) {
            return 0; // No jumps needed if the array has only one element
        }
        int res = Integer.MAX_VALUE;
        for (int i = 1; i < n; i++) {
            // Check if the current index 'i' along with its value can reach the end of the array
            if (i + arr[i] >= n - 1) {
                // Recursively find the minimum number of jumps needed from index 'i' onwards
                int sub_res = minJumps(arr, i);
                // Update the result if a valid solution is found
                if (sub_res != Integer.MAX_VALUE) {
                    res = Math.min(res, sub_res + 1);
                }
            }
        }
        return res;
    }
            
	public static void main (String[] args) 
	{
	    int arr[] = {3, 4, 2, 1, 2, 1}, n =6;
	    
        
        System.out.println(minJumps(arr, n));

	    
	}
}
