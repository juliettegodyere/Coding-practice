package Sorting;

import java.util.Arrays;

public class MeetingMaximumQuests {
    static public int maxEvents(int[][] events) {
        Arrays.sort(events, (a, b) -> Integer.compare(a[1], b[1]));

        boolean[] attended = new boolean[100001];
        int count = 0;

        for (int[] event : events) {
            for (int day = event[0]; day <= event[1]; day++) {
                if (!attended[day]) {
                    attended[day] = true;
                    count++;
                    break;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[][] events = {{1, 2}, {2, 3}, {3, 4}};
        int result = maxEvents(events);
        System.out.println("Maximum number of events you can attend: " + result);
    }
}
