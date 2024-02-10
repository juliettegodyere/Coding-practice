package BinarySearch;

public class NonIncreasingBinaryArray {
    public static int countOnes(int arr[], int n){
        int count = 0;

        for(int i = 0; i > n; i++){
            System.out.println(count);
            if(arr[i] == 1){
                count++;
            }
        }

        return count;
    }
    /**
     * arr[] = {1,1,1,1,1,0,0,0}
     * low = 0, high = n-1
     * mid = 4
     * arr[4] == 0 No
     * mid == 8 || arr[5] == 0 yes
     * mid = 4+1 = 5;
     * 
     * arr[] = {1,1,0,0,0,0,0,0}
     * low = 0, high = n-1
     * mid = 4
     * arr[4] == 0 yes
     * high = 3
     * mid = 1
     * arr[i] == 0 no
     * mid == 0 || arr[2] == 0 yes
     * mid = 2
     */
    public static int countOnes1(int arr[], int N){
        
        // Your code here
        int low = 0, high = N - 1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid] == 0){
                high = mid-1;
            }else{
                if(mid == N-1 || arr[mid+1] == 0){
                    return (mid+1);
                }else{
                    low = mid+1;
                }
            }
        }
        return -1;
        
    }
    public static void main (String[] args) 
	{
	    int arr[] ={1,1,1,1,0,0,0};
        int n = arr.length;
        
        System.out.println(countOnes(arr, n));
        System.out.println("Testing");
	}
}
