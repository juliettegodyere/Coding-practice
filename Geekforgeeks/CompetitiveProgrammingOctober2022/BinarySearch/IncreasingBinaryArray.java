package BinarySearch;

public class IncreasingBinaryArray {
    public static int countOnes(int arr[], int n){
        int count = 0;

        for(int i = 0; i < n; i++){
            if(arr[i] == 1){
                count++;
            }
        }

        return count;
    }
    /**arr[] = {0, 0, 1, 1, 1, 1}, n = 6;
     * low = 0, high = 6
     * low <= high yes
     * mid = 3
     * arr[3] == 0 No
     * mid == 0 || arr[2] == 0 No
     * high = 2
     * mid = 0 + 2 / 2 = 1
     * arr[1] == 0 yes
     * low = 1+1 = 2
     * low == high
     * mid = 2
     * arr[2] == 0 No
     * mid == 0 no
     * arr[1] == 0 yes
     * 6-2 = 4
     * 
     */
    static int countOnes2(int arr[], int n)
	{
		int low = 0, high = n - 1;

		while(low <= high)
		{
			int mid = (low + high) / 2;

			if(arr[mid] == 0)
				low = mid + 1;
			else
			{
				if(mid == 0 || arr[mid - 1] == 0)
					return (n - mid);
				else 
					high = mid -1;
			}
		}

		return 0;		
	}
    public static void main (String[] args) 
	{
	    int arr[] ={0,0,0, 1,1,1,1};
        int n = arr.length;
        
        System.out.println(countOnes(arr, n));
        System.out.println(countOnes2(arr, n));
	}
}
