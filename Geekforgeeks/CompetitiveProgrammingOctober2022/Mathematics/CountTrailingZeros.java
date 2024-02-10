/**
 * General formula
 * n/5, n/25/ n/125 ...
 */
package Mathematics;

public class CountTrailingZeros {
    //Efficient solution
    static int countTrailingZeros(int n){
		int res = 0;

		for(int i=5; i<=n; i=i*5){
			res = res + (n / i);
		}

		return res;
	}
    //Naive solution. This will course overflow for higher numbers
    static int countTrailingZeros2(int n)
	{
		int fact = 1;

		for(int i=2; i<=n; i++)
		{
			fact = fact * i;
		}
        int count = 0;
        while(fact % 10 == 0){
            count++;
            fact = fact/10;
        }

		return count;
	}

	public static void main (String[] args) {
		
		int number = 30;

		System.out.println(countTrailingZeros2(number));
        System.out.println(countTrailingZeros(number));

	}
}
