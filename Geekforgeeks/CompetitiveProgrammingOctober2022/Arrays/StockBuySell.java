package Arrays;

public class StockBuySell {
    //Naive approach
    static int maxProfit(int price[], int start, int end){
        if(end <= start){
            return 0;
        }
        int profit = 0;
        for(int i = start; i < end; i++){
            for(int j = i + 1; j <= end; j++) {
                if(price[j] > price[i]){
                    int curr_profit = price[j] - price[i] + maxProfit(price, start, i-1)+maxProfit(price, j+1, end);
                    profit= Math.max(profit, curr_profit);
                }
            }
        }
        return profit;
    }
    /*When the prices of a stock is going down, you will let them go down.
     * Once the prices reach the bottom, you' will buy the stock. When tey are going up, you will let them go up
     * Once they reach the peak,at that point. you will sell. After the peak, if they start going down, you will
     * not buy the stock. You will let it go down. Once it reaches the next bottom, you will buy it. The 
     * bottom line is, you need to find the bottom points and peak points.
     * Example [1, 5, 3, 8, 12]
     * profit = 0;
     * i = 1, profit = 0 + 5-1 = 4
     * i = 2, 
     * i = 3, profit = 4 + 8 - 3 = 9
     * i = 4, profit = 9 + 12 - 8 = 13
     * i = 5, loop ends.
     * The efficient method
     */
    static int maxProfit(int price[], int n){
        int profit = 0;
        for(int i = 1; i < n; i++){
            if(price[i] > price[i-1]){
                profit += price[i] - price[i-1];
            }
        }
        return profit;
    }
    public static void main(String[] args) 
    {   
        int[] arr = {1, 5, 3, 8, 12};
        int n = arr.length;
        System.out.print(maxProfit(arr, 0, n-1));
        System.out.print(maxProfit(arr, n));
    }
}
