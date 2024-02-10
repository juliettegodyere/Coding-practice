/**
 * This is another variation of Longest Increaing Subsequence (LIS).
 * We are given an array, we need to consider all increasing subsequences
 * out of those increasing subsequences, we need to find the subsequence whose sum
 * is maximum.
 */
package DynamicProgramming;

public class MaximumSumIncreasingSubsequence {
    static int MSIS(int[] arr, int n)
	{
		int msis[] = new int[n];

		
		for(int i=0; i<n; i++)
		{
			msis[i]  = arr[i];


			for(int j=0; j<i; j++)
			{
				if(arr[j] < arr[i])
				{
					msis[i] = Math.max(msis[i], arr[i] + msis[j]);
				}
			}
		}

		int res = msis[0];

		for(int i=0; i<n; i++)
		{
			res = Math.max(res, msis[i]);
		}

		return res;
	}

	public static void main (String[] args) {
		
		int n = 3;

		int arr[] = {5, 10, 20};

		
        System.out.println(MSIS(arr, n));
		

	}
}
