
/**
 * Check if a given value is a prime.
 * A number is a prime number if it's only divisors are only 1
 * and itself. The number 1 is neither considered prime or composite number.
 * 
 */
package Mathematics;
public class Check4Prime {
	//naive method
	static boolean isPrime(int n){
		if (n == 1)
			return false;
		for (int i = 2; i < n; i++)
			if (n % i == 0)
				return false;

		return true;
	}
	/**
	 * Efficient aproach: 
	 * Idea: Divisors of a given number always appear in pairs.
	 * e.g
	 * 30(1,30) 30(2,15) 30(3,10)
	 * 65(1,65) 65(5,13)
	 * if (x,y) is a pair
	 * x*y = n
	 * And if x <= y
	 * x*x <= n
	 * x = squareRoot of the n
	 */
    static boolean isPrime2(int n){
		if (n == 1)
			return false;
        
        if(n== 2 || n == 3){
            return true;
        }
        if(n % 2 == 0 || n % 3 == 0){
            return false;
        }

		for (int i = 5; i*i <= n; i=i + 6)
			if (n % i == 0 || (n % (i+2) == 0))
				return false;

		return true;
	}
    static boolean isPrime3(int n){
		if (n <= 1)
			return false;

		for (int i = 2; i*i <= n; i++)
			if (n % i == 0)
				return false;

		return true;
	}

	// Driver Program
	public static void main(String args[])
	{
		if (isPrime(11))
			System.out.println(" true");
		else
			System.out.println(" false");
		if (isPrime(15))
			System.out.println(" true");
		else
			System.out.println(" false");
		
		if (isPrime2(11))
			System.out.println(" true");
		else
			System.out.println(" false");
		if (isPrime2(15))
			System.out.println(" true");
		else
			System.out.println(" false");

		if (isPrime3(11))
			System.out.println(" true");
		else
			System.out.println(" false");
		if (isPrime3(15))
			System.out.println(" true");
		else
			System.out.println(" false");
	}
}
