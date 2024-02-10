/**
 * You are given sorted and rotated array, our task is to find the 
 * index of the given element if it is present orderwise return minus one.
 * Here we dont know how many times the array have been rotated but we know
 * that it is sorted and rotated.
 */
package BinarySearch;

public class SearchSortedRotatedArray {
    static int search(int arr[], int n, int x)
	{
		for(int i = 0; i < n; i++)
			if(arr[i] == x)
				return i;

		return -1;
	}
    /**
     * Efficient approach.
     * @param arr
     * @param n
     * @param x
     * @return
     */
    static int search2(int arr[], int n, int x)
	{
		int low = 0, high = n - 1;

		while(low <= high)
		{
			int mid = (low + high) / 2;

			if(arr[mid] == x)
				return mid;
			if(arr[low] < arr[mid]){
				if(x >= arr[low] && x < arr[mid])
					high = mid - 1;
				else 
					low = mid + 1;
			}else{
				if(x > arr[mid] && x <= arr[high])
					low = mid + 1;
				else
					high = mid - 1;
			}
		}
		

		return -1;
	}

	public static void main(String args[]) 
    {

		int arr[] = {100, 200, 400, 1000, 10, 20}, n = 6;

		int x = 10;

        System.out.println(search(arr, n, x));

    } 
}
