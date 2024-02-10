package DynamicProgramming;
//https://www.youtube.com/watch?v=hQIGPCoVtH0
//Coin change problem: find out the total number of ways you can make the change of the given 
//amount using the given coins
//Recursion
public class ChangeCoinCombination {
    static int getCount(int coin[], int n, int sum){
        if(sum == 0) return 1;
        if(n == 0) return 0;

        int item = getCount(coin, n-1, sum);

        if(coin[n-1] <= sum){
            item = item + getCount(coin, n, sum - coin[n-1]);
        }
        return item;
    }
    public static void main(String[] args) 
	{   
        int coin[] = {2, 3, 5};
        int n = coin.length;
        int sum = 7;
        System.out.println(getCount(coin, n, sum));
	}
}
