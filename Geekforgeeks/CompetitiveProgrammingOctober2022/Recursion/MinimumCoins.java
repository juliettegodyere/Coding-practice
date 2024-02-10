/**
 * Another solution: /Users/julietnkwor/Documents/workspace/Juliette/Geekforgeeks/CompetitiveProgrammingOctober2022/Recursion/ChangeCoinCombination.java
 * 
 */
package Recursion;

public class MinimumCoins {
    static int getMin(int coin[], int n, int val){
        if(val == 0) return 0;

        int res = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++){
            if(coin[i] <= val){
                int sub_res = getMin(coin, n, val - coin[i]);
                if(sub_res != Integer.MAX_VALUE){
                    res = Math.min(res, sub_res+1);
                }
            }
        }
        return res;
    }
    public static void main(String[] args) 
	{   
        int coin[] = {25, 10, 5};
        int n = coin.length;
        int val = 30;
        System.out.println(getMin(coin, n, val));
	}
}
