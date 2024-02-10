package Strings;

/**
 * Given a string str containing alphanumeric characters. The task is to calculate the sum of all 
 * the numbers present in the string.
 */

public class SumOfNumberInString {
    public static int findSum(String str)
    {
        // your code here
        int total_sum = 0;
        for(int i = 0; i < str.length(); i++){
            String curr_sum = "";
            while(i < str.length() && (str.charAt(i)) - 'a' < 0){
                curr_sum+=str.charAt(i);
                i++;
            }
            if(curr_sum !=""){
                total_sum+=Integer.parseInt(curr_sum);
            }
        }
        return total_sum;
    } 

    public static long findSum2(String str) {
        int n = str.length();
        long currentNumber = 0;
    
        for (int i = 0; i < n; i++) {
            char c = str.charAt(i);
    
            if (Character.isDigit(c)) {
                currentNumber = currentNumber * 10 + (c - '0');
            } 
        }
    
        return currentNumber;
    }
    public static void main (String[] args) {
        String s = "abc123def45";
        System.out.println(findSum(s));
    }
}
