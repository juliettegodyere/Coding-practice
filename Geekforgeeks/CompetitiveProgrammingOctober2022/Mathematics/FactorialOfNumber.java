package Mathematics;

public class FactorialOfNumber {
    static int fact(int n){
	    if(n==0)
	        return 1;
		return n * fact(n-1);
	}

    static int fact2(int n){
		int res = 1;
		for(int i=2; i<=n; i++){
			res = res * i;
		}
		return res;
	}

	static int myApproach(int n){
		int res = 1;
		for(int i = n; i > 0; i--){
			res*=i;
		}
		return res;
	}

	public static void main (String[] args) {
		
		int number = 5;

		//System.out.println(fact(number));
		System.out.println(myApproach(number));

	}
}
