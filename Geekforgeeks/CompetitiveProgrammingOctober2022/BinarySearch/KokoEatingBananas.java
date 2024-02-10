package BinarySearch;
    //https://leetcode.com/problems/koko-eating-bananas/
    //https://www.youtube.com/watch?v=U2SozAs9RzA

import java.util.ArrayList;
import java.util.Arrays;
/**
 * Find the minimum eating speed k that koko can eat all the bananas
 * [3,6,7,11], h=8, find k which is the total eating speed it will take koko to eat all the bananas
 * The min number of k = 1, else we are not eating any bananas. and the max number is going to be 
 * the max number in the pile which in the case is 11
 * https://www.youtube.com/watch?v=U2SozAs9RzA
 */

public class KokoEatingBananas {

    //Brute force by me
    static int eatingSpeed(int arr[], int h){
        int n = arr.length;
        int maxVal = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            maxVal = Math.max(maxVal, arr[i]);
        }
        int minSpeed = Integer.MAX_VALUE;
        for(int i = 1; i < maxVal; i++){
            int time = 0;
            for(int j =0; j < n; j++){
                time = time + ((arr[j] + i -1)/i);
            }
            if(time <= h){
                minSpeed = Math.min(minSpeed, i);
            }
        }
        return minSpeed;
    }

    //Brute force by chatGPT
    public int minEatingSpeed(int[] piles, int H) {
        // Determine the range of eating speeds
        int minSpeed = 1;
        int maxSpeed = Arrays.stream(piles).max().getAsInt();

        // Iterate through eating speeds within the range
        int minEatingSpeed = Integer.MAX_VALUE;
        for (int speed = minSpeed; speed <= maxSpeed; speed++) {
            int time = calculateTime(piles, speed);
            if (time <= H) {
                minEatingSpeed = Math.min(minEatingSpeed, speed);
            }
        }

        return minEatingSpeed;
    }
    //Efficient approach
    public int minEatingSpeedEff(int[] piles, int H) {
        // Find the search space
        int minSpeed = 1;
        int maxSpeed = Arrays.stream(piles).max().getAsInt();
        
        // Perform binary search
        while (minSpeed < maxSpeed) {
            int mid = minSpeed + (maxSpeed - minSpeed) / 2;
            int time = calculateTime(piles, mid);
            
            // Adjust the search space based on the time taken
            if (time <= H) {
                maxSpeed = mid;
            } else {
                minSpeed = mid + 1;
            }
        }
        
        return minSpeed;
    }

    // Helper method to calculate the total time taken to eat all bananas with a given eating speed
    private int calculateTime(int[] piles, int speed) {
        int time = 0;
        for (int bananas : piles) {
            time += (bananas + speed - 1) / speed; // Ceil division to account for remaining bananas
        }
        return time;
    }

    
    public static void main(String[] args){
        int arr[] = {3, 6, 7, 11};
        int h = 8;

        System.out.println(eatingSpeed(arr, h));
    }

}