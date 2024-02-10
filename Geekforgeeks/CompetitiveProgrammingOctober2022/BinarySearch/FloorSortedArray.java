package BinarySearch;

public class FloorSortedArray {
    static int findFloor(long arr[], int n, long x){
        if(arr[0] > x){
            return -1;
        }else if(arr[n-1] < x){
            return -1;
        }else{
            for(int i = 0; i < n; i++){
                if(arr[i] == x){
                    return i;
                }else if (arr[i] > x){
                    return i-1;
                }
            }
        }
        return -1;
    } 

    static int findFloor2(long arr[], int n, long x)
    {
        int ans = -1;
        
        int l = 0; int r = n-1;
        
        while(l<=r){
            int mid = (l+r)/2;
            
            if(x == arr[mid]){
                return mid;
            }else if(x < arr[mid]){
                r = mid - 1;
            }else{
                l = mid + 1;
                ans = mid;
            }
        }
        return ans;
    }

    public static void main(String[] args) 
    {   
        long[] arr = {1,2,8,10,11,12,19};
        int n = arr.length;
        System.out.println(findFloor(arr, n, 5L));
    }
}
