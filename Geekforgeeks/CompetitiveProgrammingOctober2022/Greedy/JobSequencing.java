package Greedy;

import java.util.ArrayList;
import java.util.List;

/**
 * 1. One Unit by every job
 * 2. Only one job can be assigned at a time
 * 3. Time starts with 0
 * https://www.youtube.com/watch?v=LjPx4wQaRIs
 */

 class Job {
    private int deadlines;
    private int profit;

    public Job(int deadlines, int profit) {
        this.deadlines = deadlines;
        this.profit = profit;
    }

    public int getDeadlines() {
        return deadlines;
    }

    public int getProfit() {
        return profit;
    }
}

public class JobSequencing {
     public static List<Integer> printMaxActivities(int deadline[], int profit[], int n) {
        List<Job> activities = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            activities.add(new Job(deadline[i], profit[i]));
        }
        // 1. Sort every jobs in decreasing order of the profit
        activities.sort((a, b) -> Double.compare(b.getProfit(), a.getProfit())); // Use Double.compare for sorting

        //2.  Initialize the result as first job in the sorted list. Assign the latest possible slot
        boolean slots[] = new boolean[n];

        int maxDeadline = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
           maxDeadline = Math.max(maxDeadline, activities.get(i).getDeadlines());
        }
        int result[] = new int[maxDeadline + 1];

        for (int i = 1; i < result.length; i++) {
            result[i] = -1;
        }

        int countJob =0, countProfit = 0;

        //Iterate all given jobs
        for (int i = 0; i < activities.size(); i++) { 
            //Find a free possible slot. (Note that we start from the last possible start)
           for(int j = activities.get(i).getDeadlines(); j > 0; j--){

                //Free slot found
                if(result[j] == -1){
                    result[j] = i; //Add this job to result
                   countJob++;
                   countProfit+=activities.get(i).getProfit();
                    break;
                }
           }
        }
       List<Integer> res = new ArrayList<>();
       res.add(countJob);
       res.add(countProfit);
        return res;
    }

    public static void main(String[] args) {
        int deadline[] = {4, 5, 6, 6, 4, 2, 2, 2};
        int profit[] = {20, 60, 70, 65, 25, 80, 10, 22};
        int n = profit.length;

        System.out.println(printMaxActivities(deadline, profit, n));
    }
}
