/**
 * Recursive solution: /Users/julietnkwor/Documents/workspace/Juliette/Geekforgeeks/CompetitiveProgrammingOctober2022/Recursion/MininmumCoinsToMakeValue.java
 * Time complexity is Theta(n*value)
 * Aux space Theta(value)
 */
package DynamicProgramming;

public class MinimumCoins {
    static int minCoins(int arr[], int m, int n) 
            { 
              
                int dp[] = new int[n + 1]; 
                dp[0] = 0; 
   
                for (int i = 1; i <= n; i++) 
                    dp[i] = Integer.MAX_VALUE; 
        
                for (int i = 1; i <= n; i++) { 
                    for (int j = 0; j < m; j++) 
                        if (arr[j] <= i) { 
                            int sub_res = dp[i - arr[j]]; 
                            if (sub_res != Integer.MAX_VALUE && sub_res + 1 < dp[i]) 
                               dp[i] = sub_res + 1; 
                    } 
                      
                } 
                return dp[n]; 
                  
            } 
	public static void main (String[] args) 
	{
	    int arr[] = {3, 4, 1}, val =5, n =3;
	    
        
        System.out.println(minCoins(arr, n, val));

	    
	}
}
