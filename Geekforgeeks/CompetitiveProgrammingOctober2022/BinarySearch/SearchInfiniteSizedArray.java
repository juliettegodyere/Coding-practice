package BinarySearch;

public class SearchInfiniteSizedArray {
    static int search(int arr[], int x)
	{
		int i = 0;

		while(true)
		{
			if(arr[i] == x) return i;

			if(arr[i] > x) return -1;

			i++;
		}
	}
    static int bSearch(int arr[], int low, int high, int x)
		{
			if(low > high)
				return -1;

			int mid = (low + high) / 2;

			if(arr[mid] == x)
				return mid;

			else if(arr[mid] > x)
				return bSearch(arr, low, mid - 1, x);

			else
				return bSearch(arr, mid + 1, high, x);
		}
    /**
     * You can not directly apply binary search because there is no high. Even if
     * you have high, it will be too big for any type.
     * An hint is that your time complexity is 0(log(pos)). You get lagarithmic time
     * complexity when you divide a number by 2 or when multiplying by 2 to read that 
     * number. This binary search is kniwn as unbounded bianry search
     * 
     */

	static int search2(int arr[], int x)
	{
		if(arr[0] == x) return 0;

		int i = 1;
        int prevIdx = 0;

		while(arr[i] < x)
			i = i * 2;
            prevIdx = i;

		if(arr[i] == x) return i;

        //I decided to store the previous index and use it in place of the low
		//return bSearch(arr, i / 2 + 1, i - 1, x);
        return bSearch(arr, prevIdx, i - 1, x);
	}

	public static void main(String args[]) 
    {

		int arr[] = {1, 2, 3, 40, 50};

		int x = 4;

		System.out.println(search(arr, x));
        System.out.println(search2(arr, x));
    } 

}
