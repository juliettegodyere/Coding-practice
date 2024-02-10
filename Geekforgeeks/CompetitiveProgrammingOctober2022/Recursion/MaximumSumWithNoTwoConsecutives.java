/**
 * We are given an array of positive integers, we need to find out, the maximum sum
 * of these array elements such that no two elements that are contributing to the 
 * sum are contigious.
 * A simple solution is to begin from the last element. We have two choices. Either this last
 * element is a part of the solution or it is not a part of the solution. Then we find the 
 * max of this two choices then return the max sum.
 */
package Recursion;

public class MaximumSumWithNoTwoConsecutives {
    static int maxSum(int arr[], int n)
	{
		if(n==0)
			return arr[0];

		int prev_prev = arr[0];
		int prev = Math.max(arr[0], arr[1]);
		int res = prev;

		for(int i=3; i<=n; i++)
		{
			res = Math.max(prev, prev_prev + arr[i-1]);

			prev_prev = prev;

			prev = res;
		}

		return res;
	}

	public static void main (String[] args) {
		
		int n = 5, arr[]= {10, 20, 30, 40, 50};

		System.out.println(maxSum(arr, n));

	}
}
