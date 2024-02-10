package Mathematics;

public class CountDigits {
    // JAVA Code to count number of
// digits in an integer
	static int countDigit(long n)
	{
		int count = 0;
		while (n != 0) {
			n = n / 10;
			++count;
		}
		return count;
	}

	/* Driver code */
	public static void main(String[] args)
	{
		long n = 1220;
		System.out.print("Number of digits : "
						+ countDigit(n));
	}
}
// This code is contributed by Arnav Kr. Mandal.


