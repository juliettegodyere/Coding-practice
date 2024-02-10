package BinarySearch;

public class CountOccurencesInSortedArray {
    public static int getCount(int arr[], int n, int x){
        int count = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] == x){
                 count++;
            }
        }
        return count;
    }
    static int firstOcc(int arr[], int n, int x)
	{
		int low = 0, high = n - 1;

		while(low <= high)
		{
			int mid = (low + high) / 2;

			if(x > arr[mid])
				low = mid + 1;

			else if(x < arr[mid])
				high = mid - 1;

			else
			{
				if(mid == 0 || arr[mid - 1] != arr[mid])
					return mid;

				else
					high = mid - 1;
			}

		}

		return -1;
	}

	static int lastOcc(int arr[], int n, int x)
	{
		int low = 0, high = n - 1;

		while(low <= high)
		{
			int mid = (low + high) / 2;

			if(x > arr[mid])
				low = mid + 1;

			else if(x < arr[mid])
				high = mid - 1;

			else
			{
				if(mid == n - 1 || arr[mid + 1] != arr[mid])
					return mid;

				else
					low = mid + 1;
			}

		}

		return -1;
	}
	
	
	static int countOcc(int arr[], int n, int x)
	{
		int first = firstOcc(arr, n, x);

		if(first == -1)
			return 0;
		else 
			return lastOcc(arr, n, x) - first + 1;
	}
    public static void main (String[] args) 
	{
	    int arr[] ={10,10,20, 20,20,30,30};
        int n = arr.length;
        
        System.out.println(getCount(arr, n, 20));
        // System.out.println(getIndex2(arr, n, 20));
        // System.out.println(getIndex3(arr, 0, n-1, 20));
	    
	}
}
