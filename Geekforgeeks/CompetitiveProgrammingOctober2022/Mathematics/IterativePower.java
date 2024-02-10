/**
 * Iterative power (Binary exponential)
 * 1. every number can be written as sum of powers of 2 (Set bits in 
 * binary exponential).
 * 2. We cab traverse through all bits of a number (from lsb to msb)
 * in 0(log n) time
 * 3^10 = 3^8 * 3^2
 * 10: 1010
 * 3^19 = 3^16 * 3^2 * 3^1
 * 19 = 10011
 * This is better than the recursive solution that is here because the auxilary space is 0(1)
 * /Users/julietnkwor/Documents/workspace/Juliette/Geekforgeeks/CompetitiveProgrammingOctober2022/Mathimatics/ComputePower.java
 */
package Mathematics;

public class IterativePower {
    /**
     * x = 4, y = 5
     * Initially
     * res = 1
     * 1st Iteration
     * res = 4
     * y = 2
     * x = 16
     * 2nd Iteration
     * res = 4
     * y = 1
     * x = 256
     * res = 1024
     * y = 0
     * x = 73216
     */
    static int power(int x, int y){
	// Initialize result
	int res = 1;
	while (y > 0){
		// If y is odd,
		// multiply
		// x with result
		if ((y & 1) == 1)//y%2 != 0
			res = res * x;

		// y must be even now
		y = y >> 1; // y = y/2
		x = x * x; // Change x to x^2
	}
	return res;
}
/**
 * The above code can be written as such if the result causes an overflow. 
 * We use the modular divison as such. Which can be any number
 */
static int power2(int x, int y, int modular){
	// Initialize result
	int res = 1;
	while (y > 0){
		// If y is odd,
		// multiply
		// x with result
		if ((y & 1) == 1)//y%2 != 0
			res = (res * x)/modular;

		// y must be even now
		y = y >> 1; // y = y/2
		x = x * x; // Change x to x^2
	}
	return res;
}
// Driver Code
public static void main (String[] args)
{
	int x = 3;
	int y = 10;

	System.out.println("Power is " + power(x, y));
}
}
