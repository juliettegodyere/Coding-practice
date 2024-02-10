package BinarySearch;

public class MinNumberSortedRotatedArray {
    static int minNumber(int arr[], int low, int high) {
        while (low < high) {
            int mid = low + (high - low) / 2;

            // Check if the minimum element is in the left or right half
            if (arr[mid] > arr[high]) {
                low = mid + 1;
            } else if (arr[mid] < arr[high]) {
                high = mid;
            } else {
                // Handle the case where arr[mid] is equal to arr[high]
                // Move the high pointer one step left
                high--;
            }
        }

        return arr[low];
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int result = minNumber(arr, 0, arr.length - 1);
        System.out.println("Minimum number in the sorted rotated array: " + result);
    }
}
