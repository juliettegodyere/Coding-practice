
/** 
 * Reverse words in a string. You need to reverse the words in place.
 * Example:
 * str="Welcome to gfg"
 * output="gfg to welcome"
 */
package Strings;

import java.util.ArrayDeque;
import java.util.Deque;

public class ReverseWordStack {
    /**
     * Naive solution:
     * 1. Create a stack.
     * 2. push word one by into stack when you encounter a space
     * 3. Pop words from the stack and append to the string
     * @param str
     * @param n
     */
    static void reverseWords(String str, int n){
        Deque<String> stack = new ArrayDeque<>();
        String st = "";
        for(int i = 0; i < n; i++){
            if(str.charAt(i) == ' '){
                stack.push(st);
                st = "";
            }else{
                st = st+str.charAt(i);
            }
        }
        stack.push(st);
        while(!stack.isEmpty()){
            System.out.print(stack.pop() + " ");
        }
        
    }
    /**Efficient Method
     * The technique to traverse through the string reverse the individual word
     * then reverse the string.
     * Example: Welcome to gfg
     * start = 0, n = 14
     * end = 0,1,2,3,4,5,6 no change
     * emoclew to gfg
     * start = 8
     * end = 8,9 no change
     * emoclew ot gfg
     * start = 11
     * end = 11,12,13 no change
     * end of loop
     * emoclew ot gfg
     * gfg to welcome
     */
    static void reverseWords2(String str, int n){
        char[] arr = str.toCharArray();
       // String st = new String(arr);
        int start = 0;
        for(int end = 0; end < arr.length; end++){
            if(arr[end] == ' '){
                reverse(arr, start, end+1);
                start = end + 1;
            }
        }
        reverse(arr, start, n-1);
        reverse(arr, 0, n-1);
    }
    static void reverse(char[] arr, int start, int end){
        while(start <= end){
            char temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;            
            start++;
            end--;
        }
    }
    
    public static void main(String[] args) 
    {   
        String s = "Welcome, to, Gfg";
        int n=s.length();
        char[] str = s.toCharArray();
        reverseWords(s, n);
        System.out.println("After reversing words in the string:");
        // reverseWords2(s,n);
        // System.out.println(str);
    }
}
