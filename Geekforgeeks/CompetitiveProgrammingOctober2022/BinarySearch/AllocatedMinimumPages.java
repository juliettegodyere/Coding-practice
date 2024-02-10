package BinarySearch;
/**
 * We need to ensure that books are asigned to this students in such a way that the maximum number of pages
 * read by a student is minimized.
 */
public class AllocatedMinimumPages {
    static int minPages(int arr[], int k){
        //The min number of pages a student can read
        int maxVal = Integer.MIN_VALUE;
        //Max number of pages a student can read
        int sum = 0;
        int n = arr.length;
        for(int i = 0; i < n; i++){
            maxVal = Math.max(maxVal, arr[i]);
            sum+=arr[i];
        }

        int low = maxVal;
        int high = sum;
        int res = 0;
        while(low <= high){
            int mid = (low + (high - low))/2;
            
            if(isFeasible(arr, mid, k)){
                res = mid;
                high = mid -1;
            }else{
                low = mid+1;
            }

            
        }
        return res;
    }

    static boolean isFeasible(int arr[], int mid, int k){
        int currentSum = 0;
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(currentSum+arr[i] > mid){ 
                count++;
                currentSum = arr[i];
            }else{
                currentSum+=arr[i];
            }
        }
        return count <= k;
    }
}
