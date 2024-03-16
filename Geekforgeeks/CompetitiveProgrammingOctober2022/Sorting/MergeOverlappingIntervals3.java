package Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * 
To merge overlapping intervals, you can follow these steps:

1. Sort the intervals based on their start points.
2. Initialize an empty list to store the merged intervals.
3. Iterate through the sorted intervals and merge overlapping ones.
https://www.youtube.com/watch?v=dzNIPX7HY6A
 */

public class MergeOverlappingIntervals3 {
    public static int[][] mergeIntervals(int[][] intervals) {
        if (intervals == null || intervals.length <= 1) {
            return intervals;
        }

        // Sort intervals based on their start points
        Arrays.sort(intervals, Comparator.comparing((interval) -> interval[0]));

        List<int[]> mergedIntervals = new ArrayList<>();
        int[] currentInterval = intervals[0];

        for (int i = 1; i < intervals.length; i++) {
            int[] nextInterval = intervals[i];

            if (currentInterval[1] >= nextInterval[0]) {
                // Overlapping intervals, merge them
                currentInterval[1] = Math.max(currentInterval[1], nextInterval[1]);
            } else {
                // Non-overlapping intervals, add currentInterval to the result and update currentInterval
                mergedIntervals.add(currentInterval);
                currentInterval = nextInterval;
            }
        }

        // Add the last interval to the result
        mergedIntervals.add(currentInterval);

        // Convert the list to a 2D array
        int[][] result = new int[mergedIntervals.size()][2];
        for (int i = 0; i < mergedIntervals.size(); i++) {
            result[i] = mergedIntervals.get(i);
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] intervals = {{1, 3}, {2, 4}, {6, 8}, {9, 10}};
        int[][] merged = mergeIntervals(intervals);

        for (int[] interval : merged) {
            System.out.println(Arrays.toString(interval));
        }
    }
}
