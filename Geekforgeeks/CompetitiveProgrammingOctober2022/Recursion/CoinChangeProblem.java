/**Find the total number of ways you can make the change of a given amount using the coins given.
 * The condition is that you have infinite supply of coins
 * coins = [1,2,3] sum = 4
 * https://www.youtube.com/watch?v=hQIGPCoVtH0
 * 4 = 1 + 1 + 1 + 1
 * 4 = 1+ 3
 * 4 = 2 + 2
 * 4 = 1+1+2
 */
package Recursion;

public class CoinChangeProblem {
    static int getCount(int coin[], int n, int sum){
        if(sum == 0) return 1;
        if(n == 0) return 0;

        int item = getCount(coin, n-1, sum);
        //We can only include the last coin if the last in the last coin is less than or equals the sum
        if(coin[n-1] <= sum){
            item = item + getCount(coin, n, sum - coin[n-1]);
        }
        return item;
    }
    public static void main(String[] args) 
	{   
        int coin[] = {1,2,3};
        int n = coin.length;
        int sum = 5;
        System.out.println(getCount(coin, n, sum));
	}
}
