package BinarySearch;
//https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/
//https://www.youtube.com/watch?v=ER_oLmdc-nw


public class CapacityToShipPackageWithinDDays {
    public int shipWithinDays(int[] weights, int D) {
        // Initialize the lower and upper bounds of the search space
        int lowerBound = 0;
        int upperBound = 0;
        
        for (int weight : weights) {
            lowerBound = Math.max(lowerBound, weight); // Lower bound is at least the weight of the heaviest package
            upperBound += weight; // Upper bound is the sum of all weights
        }
        
        // Perform binary search to find the minimum capacity
        while (lowerBound < upperBound) {
            int mid = lowerBound + (upperBound - lowerBound) / 2;
            int daysRequired = countDays(weights, mid);
            
            // If the number of days required is less than or equal to D, move upper bound to mid
            if (daysRequired <= D) {
                upperBound = mid;
            } 
            // If the number of days required is more than D, move lower bound to mid + 1
            else {
                lowerBound = mid + 1;
            }
        }
        
        return lowerBound;
    }
    
    // Helper method to count the number of days required to ship all packages with a given capacity
    private int countDays(int[] weights, int capacity) {
        int days = 1;
        int currentCapacity = 0;
        
        for (int weight : weights) {
            currentCapacity += weight;
            if (currentCapacity > capacity) {
                days++;
                currentCapacity = weight;
            }
        }
        
        return days;
    }
}
