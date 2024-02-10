package Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MeetingMaximumQuest {
    public static void main (String[] args) 
    {
        int arr[] = { 900, 600, 700};
        int dep[] = { 1000, 800, 730};
        int n = arr.length; 
        
        System.out.print(maxGuest(arr,dep, n));
        
    }
    static int maxGuest(int arr[],int dep[],int n)  
    {  
        Arrays.sort(arr);
        Arrays.sort(dep);
        
        int i=1,j=0,res=1,curr=1;
        while(i<n && j<n){
            if(arr[i]<dep[j]){
                curr++;i++;
            }
            else{
                curr--;j++;
            }
            res=Math.max(curr,res);
        }
       return res;
    } 
}

class Event {
    int time;
    char type;

    Event(int time, char type) {
        this.time = time;
        this.type = type;
    }
}

class MaximumGuests {

    public static int maxGuests(List<Event> events) {
        Collections.sort(events, (a, b) -> {
            if (a.time != b.time) {
                return Integer.compare(a.time, b.time);
            } else {
                // Prioritize departure events over arrival events if times are equal
                return a.type - b.type;
            }
        });

        int maxGuests = 0;
        int currentGuests = 0;

        for (Event event : events) {
            if (event.type == 'A') {
                currentGuests++;
            } else {
                currentGuests--;
            }

            maxGuests = Math.max(maxGuests, currentGuests);
        }

        return maxGuests;
    }

    public static void main(String[] args) {
        List<Event> events = new ArrayList<>();
        events.add(new Event(1, 'A'));
        events.add(new Event(2, 'A'));
        events.add(new Event(5, 'D'));
        events.add(new Event(7, 'A'));
        events.add(new Event(8, 'D'));

        int result = maxGuests(events);

        System.out.println("Maximum Guests at the Same Time: " + result);
    }
}
