package Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeOverlappingIntervals2 {
    public static List<String> mergeIntervals(List<String> intervals) {
        if (intervals == null || intervals.isEmpty()) {
            return new ArrayList<>();
        }

        intervals.sort(Comparator.comparingInt((interval) -> Integer.parseInt(interval.split(",")[0])));
        //"[1,3]", "[2,6]", "[8,10]", "[15,18]") after sorting

        List<String> mergedIntervals = new ArrayList<>();
        String currentInterval = intervals.get(0);

        for (int i = 1; i < intervals.size(); i++) {
            String nextInterval = intervals.get(i);

            int currentEnd = Integer.parseInt(currentInterval.split(",")[1]);
            int nextStart = Integer.parseInt(nextInterval.split(",")[0]);

            if (currentEnd >= nextStart) {
                // Overlapping intervals, merge them
                int mergedEnd = Math.max(Integer.parseInt(currentInterval.split(",")[1]),
                                         Integer.parseInt(nextInterval.split(",")[1]));
                currentInterval = "[" + currentInterval.split(",")[0] + ", " + mergedEnd + "]";
            } else {
                // Non-overlapping interval, add the current interval to the result
                mergedIntervals.add(currentInterval);
                currentInterval = nextInterval;
            }
        }

        // Add the last interval
        mergedIntervals.add(currentInterval);

        return mergedIntervals;
    }

    public static void main(String[] args) {
        List<String> intervals = Arrays.asList("[1,3]", "[2,6]", "[8,10]", "[15,18]");
        

        List<String> mergedIntervals = mergeIntervals(intervals);

        System.out.println("Merged Intervals:");
        for (String interval : mergedIntervals) {
            System.out.println(interval);
        }
    }
}
