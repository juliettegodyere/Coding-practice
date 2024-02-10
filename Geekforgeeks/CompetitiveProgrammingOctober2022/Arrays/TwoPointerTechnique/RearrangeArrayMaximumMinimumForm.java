package Arrays.TwoPointerTechnique;

import java.util.Arrays;

public class RearrangeArrayMaximumMinimumForm {
    public static void rearrange(long arr[], int n){
        
        // Your code here
        int i = 0, j = n-1, res = 0;
        long output[] = new long[n];
        
        while(i < j){
            output[res] = arr[j];
            output[res+1] = arr[i];
            i++;
            j--;
            res+=2;
        }
        System.out.println(Arrays.toString(output));
        for(int k = 0; k < n; k++){
            arr[k] = output[k];
        }
    }
   
    public static void main(String[] args) 
    {   
        long[] arr = {1,2,3,4,5,6};
        int n = arr.length;
        rearrange(arr, n);
        System.out.println(Arrays.toString(arr));
    }
}
