package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class ReverseArrayInGroup {
    public static void reverseSubarrays(int[] arr, int k) {
        int n = arr.length;
        for (int i = 0; i < n; i += k) {
            int left = i;
            int right = Math.min(i + k - 1, n - 1); // Calculate the end index of the current subarray
            while (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8};
        int k1 = 3;
        reverseSubarrays(arr1, k1);
        System.out.println("Reversed array: " + Arrays.toString(arr1));

        int[] arr2 = {1, 2, 3, 4, 5, 6};
        int k2 = 5;
        reverseSubarrays(arr2, k2);
        System.out.println("Reversed array: " + Arrays.toString(arr2));
    }
}
