package Hashing;

import java.util.HashSet;

public class TripletWithGivenSumUnsorted {
    // Function to find a triplet with a given sum in an unsorted array
    static boolean findTriplet(int[] arr, int targetSum) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            HashSet<Integer> set = new HashSet<>();
            int currentSum = targetSum - arr[i];

            for (int j = i + 1; j < n; j++) {
                int remainingSum = currentSum - arr[j];

                if (set.contains(remainingSum)) {
                    System.out.println("Triplet found: " + arr[i] + ", " + arr[j] + ", " + remainingSum);
                    return true; // Triplet found
                }

                set.add(arr[j]);
            }
        }

        return false; // No triplet found
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 45, 6, 10, 8};
        int targetSum = 22;

        boolean result = findTriplet(arr, targetSum);

        if (!result) {
            System.out.println("No triplet found with sum " + targetSum);
        }
    }
}
