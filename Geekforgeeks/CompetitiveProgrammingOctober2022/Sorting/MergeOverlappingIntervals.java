/**
 * The idea of the effecient solution is to sort the intervals. You can either sort by start time in increaing order or 
 * end time in decresing order
 */

package Sorting;

import java.util.*;

class Interval implements Comparable<Interval>
{ 
    int start, end;
    
    Interval(int start, int end)
    {
        this.start = start;
        this.end = end;
    }
    
    public int compareTo(Interval a)  { 
        return this.start - a.start; 
    }
};

public class MergeOverlappingIntervals {

    
    static void mergeIntervals(Interval arr[], int n)   {  
        Arrays.sort(arr);  
      
        int res = 0;  
       
        for (int i=1; i<n; i++) {  
            if (arr[res].end >=  arr[i].start) {   
                arr[res].end = Math.max(arr[res].end, arr[i].end);  
                arr[res].start = Math.min(arr[res].start, arr[i].start);  
            }  
            else { 
                res++; 
                arr[res] = arr[i];  
            }     
        }  
        
        for (int i = 0; i <= res; i++)  
            System.out.print(  "[" + arr[i].start + ", " + arr[i].end + "] ");  
    } 
    
    public static void main (String[] args) {
        Interval arr[] = { new Interval(5,10),new Interval(3,15),new Interval(18,30),
                                        new Interval(2,7) };
        
        int n = arr.length;
        
        mergeIntervals(arr, n);
    }
}

class MergeOverlappingIntervals2 {

    public static List<Interval> mergeIntervals(List<Interval> intervals) {
        if (intervals == null || intervals.size() <= 1) {
            return intervals;
        }

        // Sort intervals based on start times
        intervals.sort((a, b) -> Integer.compare(a.start, b.start));

        List<Interval> result = new ArrayList<>();
        Interval mergedInterval = intervals.get(0);

        for (int i = 1; i < intervals.size(); i++) {
            Interval currentInterval = intervals.get(i);

            // Check for overlap
            if (currentInterval.start <= mergedInterval.end) {
                // Merge overlapping intervals
                mergedInterval.end = Math.max(mergedInterval.end, currentInterval.end);
            } else {
                // Add non-overlapping interval to the result
                result.add(mergedInterval);
                mergedInterval = currentInterval;
            }
        }

        // Add the last merged interval to the result
        result.add(mergedInterval);

        return result;
    }

    public static void main(String[] args) {
        List<Interval> intervals = Arrays.asList(
                new Interval(1, 3),
                new Interval(2, 6),
                new Interval(8, 10),
                new Interval(15, 18)
        );

        List<Interval> mergedIntervals = mergeIntervals(intervals);

        System.out.println("Merged Intervals:");
        for (Interval interval : mergedIntervals) {
            System.out.println("[" + interval.start + ", " + interval.end + "]");
        }
    }
}
