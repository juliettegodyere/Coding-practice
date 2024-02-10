/**
 * Greatest Common divisor (GCD) or HCF Highest common frequency.
 * If you are given a and b, the GCD is the higest number that divides 
 * both values.
 * 
 * Euclidean principle
 * if a > b
 * then a - b
 * else b - a
 */
package Mathematics;

public class GCD_HCF {
    static int gcd(int a, int b)
	{
		while(a!=b)
		{
			if(a > b)
				a = a - b;
			else
				b = b - a; 
		}

		return a;
	}
	//Recursion
    static int gcd2(int a, int b)
	{
		if(b==0)
			return a;

		return gcd2(b, a % b);
	}
    //Naive approach
    static int gcd3(int a, int b)
	{
        int res = Math.min(a, b);
		while(res > 0){
            if(a % res == 0 && b % res == 0){
                break;
            }
            res--;
        }
		return res;
	}

	public static void main (String[] args) {
		
		int a = 12, b = 15;

		System.out.println(gcd(a, b));

	}
}
