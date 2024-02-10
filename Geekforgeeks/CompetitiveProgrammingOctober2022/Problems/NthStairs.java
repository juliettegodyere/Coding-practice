
/**
 * There are n stairs, a person standing at the bottom wants to reach the top. 
 * The person can climb either 1 stair or 2 stairs at a time. Count the number of ways, 
 * the person can reach the top.
 * https://practice.geeksforgeeks.org/batch/cp-41/track/CP-33DynamicProgramming/problem/count-ways-to-reach-the-nth-stair-1587115620
 * ime Complexity: O(2n), The time complexity of the above implementation is exponential (golden ratio raised to power n) due to redundant calculations, It can be optimized by memoization
Auxiliary Space: O(n), Here we are not using any extra memory but the recursion stack is used O(n) memory.
 */
package Problems;

public class NthStairs {
   public static int ways(int n){
        int M= (int)1e9+7;
        if (n <= 1)
            return 1;
        return (ways(n - 1) + ways(n - 2))%M;
    }
    public static void main(String[] args) 
	{   
        System.out.println(ways(4));
	}
}
