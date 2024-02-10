/**
 * Subset generation: /Users/julietnkwor/Documents/workspace/Juliette/Geekforgeeks/CompetitiveProgrammingOctober2022/Recursion/SubsetGeneration.java
 * https://www.techiedelight.com/maximum-product-subset-problem/
 */
package Recursion;

import java.util.*;

public class SubsetProductMaximum {
    public static int findMaxProduct(List<Integer> set, int maximum){
        int product = 1;
        for(int i: set){
            product = product*i;
        }
        if(set.size() != 0){
            maximum = Integer.max(maximum, product);
        }
        return maximum;
    }
    static int findPowerSet(List<Integer> S, List<Integer> set,int n, int maximum){
        if(n == 0){
            return findMaxProduct(set, maximum);
        }
         // consider the n'th element
         set.add(S.get(n - 1));
         maximum = findPowerSet(S, set, n - 1, maximum);
  
         set.remove(set.size() - 1);            // backtrack
  
         // or don't consider the n'th element
         return findPowerSet(S, set, n - 1, maximum);
    }
    public static void main(String[] args)
    {
        //List<Integer> S = Arrays.asList(-6, 4, -5, 8, -10, 0, 8);
        List<Integer> S = Arrays.asList(10,20,15);
        int n = S.size();

        List<Integer> set = new ArrayList<>();
        int maximum = findPowerSet(S, set, n, Integer.MIN_VALUE);
 
        System.out.println("The maximum product of a subset is " + maximum);
    }
}
