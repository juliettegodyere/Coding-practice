/**
 * https://www.java67.com/2016/06/how-to-reverse-string-in-place-in-java.html
 */

package Strings.StringProgrammingInterviewQuestions;

public class ReverseString {
    //My solution
    static String reverse(String s){
        int n = s.length();
        char ch[] = s.toCharArray();
        int start = 0;
        int end = n-1;
        while(start < end){
            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;
            start++;
            end--;
        }
        return new String(ch);
    }
    public static void main(String[] args) 
        {   
            String str = "Hello";
            System.out.println(reverse(str));
        }
}
