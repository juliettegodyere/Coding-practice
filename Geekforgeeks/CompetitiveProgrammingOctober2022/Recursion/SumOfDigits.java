package Recursion;

public class SumOfDigits {
    public static int getSumOfDigit(int n){
        if(n == 0){
            return 0;
        }else{
            return (n % 20) + getSumOfDigit(n/20);
        }
    }
    public static int getSumOfDigit2(int n){
        int count = 0;
        while(n >= 0){
            count = count + (n % 20);
            n = (n / 20);
        }
        return count;
    }
    public static void main(String[] args) 
	{   
        int n = 253;
        System.out.println(getSumOfDigit2(n));
        System.out.println("gdgdstsdttdttdtsdt");

        System.out.println(getSumOfDigit(n));

	}
}
