
/**
 * The problem is to print all prime values less than n.
 * EXample:
 * n = 5
 * output = 1,2,3,5
 * To get the efficient solution, we will use the Sieve Eratosthenes solution.
 * The idea is to create a boolean array isPrime(n+1) of size n+1. We 
 * initialize this array as true and we do not care about the index 0 and 1
 */
package Mathematics;

import java.util.Arrays;

public class SieveOEratosthenes {
    static boolean isPrime(int n){  
		if(n==1)
			return false;

		for(int i=2; i*i<=n; i++)
		{
			if(n % i == 0)
				return false; 
		}

		return true;
	}
    //Naive approach
    public static void printValues(int n){
        for(int i = 1; i <= n; i++){
            if(isPrime(i)){
                System.out.println(i + " ");
            }
        }
    }
    //Efficient approach
    static void sieve(int n){
		if(n <= 1)
			return;

		boolean isPrime[] = new boolean[n+1];
		Arrays.fill(isPrime, true);
		for(int i=2; i*i <= n; i++){
			if(isPrime[i]){
				for(int j = 2*i; j <= n; j = j+i){
					isPrime[j] = false;
				}
			}
		}

		for(int i = 2; i<=n; i++){
			if(isPrime[i])
				System.out.print(i+" ");
		}
	}
     //Optimized approach
     static void sieve2(int n)
     {
         boolean isPrime[] = new boolean[n+1];
 
         Arrays.fill(isPrime, true);
 
         for(int i=2; i <= n; i++){  
             if(isPrime[i])
             {  
                System.out.print(i+" ");
                for(int j = i*i; j <= n; j = j+i){
                     isPrime[j] = false;
                 }
             }
         }
     }
    public static void main (String[] args) {
		
		int n = 18;

		sieve(n);
       // sieve2(n);
	}
}
