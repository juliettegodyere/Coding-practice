package BinarySearch;

public class IndexOf1stOccurrence {
    public static int getIndex(int arr[], int n, int x){
        for(int i = 0; i < n; i++){
            if(arr[i] == x){
                return i;
            }
        }
        return -1;
    }
    public static int getIndex2(int arr[], int n, int x){
        int low = 0, high = n - 1;

        while(low <= high){
            int mid = (low + high) / 2;

           if(arr[mid] > x)
                high = mid - 1;

            else if(arr[mid] < x)
                low = mid + 1;
            else{
                if(mid == 0 || arr[mid - 1] != arr[mid]){
                    return mid;
                }else{
                    high = mid - 1;
                }
            }
        }

        return -1;
    }  
    public static int getIndex3(int arr[], int low, int high, int x){

		if(low > high)
			return -1;

		int mid = (low + high) / 2;

		if(x > arr[mid])
			return getIndex3(arr, mid + 1, high, x);

		else if(x < arr[mid])
			return getIndex3(arr, low, mid - 1, x);

		else
		{
			if(mid == 0 || arr[mid - 1] != arr[mid])
				return mid;

			else
				return getIndex3(arr, low, mid - 1, x);
		}
		
    } 
    public static void main (String[] args) 
	{
	    int arr[] ={5, 10, 10, 15, 20, 20, 20};
        int n = arr.length;
        
        System.out.println(getIndex(arr, n, 20));
        System.out.println(getIndex2(arr, n, 20));
        System.out.println(getIndex3(arr, 0, n-1, 20));
	    
	}
}
