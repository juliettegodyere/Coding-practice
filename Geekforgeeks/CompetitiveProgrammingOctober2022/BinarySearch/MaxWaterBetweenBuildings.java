package BinarySearch;

public class MaxWaterBetweenBuildings {

    static int maxWater(int height[], int n) {
        int left = 0;
        int right = n - 1;
        int maxWater = 0;

        while (left < right) {
            // Calculate width between two buildings
            int width = right - left;

            // Calculate height of the water level at the current position
            int minHeight = Math.min(height[left], height[right]);

            // Calculate the water trapped between the buildings at the current position
            int currentWater = width * minHeight;

            // Update maxWater if the current water is greater
            maxWater = Math.max(maxWater, currentWater);

            // Move the pointers towards each other based on which building is shorter
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxWater;
    }

    public static void main(String[] args) {
        int[] height = {3, 0, 0, 2, 0, 4};
        int n = height.length;

        int result = maxWater(height, n);
        System.out.println("Maximum water trapped between two buildings: " + result);
    }
}

