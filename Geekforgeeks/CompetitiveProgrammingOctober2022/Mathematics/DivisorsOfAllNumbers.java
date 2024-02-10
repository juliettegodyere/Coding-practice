/**
 * Idea for the efficient solution
 * 1. Divisors of a number appears in pairs.
 * Example:
 * 30: 1,2,3,5,6,10,15,30
 * (1,30) (2,15) (3,10) (5,6)
 * 2. One of the divisors in every pair is smaller
 * than or equal to sqaure root of n
 * For a pair (x,y)
 * x*y = n
 * Let x be the smaller, ie x<=y
 * x*x<=n
 * x <= square root of n
 */

package Mathematics;

public class DivisorsOfAllNumbers {
    //Naive method
    static void printDivisors(int n)
	{
		for(int i=1; i <= n; i++){
			if(n % i == 0)
			{
				System.out.print(i+" ");				
			}
		}
	}

    /**
	 * This is the efficient method but does not print values in
	 * sorted order. Time complexity is O(Square root n)
	 * n = 25
	 * i = 1, print(1) and print(25)
	 * i = 2
	 * i = 3
	 * i = 4
	 * i = 5 print(5)
	 */
    static void printDivisors2(int n)
	{
		for(int i=1; i*i <= n; i++)
		{
			if(n % i == 0){
				System.out.print(i+" ");
				if(i != n / i)
					System.out.print((n / i)+" ");					
			}
		}
	}
	/**
	 * This is the efficient method and print values in
	 * sorted order. Time complexity is O(Square root n)
	 * n = 15
	 * loop 1
	 * i = 1, print(1) = 1
	 * i = 2
	 * i = 3 print(3) = 3
	 * loop terminates because 4*4 = 16
	 * lopp 2
	 * i = 4 
	 * i = 3 print(15/3) = 5
	 * i = 2
	 * i = 1 print (15/1) = 15
	 * 
	 */
    static void printDivisors3(int n)
	{
		int i = 1;
		for(i=1; i*i < n; i++)
		{
			if(n % i == 0)
			{
				System.out.print(i+" ");
			}
		}

		for(; i >= 1; i--)
		{
			if(n % i == 0)
			{
				System.out.print((n / i)+" ");
			}
		}
	}

	public static void main (String[] args) {
		
		int n = 25;

		printDivisors(n);
        printDivisors2(n);
        printDivisors3(n);

	}
}
