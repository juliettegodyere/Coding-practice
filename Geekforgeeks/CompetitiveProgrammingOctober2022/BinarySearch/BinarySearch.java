package BinarySearch;

public class BinarySearch {

    public static int search(int arr[], int n, int x){
        int l = 0;
        int r = n-1;

        while(l <= r){
            int mid = (l+r)/2;

            if(arr[mid] == x){
                return mid;
            }else if(arr[mid] > x){
                r = mid-1;
            }else {
                l = mid + 1;
            }
        }
        return -1;
    }
    
    public static void main (String[] args) 
	{
	    int arr[] ={30,10,50, 20,90,30,70};
        int n = arr.length;
        
        System.out.println(search(arr, n, 20));
        // System.out.println(getIndex2(arr, n, 20));
        // System.out.println(getIndex3(arr, 0, n-1, 20));
	    
	}
}
