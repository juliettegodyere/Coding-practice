/**
 * 0-1 Knapsack problem
 * Example Items = [10,40,30,50] Weight = [5,4,6,3], W = 10. where W is the 
 * capacity of the knapsack
 * Output = 90
 * We want to collect maximum value in this Kanpsack by putting some of these
 * items in this knapsack such that the total weight of the picked items, does not
 * exceed W. S you want to pick 0 or more items from the given items such that you have total weight
 * of the picked items less than W (capacity of the knapsack).
 * Hint:
 * You can consider the last item and the two possible cases for this item. Whether this item is 
 * included or excluded in the solution. So you will have two recursive solution, you take the 
 * maximum of those two recursive solution
 * Worst case 0(2^n)
 */
package Recursion;

public class KnapsackProblem {
    static int knapSack(int W, int wt[], int val[], int n) 
    { 
      
        
        if (n == 0 || W == 0) 
            return 0; 
      
       
        if (wt[n-1] > W) 
            return knapSack(W, wt, val, n - 1); 
      
       
        else
            return Math.max(val[n-1] + knapSack(W - wt[n-1],  wt, val, n - 1),
                                knapSack(W, wt, val, n - 1)); 
    } 
            
	public static void main (String[] args) 
	{
	    int val[] = { 10, 40, 30, 50 }; 
        int wt[] = { 5, 4, 6, 3 }; 
        int W = 10; 
        int n = 4;
	    
        
        System.out.println(knapSack(W, wt, val, n));

	    
	}
}
