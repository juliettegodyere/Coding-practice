package BinarySearch;

import java.util.Arrays;

public class SmallestMissingNumber {

    static int missingNumberNaive(int arr[], int size) {
        Arrays.sort(arr);

        int missingNumber = 1;

        for (int i = 0; i < size; i++) {
            if (arr[i] == missingNumber) {
                missingNumber++;
            }
        }

        return missingNumber;
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, -1, 1};
        int size = arr.length;

        int resultNaive = missingNumberNaive(arr, size);
        System.out.println("Naive Approach: " + resultNaive);
    }
}

