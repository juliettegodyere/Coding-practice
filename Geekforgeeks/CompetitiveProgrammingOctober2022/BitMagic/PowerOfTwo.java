/**
 * We are given a number n, we need to check if this number is a power of two or 
 * not.
 * Example:
 * n = 4
 * Yes
 * n = 6
 * no
 * Powers of 2
 * 2^0, 2^1, 2^2, 2^3, 2^4
 * 1    2   4   8   16
 * e.g
 * n = 4 - 1    0   0
 *         2^2  2^1 2^0
 * 
 * n = 6 - 1    1   0
 *         2^2  2^1 2^0
 */
package BitMagic;

public class PowerOfTwo {
    //Naive method
    static boolean isPow2(int n)
    {
        if(n == 0)
            return true;
        
        while(n != 1)
        {
            if(n % 2 != 0)
                return false;
            
            n = n / 2;
        }
        
        return true;
    }
    /**
     * The efficient method can be soled by using Brains and Kerningham algorithm.
     * One interesting thing about powers of two is that they all have one set bit.
     * e.g 4 - 100, 8 - 1000 etc
     * One way to approach it is to onset the set bit and if your answer is 0, then it is
     * a power of two.
     * You can always onset the right bit of a number n by n-1 and Anding the number with n.
     * e.g
     * n = 4 - 100
     * n-1 3 - 011
     * result  000
     * 
     */
    static boolean isPow22(int n)
    {
        if(n == 0)
            return true;
        
        return ((n & (n - 1)) == 0);
    }
	public static void main (String[] args) {
	    
	    int n = 4;
		System.out.println(isPow2(n));
	}
}
