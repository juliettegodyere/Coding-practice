/**
 * You are given an array, you need to find the peak element. A peak element is
 * called a peak element if it is not smaller than it's neighbours.
 * Example
 * arr = [5,10,20,15,7]
 * In this case, 20 is the peak element
 */
package BinarySearch;

import java.util.Arrays;

public class FindPeakElement {
    public static int findPeak(int aa[], int n){
        if(n == 1)
			return aa[0];
		if(aa[0] >= aa[1])
			return aa[0];
		if(aa[n - 1] >= aa[n - 2])
			return aa[n - 1];
        for(int i =1; i < n; i++){
            if(aa[i-1] <= aa[i] && aa[i+1] <= aa[i] ){
                return aa[i];
            }
        }
        return -1;
    }
    /**
     * The appraoch is, we go to the middle element, then we check if mid is a peak 
     * element or not. How do we decide that we need to go to the left side or the
     * right half. There is an interesting fact - if the left element ie is the element
     * just before the mid is greater than or equal to the mid, then there would always 
     * be a peak in the left half otherwise, there would be a peak on the right side.
     * @param arr
     * @param n
     * @return
     */
    static int getPeak(int arr[], int n)
	{
		int low = 0, high = n - 1;

		while(low <= high)
		{
			int mid = (low + high) / 2;

			if((mid == 0 || arr[mid - 1] <= arr[mid]) &&
				(mid == n - 1 || arr[mid + 1] <= arr[mid]))
				return mid;
			if(mid > 0 && arr[mid - 1] >= arr[mid])
				high = mid -1;
			else
				low = mid + 1;
		}
		
		return -1;
	}
    public static int peak(int arr[], int n){
        Arrays.sort(arr);
        return arr[n-1];
    }
    public static void main(String args[]) 
    {

		int arr[] = {80, 70,60};

		int n = arr.length;

        System.out.println(findPeak(arr, n));
        System.out.println(peak(arr, n));

    } 
}
