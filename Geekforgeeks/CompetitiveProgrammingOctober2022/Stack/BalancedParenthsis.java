package Stack;

import java.util.ArrayDeque;
import java.util.Deque;

/*
 * This video delves into the concept of 'Balanced Parentheses' and demonstrates the efficient utilization of Stack data structure to solve this problem easily.
 */

public class BalancedParenthsis {
    public static boolean balancedParenthesis(String str){
        Deque<Character> s = new ArrayDeque<>();

        for(int i = 0; i < str.length(); i++){
             char x = str.charAt(i);
            if(str.charAt(i) == '(' || str.charAt(i) == '[' || str.charAt(i) == '{'){
                s.push(x);
            }else{
                if(s.isEmpty() == true){
                    return false;
                }else if(matcher(s.peek(), x) == false){
                    return false;
                }else{
                    s.pop();
                }
            }
            
        }
        return (s.isEmpty() == true);
    }

    static boolean matcher(char a, char b){
        return ((a=='(' && b==')') ||
        (a=='[' && b==']') ||
        (a=='{' && b=='}'));
    }
    
}
