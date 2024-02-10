
/**
 * This function prints the Decimal to binary conversion
 * Example 
 * n = 7
 * f(7) = 1
 *  f(3) = 1
 *    f(1)  = 1
 *      f(0)  = 0
 *  
 * output = 111
 * In decimal to binary conversion, we keep deviding the number by 2 and we keep storing the 
 * remainder that we get. Then we print the remainders in the reverse order
 */
package Recursion;

public class Decimal2BibaryConversion {
    void func(int n){
        if(n == 0){
            return;
        }else{
            func(n/2);
            System.out.println(n%2);
        }
    }
}
