package Sorting;
//This prblem is the same as the maximum quest problem
import java.util.Arrays;

public class MinimumPlatform {
    public static void main (String[] args) 
    {
        int arr[] = {900, 1100, 1235};
        int dep[] = {1000, 1200, 1240};
      
        int n = arr.length; 
        
        System.out.print(findPlatform(arr,dep, n));
        
    }

    static int findPlatform(int arr[], int dep[], int n)
    {
        // add your code here
        Arrays.sort(arr);
        Arrays.sort(dep);
        
        int platformsNeeded = 1; 
        int maxPlatforms = 1;
        int i = 1, j = 0;
        
         while (i < n && j < n) {
            if (arr[i] <= dep[j]) {
                platformsNeeded++;
                i++;
            } 
            else {
                platformsNeeded--;
                j++;
            }
            maxPlatforms = Math.max(maxPlatforms, platformsNeeded);
        }
        return maxPlatforms;
    }
}
