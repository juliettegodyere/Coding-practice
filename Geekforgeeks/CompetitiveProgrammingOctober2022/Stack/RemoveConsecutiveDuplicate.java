package Stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class RemoveConsecutiveDuplicate {
     //Function to remove consecutive duplicates from given string using Stack.
    public static String removeConsecutiveDuplicates(String str)
    {
        // Your code here
        Deque<Character> s = new ArrayDeque<>();
        int n = str.length();
        String nw = "";
        s.add(str.charAt(0));
        for(int i = 0; i < n; i++){
           while(!s.isEmpty() && s.peek() == str.charAt(i)){
                s.pop();
           }
            // nw = nw+str.charAt(i);
           s.push(str.charAt(i));
        }
        System.out.println(s);
        while(!s.isEmpty()){
            nw = nw+s.pop();
        }
        return new StringBuilder(nw).reverse().toString();
    }

    public static String removeConsecutiveDuplicates2(String str) {
        StringBuilder result = new StringBuilder();
        int n = str.length();
    
        for (int i = 0; i < n; i++) {
            if (i == 0 || str.charAt(i) != str.charAt(i - 1)) {
                result.append(str.charAt(i));
            }
        }
    
        return result.toString();
    }
    public static void main(String[] args)
    {
        String str = "abbccbcd";

        System.out.println(removeConsecutiveDuplicates(str));
    }
}
