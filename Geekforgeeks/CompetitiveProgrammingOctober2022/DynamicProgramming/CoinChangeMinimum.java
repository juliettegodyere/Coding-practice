
/**https://www.youtube.com/watch?v=J2eoCvk59Rc
 * Find out the minimum number od coins to make change of a given amount, Using 
 * given coins.
 */
package DynamicProgramming;

public class CoinChangeMinimum {
    public static int getMin(int coins[], int num){
        int n = coins.length;
        int [][]DP = new int[n+1][num+1];
       for(int i = 0; i<=n; i++){
            DP[i][0] = 0;
       }
        
        for(int i = 0; i<=n; i++){
            for(int j = 0; j<=num; j++){
                if(coins[i] > j){
                    DP[i][j] = DP[i-1][j];
                }else{
                    DP[i][j] = Math.min(DP[i-1][j], 1+ DP[i][j-coins[i]]);
                }
            }
        }
        return DP[n][num];
    }
    public static void main(String[] args) 
    {   
    int coin[] = {1,2, 3};
    int sum = 4;
    System.out.println(getMin(coin, sum));
    }
}
