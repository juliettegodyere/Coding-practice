package Problems;

import java.math.BigInteger;

public class CatalanNumber {
    static BigInteger getCatNumber(int n){
        BigInteger cn =  (fact(2*n)/(fact(n+1)*fact(n)));
       return cn;
    }
    static int fact(int n){
        if(n == 0){
            return 1;
        }
        return n*fact(n-1);
    }
    public static void main(String[] args)
    {
 
        System.out.println(getCatNumber(9));
    }
}
