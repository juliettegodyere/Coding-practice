package GoldmanSachProblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Interval {
    int start;
    int end;
    int nextStart;

    public Interval(int start, int end, int nextStart) {
        this.start = start;
        this.end = end;
        this.nextStart = nextStart;
    }
}

public class CorrectOrderIntervals {

    public static List<Interval> correctOrderIntervals(List<Interval> intervals) {
        if (intervals == null || intervals.isEmpty()) {
            return new ArrayList<>();
        }

        // Step 1: Sort intervals based on start points
        Collections.sort(intervals, Comparator.comparingInt(a -> a.start));

        // Step 2: Link intervals based on the next interval's start point
        for (int i = 0; i < intervals.size() - 1; i++) {
            intervals.get(i).nextStart = intervals.get(i + 1).start;
        }

        // Step 3: Return the intervals
        return intervals;
    }

    public static void main(String[] args) {
        List<Interval> intervals = new ArrayList<>();
        intervals.add(new Interval(1, 3, 5));
        intervals.add(new Interval(5, 7, 9));
        intervals.add(new Interval(3, 5, 7));
        intervals.add(new Interval(9, 11, 13));

        List<Interval> result = correctOrderIntervals(intervals);

        for (Interval interval : result) {
            System.out.println("[" + interval.start + ", " + interval.end + ", " + interval.nextStart + "]");
        }
    }
}

