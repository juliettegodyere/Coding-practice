/**
 * A string is called a palindrone if you read it from left to right and also read from 
 * right to left and it is the same string
 * eg: [ABCDCBA]
 */

package Strings;

public class Palindrome {
    //Naive method
    static boolean isPal1(String str){
        StringBuilder sbr = new StringBuilder(str);
        sbr.reverse();
        return str.equals(sbr.toString());
    }
    //Efficient method
   static boolean isPal(String str){
        int end = str.length()-1;
        int begin = 0;
        str.toLowerCase();
        while(begin < end){
            if(str.charAt(begin) != str.charAt(end)){
                return false;
            }
            begin++;
            end--;
        }
        return true;
   }

    public static void main(String[] args) 
    {   
        System.out.println(isPal("ABABA"));
    }
}
