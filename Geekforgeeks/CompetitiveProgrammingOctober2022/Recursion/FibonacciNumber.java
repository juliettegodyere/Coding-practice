/**
 * The first few fibonnacci numbers are
 * 0, 1, 1, 2, 3, 5, 8, 13, 21
 * Time Complexity: Exponential, as every function calls two other functions.

If the original recursion tree were to be implemented then this would have been the tree but now for n times the recursion function is called

Original tree for recursion
 */
package Recursion;

public class FibonacciNumber {
    public static int fibonnacci(int num){
        if(num == 0 || num == 1){
            return num;
        }else{
            return fibonnacci(num - 1) + fibonnacci(num - 2);
        }
    }

     public static void fibonnacci2(int num){
        for(int i = 0; i < num; i++){
            
        }
    }
    public static void main(String args[])
    {
        int n = 9;
        System.out.println(fibonnacci(n));
    }
}
