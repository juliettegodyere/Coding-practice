package Sainsbury;

 /**
     * 1. From the last digit moving backwards, double every second digit
     * 2. If the doubled number is greater than 9, add it's two digits together
     * 3. Sum all card digits together
     * 4. If the total ends in zero, then the number is a valid credit card
     */

public class ValidateCard {
    public static boolean isValid(String cardNumber) {
        int n = cardNumber.length();
        int totalSum = 0;
        for(int i = n-1; i >= 0; i--){
            char digit = cardNumber.charAt(i);
            if(Character.isDigit(digit)){
                int value = digit - '0';
                if((n-i) % 2 ==0){
                    value *=2;
                    System.out.println("The card value " + value);
                    if(value > 9){
                        totalSum+=addDigits(value);
                    }else{
                        totalSum+=value;
                    }
                }
            }
            
        }
        System.out.println("The total sum" + totalSum);

        return totalSum%10 == 0? true: false;
    }

    static int addDigits(int num){
        int rev = 0;
        int temp = num;
        while(temp!=0){
            int ld = temp%10;
            rev = rev + ld;
            temp = temp / 10;
        }
        return rev;
    }

    public static void main(String[] args){
        String cardNumber = "657876580768965436789765";

        System.out.println(isValid(cardNumber));
    }
}
