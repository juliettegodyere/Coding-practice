package CompetitiveProgrammingOctober2022.Strings.Practice;

import java.util.Stack;

public class ReverseIndividualWord {
   static String reverseWords(String S){
        Stack<String> stack = new Stack<>();
        int n = S.length();
        String temp = "";
        String rev = "";
        for(int i = 0; i < n; i++){
            if(S.charAt(i) == '.'){
                stack.push('.'+temp);
                temp = "";
            }else{
                temp = temp + S.charAt(i);
            }
        }
        stack.push(temp);
        while(!stack.empty()){
            rev = rev +stack.pop();
        }
        return rev;
    }
    public static void main(String[] args) 
    {   
        String s = "pqr.mno";
        int n=s.length();
        System.out.print(reverseWords(s));
    }

}
