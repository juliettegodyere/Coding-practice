package Mathematics;
/**
 * We know,
log(a*b) = log(a) + log(b)

Therefore
log( n! ) = log(1*2*3……. * n) = log(1) + log(2) + …….. +log(n)

Now, observe that the floor value of log base 
10 increased by 1, of any number, gives the
number of digits present in that number.
Hence, output would be : floor(log(n!)) + 1.
 */
public class DigitsInFactorial {
    static int findDigits(int n){
        if (n < 0)
            return 0;
 
        if (n <= 1){
            return 1;
        }
        double digits = 0;
        for (int i = 2; i <= n; i++){
             digits += Math.log10(i);
        }
        return (int)(Math.floor(digits)) + 1;
    }
 
    
    public static void main(String[] args)
    {
          // Function call
        System.out.println(findDigits(1));
        System.out.println(findDigits(5));
        System.out.println(findDigits(10));
        System.out.println(findDigits(120));
    }
}
