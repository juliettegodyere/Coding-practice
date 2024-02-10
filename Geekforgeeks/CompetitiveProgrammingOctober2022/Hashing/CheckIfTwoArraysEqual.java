package Hashing;

import java.util.HashMap;
import java.util.Map;

public class CheckIfTwoArraysEqual {
    static boolean areEqual(int[] A, int[] B) {
        if (A.length != B.length) {
            return false; // Arrays of different lengths cannot be equal
        }

        // Create frequency maps for both arrays
        Map<Integer, Integer> frequencyMapA = new HashMap<>();
        Map<Integer, Integer> frequencyMapB = new HashMap<>();

        // Update frequency map for array A
        for (int num : A) {
            frequencyMapA.put(num, frequencyMapA.getOrDefault(num, 0) + 1);
        }

        // Update frequency map for array B
        for (int num : B) {
            frequencyMapB.put(num, frequencyMapB.getOrDefault(num, 0) + 1);
        }

        // Compare frequency maps
        return frequencyMapA.equals(frequencyMapB);
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 5, 4, 0};
        int[] B = {2, 4, 5, 0, 1};

        if (areEqual(A, B)) {
            System.out.println("Arrays are equal.");
        } else {
            System.out.println("Arrays are not equal.");
        }
    }
}
