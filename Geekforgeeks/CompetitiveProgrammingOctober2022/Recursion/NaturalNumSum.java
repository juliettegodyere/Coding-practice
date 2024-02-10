/**
 * Find the sum of natural numders.
 * Example
 * n = 2
 * output = 3 -> 1+2
 * n = 5
 * output = 15  -> 1+2+3+4+5
 * 
 * There is a direct formulation for solving this problem
 * n*(n+1/2)
 */

package Recursion;

public class NaturalNumSum {
    public static int func1(int n){
        if(n == 0){
            return 0;
        }else{
            return n+ func1(n-1);
        }
        
    }
    public static void main(String[] args) 
	{ 
        System.out.println(func1(5));
	}
}
