package Mathematics;

public class ComputePower {
    public static int power(int x, int n){
        int res = 1;
        for(int i = 0; i < n; i++){
            res += x;
        }
        return res;
    }
    /**
     * The efficient solution is based on the idea;
     * power(x,n) = if(n/2 == 0)//if n is even
     *                  power(x,n/2)*power(x,n/2);
     *                else{
     *                      power(x,n-1)*x;
     *                 }
     */
    static int power2(int x, int n)
	{
		if(n == 0)
			return 1;

		int temp = power(x, n/2);

		temp = temp * temp;

		if(n % 2 == 0)
			return temp;
		else
			return temp * x; 
	}

	public static void main (String[] args) {
		
		int x = 3, n = 5;

		System.out.println(power(x, n));

	}
}
