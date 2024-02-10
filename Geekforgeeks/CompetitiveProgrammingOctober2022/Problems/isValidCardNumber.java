
/**
 * Sainsbury interview API respose code.
 * Double every second digit and if it is greater than 9, add the digit together.
 * After sum, if the total id not equal to 0 is is not valid.
 * 
 */
package Problems;

public class isValidCardNumber {
    public static boolean isValid(String number){
        int sum = 0;
        for(int i = number.length() - 1; i >=0; i-=2){
            //System.out.println(number.charAt(i));
            int val = Integer.parseInt(""+number.charAt(i));
            int t = val+val;
            System.out.println(val+val);
            if(t > 9){
                sum+=addDigit(t);
            }else{
                sum+=t;
            }
        }
        System.out.println("Sum " + sum);
        if(sum == 0){
            return true;
        }
        return false;
    }
    public static int addDigit(int num){
        int n = 0;
        while(num!=0){
            n+=num%10;
            num = num/10;
        }
        return n;
    }
    public static void main(String[] args) 
	{   
        String n = "1209";
        System.out.println(isValid(n));

	}
}
