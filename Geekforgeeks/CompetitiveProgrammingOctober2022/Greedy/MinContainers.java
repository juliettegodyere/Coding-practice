package Greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/**
 * https://www.hackerrank.com/challenges/priyanka-and-toys/problem?isFullScreen=true
 */
public class MinContainers {
    public static int toys(List<Integer> w) {
    // Write your code here
        Collections.sort(w);
        int containers = 0;
        int minWeight = Integer.MAX_VALUE;

        for (int weight : w) {
            if (weight > minWeight + 4) { 
                minWeight = weight;
                containers++; 
            }
        }

        return containers;
    }
    public static void main(String[] args)
     {
         List<Integer> prices = new ArrayList<>(Arrays.asList(1, 2, 3, 21, 7, 12, 14, 21));
         int n = prices.size();
         System.out.println(toys(prices));
     }
}
