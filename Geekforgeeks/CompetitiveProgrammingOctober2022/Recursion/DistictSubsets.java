/**
 * https://www.techiedelight.com/print-distinct-subsets-given-set/
 * https://www.youtube.com/watch?v=u40eYbmT9zg
 * /Users/julietnkwor/Documents/workspace/Juliette/Geekforgeeks/CompetitiveProgrammingOctober2022/Recursion/SubsetGeneration.java
 */
package Recursion;

import java.util.*;

public class DistictSubsets {
     // Function to generate power set of a given set `S`
     public static void printPowerSet(int[] S, Deque<Integer> set, int n)
     {
        Arrays.sort(S);
         // if we have considered all elements
         if (n<0)
         {
             System.out.println(set);
             return;
         }
  
         set.addLast(S[n]);
         printPowerSet(S, set, n-1);
  
         set.removeLast();                    // backtrack

         while(n > 0 && S[n] == S[n - 1]){
            n--;
         }
  
         // or don't consider the n'th element
         printPowerSet(S, set, n-1);
     }
     public static void main(String[] args) 
	{   
        int[] S = { 1, 3, 1 };
       Arrays.sort(S);
 
       Deque<Integer> out = new ArrayDeque<>();
       printPowerSet(S, out, S.length - 1);

	}
}
