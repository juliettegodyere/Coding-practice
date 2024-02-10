/**
 * The recurssive solution is here.
 * /Users/julietnkwor/Documents/workspace/Juliette/Geekforgeeks/CompetitiveProgrammingOctober2022/Recursion/FibonacciNumber.java
 * Time complexity is 0(N)
 */
package DynamicProgramming;

public class FibonacciNumber {
    public static int fib(int num){
        int memo[] = new int[num+1];

        for(int i = 0; i < num; i++){
            memo[i] = -1;
        }
        if(memo[num] == -1){
            int res;

            if(num == 0 || num == 1){
                return num;
            }else{
                res = fib(num - 1) + fib(num - 2);
            }
            memo[num] = res;
        }
        return memo[num];
    }
    public static void main(String args[])
    {
        int n = 9;
        System.out.println(fib(n));
    }
}
