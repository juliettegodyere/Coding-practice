package Greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * https://www.hackerrank.com/challenges/mark-and-toys/problem?isFullScreen=true
 */

public class MaximumToys {
    public static int maximumToys(List<Integer> prices, int k) {
        // Write your code here
        List<Integer> res = new ArrayList<>();
         Collections.sort(prices);
        int curr = k;
        for(int i = 0; i < prices.size(); i++){
            if(prices.get(i) <= curr){
                curr -= prices.get(i);
                res.add(prices.get(i));
            }else{
                break;
            }
        }
        return res.size();

    }
    public static void main(String[] args)
     {
         List<Integer> prices = new ArrayList<>(Arrays.asList(1, 12, 5, 111, 200, 1000, 10));
         int n = prices.size();
         System.out.println(maximumToys(prices, 50));
     }
}
