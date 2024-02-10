/**
 * This solution is based on Log N base 2 solution. When we are multiplying our input
 * by two our result our result is being incremented by 1 and this is the nature of log.
 * So this function returns log of N when N is a power of 2, it return log 2
 * base n. log2^N
 * power2(1) = 0
 * power2(2) = 1 + power2(1) = 1
 * power2(4) = 1 + power2(2) = 2
 * power2(8) = 1 + power2(3) = 3
 * 
 * Note: when you divide a number by 2 and if you recursively do it, the number of times that you do it
 * until it becomes 1 is log.
 * 
 * Cases when N is not a power 2
 * power2(17/2)
 * power2(8)
 * power2(4)
 * You would notice that we will get the same answer answer as N = 16
 */
package Recursion;

public class Powerof2 {
    public static int power2(int n){
        if(n == 1){
            return 0;
        }else{
            return 1+power2(n-1);
        }
    }
}
