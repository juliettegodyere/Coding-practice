package Greedy;

import java.util.ArrayList;
import java.util.List;

class Activity{
    private int start;
    private int end;

    public Activity(int start, int end){
        this.end = end;
        this.start = start;
    }

    public int getStart(){
        return start;
    }

    public int getEnd(){
        return end;
    }


    @Override
    public String toString() {
        return "{" +
            " start='" + getStart() + "'" +
            ", end='" + getEnd() + "'" +
            "}";
    }

}

public class ActivitySelection {


    public static List<Integer> printMaxActivities(int A1[], int A2[], int n){
        List<Activity> activities = new ArrayList<>();
        for(int i = 0; i < n; i++){
            activities.add(new Activity(A1[i], A2[i]));
        }

        activities.sort((a1, a2) -> a1.getEnd() - a2.getEnd());

        List<Integer> ans = new ArrayList<>();

        ans.add(0);
        int prev = 0;
        for(int i = 1; i < activities.size(); i++){
            if(activities.get(prev).getEnd() <= activities.get(i).getStart()){
                ans.add(i);
                prev = i;
            }
        }
        return ans;
    }
    
     public static void main(String[] args)
     {
         int s[] = {1, 3, 0, 5, 8, 5};
         int f[] = {2, 4, 6, 7, 9, 9};
         int n = s.length;
  
         System.out.println(printMaxActivities(s, f, n));
     }
}
