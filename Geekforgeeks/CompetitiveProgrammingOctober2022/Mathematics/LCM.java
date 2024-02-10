
/**
 * Least Common multiple (LCM). It is the smallest number,
 * which is divisible by both given numbers.
 * e.g a=4, b=6. The output is 12 because it the smallest number
 * that can be divided by both a and b.
 * Formular
 * The LCM of two numbers a and b
 * (a*b)/gcd(a,b)
 */
package Mathematics;

class LCM {

	
	static int gcd(int a, int b)
	{
		if(b==0)
			return a;

		return gcd(b, a % b);
	}
	//Prefered solution
	static int gcd2(int a, int b){
		while(a != b){
			if(a > b){
				a = a-b;
			}else{
				b = b-a;
			}
		}
		return a;
	}

	static int lcm(int a, int b)
	{
		return (a * b) / gcd2(a, b);
	}
	
	public static void main (String[] args) {
		
		int a = 4, b = 6;

		System.out.println(lcm(a, b));

	}
}