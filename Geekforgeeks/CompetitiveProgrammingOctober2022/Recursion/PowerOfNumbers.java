package Recursion;

public class PowerOfNumbers {
    //Did not pass all 
    static long power(int N,int R)
    {
        //Your code here
        if(R == 0){
            return 1;
        }
        long mod = 1000000007;
        long ans = power(N, R-1);
        ans = ((ans % mod) * (N % mod)) % mod;
        return ans;
        
    }
    static long solve(int N, int R){
        if(R == 0){
            return 1;
        }
        long temp = solve(N, R/2);
        long sq = temp*temp;
        if(R%2 == 0){
            return sq;
        }
        long mod = 1000000007;
        return (N * sq)%mod;
    }
    public static void main(String[] args) 
	{   
        int n = 12;
        System.out.println(solve(n, 21));
	}
}
