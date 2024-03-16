package Arrays.subarrays;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class GenerateAllSubarrays {
    public static List<List<Integer>> generateSubarrays(int[] arr) {
        List<List<Integer>> subarrays = new ArrayList<>();
        int n = arr.length;

        // Outer loop for the start index of subarrays
        for (int start = 0; start < n; start++) {
            List<Integer> subarray = new ArrayList<>();
            // Inner loop for the end index of subarrays
            for (int end = start; end < n; end++) {
                // Add the current element to the subarray
                subarray.add(arr[end]);
                // Add the subarray to the list of subarrays
                subarrays.add(new ArrayList<>(subarray));
            }
        }
        return subarrays;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        List<List<Integer>> result = generateSubarrays(arr);
        for (List<Integer> subarray : result) {
            System.out.println(subarray);
        }
    }
}
