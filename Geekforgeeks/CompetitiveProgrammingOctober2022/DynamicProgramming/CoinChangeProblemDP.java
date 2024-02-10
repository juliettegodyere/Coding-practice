/**https://www.youtube.com/watch?v=L27_JpN6Z1Q
 * *Find the total number of ways you can make the change of a given amount using the coins given.
 * The condition is that you have infinite supply of coins
 * coins = [1,2,3] sum = 4
 * 4 = 1 + 1 + 1 + 1
 * 4 = 1+ 3
 * 4 = 2 + 2
 * 4 = 1+1+2
 */
package DynamicProgramming;

public class CoinChangeProblemDP {
   static int getCount(int coins[], int num){
        int n = coins.length;
        int [][]DP = new int[n+1][num+1];
       for(int i = 0; i<=n; i++){
            DP[i][0] = 1;
       }
        
        for(int i = 0; i<n; i++){
            for(int j = 1; j<num; j++){
                if(coins[i] > j){
                    DP[i][j] = DP[i-1][j];
               }else{
                    DP[i][j] = DP[i-1][j] + DP[i][j-coins[i]];
               }
            }
        }
        return DP[n][num];
   }

    public static void main(String[] args) 
    {   
    int coin[] = {1,2, 3};
    int sum = 4;
    System.out.println(getCount(coin, sum));
    }
}
