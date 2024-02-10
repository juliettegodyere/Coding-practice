/**
 * We are given a sorted array, find the index of the element if it is present
 */
package BinarySearch;

public class IndexOfElement{
    /**
     * arr = [1, 2]
     * n = 2
     * loop 0, 1
     */
    public static int getIndex(int arr[], int n, int element){
        for(int i = 0; i < n; i++){
            if(arr[i] == element){
                return i;
            }
        }
        return -1;
    } 
    public static int getIndex2(int arr[], int n, int x){
        int low = 0, high = n - 1;

		while(low <= high)
		{
			int mid = (low + high) / 2;

			if(arr[mid] == x)
				return mid;

			else if(arr[mid] > x)
				high = mid - 1;

			else
				low = mid + 1;
		}

		return -1;
    } 
    public static int getIndex3(int arr[], int x, int low, int high){

		int mid = (low + high) / 2;
        if(low > high){
            return -1;
        }

		if(arr[mid] == x)
			return mid;

		else if(arr[mid] > x)
            getIndex3(arr, x, low, mid - 1);

			else
                getIndex3(arr, x, mid+1, high);
		
		return -1;
    } 
    public static void main (String[] args) 
	{
	    int arr[] ={1, 3, 4, 5};
        int K = 2;
        int n = arr.length;
        
        System.out.println(getIndex2(arr, n, K));
        System.out.println(getIndex3(arr, K, 0, n-1));
	    
	}
}