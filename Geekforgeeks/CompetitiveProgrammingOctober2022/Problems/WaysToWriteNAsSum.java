/**
 * This problem can be solved in a similar fashion as coin change problem, 
 * the difference is only that in this case we should iterate for 1 to n-1 instead of 
 * particular values of coin as in coin-change problem
 * https://www.geeksforgeeks.org/ways-to-write-n-as-sum-of-two-or-more-positive-integers/
 */
package Problems;

import java.util.Arrays;

public class WaysToWriteNAsSum {
    public static int getWays(int n){
        int dp[] = new int[n+1];

        //Arrays.fill(dp, 0);
        dp[0] = 1;
        for(int i = 1; i < n; i++){
            for(int j = i; j <= n; j++){
                dp[j] += dp[j-i];
            }
        }

        //We can only include the last coin if the last in the last coin is less than or equals the sum
        
        return dp[n];
    }
    public static void main(String[] args) 
	{   
        System.out.println(getWays(7));
	}
}
