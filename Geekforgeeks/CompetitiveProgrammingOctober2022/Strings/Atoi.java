/**
 * The atoi() function in C takes a string (which represents an integer) as an argument 
 * and returns its value of type int. So basically the function is used to convert a string 
 * argument to an integer.
 * https://www.geeksforgeeks.org/write-your-own-atoi/
 */

package Strings;

public class Atoi {
     // A simple atoi() function
    static int myAtoi1(char[] str){
         // Initialize result
         int res = 0;
         // Initialize sign as positive
         int sign = 1;
  
         // Initialize index of first digit
         int i = 0;
  
         // If number is negative, then
         // update sign
         if (str[0] == '-') {
             sign = -1;
  
             // Also update index of first
             // digit
             i++;
         }
  
         // Iterate through all digits
         // and update the result
         for (; i < str.length; ++i)
             res = res * 10 + str[i] - '0';
  
         // Return result with sign
         return sign * res;
    }
    
    static int myAtoi2(char[] str)
    {
        int sign = 1, base = 0, i = 0;
 
        // if whitespaces then ignore.
        while (str[i] == ' ')
        {
            i++;
        }
 
        // sign of number
        if (str[i] == '-' || str[i] == '+')
        {
            sign = str[i++] == '-' ? -1 : +1;
        }
 
        // checking for valid input
        while (i < str.length
               && str[i] >= '0'
               && str[i] <= '9') {
 
            // handling overflow test case
            if (base > Integer.MAX_VALUE / 10
                || (base == Integer.MAX_VALUE / 10
                    && str[i] - '0' > 7))
            {
                if (sign == 1)
                    return Integer.MAX_VALUE;
                else
                    return Integer.MIN_VALUE;
            }
            base = 10 * base + (str[i++] - '0');
        }
        return base * sign;
    }

    static int myOwnAtoi(String str){
        /**
         * Conditions
         * 1. Check for white space
         * 2. Check if character is between 0 and 9
         * 3. Check if result is greater than Integer max value
         * 3. Check if result is lesser than Integer min value
         * 45. Check if there is a sign in the String
         * https://www.youtube.com/watch?v=po-EmS5JjJQ
         */

        int n = str.length();
        if(str == null || str.trim().length() == 0){
            return 0;
        }

        boolean flag = true;
        int i = 0;
        if(str.charAt(0) == '-'){
            flag = false;
            i++;
        }
        if(str.charAt(0) == '+'){
           i++;
        }
        double result = 0;
        for(int j = i; j < n; j++){
            if(str.charAt(j) >= '0' && str.charAt(j) <= '9'){
                result = result*10 + str.charAt(j)-'0';
            }
        }
        if(!flag){
            result = -result;
        }
        if(result > Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        }
         if(result < Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
        }
        return (int) result;
    }
    public static void main(String[] args){
        String str = "21a";
       
         
        // Function call
        int val = myOwnAtoi(str);
        System.out.println(val);
    }
}
