package Problems;

import java.util.Arrays;

public class countNOverKOccurence {
    public static int countOccurence(int arr[], int n, int k){
        int app = n/k;
        int total_count = 0;
        for(int i = 0; i < n; i++){
            int cur_count = 1;
            for(int j = i+1; j < n; j++){
                if(arr[i] == arr[j]){
                    cur_count++;
                }
            }
            //System.out.println(cur_count);
            if(cur_count > app){
                total_count++;
            }
        }
        return total_count;
    }
    public static int maxElement(int arr[], int n){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            max = Math.max(max, arr[i]);
        }
        return max;
    }
    /**
     * This code passed 155 test cases
     */
    public static int countOccurence2(int arr[], int n, int k){
        int app = n/k;
        int max = Math.max(maxElement(arr, n),n);
        int temp[] = new int[max+1];
        int total_count = 0;
        
        System.out.println(maxElement(arr, n));
        for(int i = 0; i < n; i++){
            temp[arr[i]]++;
        }
        for(int i = 0; i < temp.length; i++){
            if(temp[i] > app){
                total_count++;
                System.out.println(total_count);
            }
        }
       // System.out.println(Arrays.toString(temp));
        return total_count;
    }

    public static void main(String[] args) 
    {   
        int[] arr = {484, 98, 484};
        int n = arr.length;
        int k = 3;
        System.out.println(countOccurence2(arr, n, k));
    }
}
