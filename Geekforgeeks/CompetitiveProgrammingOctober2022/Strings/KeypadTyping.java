
/**
 * You are given a string S of lowercase alphabet characters and the task is to 
 * find its matching decimal representation as on the shown keypad. Output the decimal 
 * representation corresponding to the string. For ex: if you are given amazon then its 
 * corresponding decimal representation will be 262966.
 * https://practice.geeksforgeeks.org/batch/cp-41/track/CP-33Strings/problem/keypad-typing0119
 */
package Strings;

import java.util.HashMap;
import java.util.Map;

public class KeypadTyping {
    static String printNum(String str){
        Map<Character, Integer> hash = new HashMap<Character, Integer>();
        int n = str.length();
        String res = "";
        hash.put('a', 2);
        hash.put('b', 2);
        hash.put('c', 2);
        hash.put('d', 3);
        hash.put('e', 3);
        hash.put('f', 3);
        hash.put('g', 4);
        hash.put('h', 4);
        hash.put('i', 4);
        hash.put('j', 5);
        hash.put('k', 5);
        hash.put('l', 5);
        hash.put('m', 6);
        hash.put('n', 6);
        hash.put('o', 6);
        hash.put('p', 7);
        hash.put('q', 7);
        hash.put('r', 7);
        hash.put('s', 7);
        hash.put('t', 8);
        hash.put('u', 8);
        hash.put('v', 8);
        hash.put('w', 9);
        hash.put('x', 9);
        hash.put('y', 9);
        hash.put('x', 9);
        hash.put('z', 9);
        for(int i = 0; i < n; i++){
            // if(str.charAt(i) == '1'){
            //     res= res+'1';
            // }
            // if(str.charAt(i) == '*'){
            //     res= res+'*';
            // }
            // if(str.charAt(i) == '0'){
            //     res= res+'0';
            // }
            // if(str.charAt(i) == '#'){
            //     res= res+1;
            // }
            res = res+ hash.get(str.charAt(i));
        }
        return res;
    }
    static String approach2(String str){
        Map<String, Integer> hash = new HashMap<String, Integer>();
        String st = "";
        hash.put("abc", 2);
        hash.put("def", 3);
        hash.put("ghi", 4);
        hash.put("jkl", 5);
        hash.put("mno", 6);
        hash.put("pqrs", 7);
        hash.put("tuv", 8);
        hash.put("wxyz", 9);

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);

            for (Map.Entry<String, Integer> entry : hash.entrySet()) {
                if (entry.getKey().contains(String.valueOf(currentChar))) {
                    st = st + entry.getValue();
                    break; 
                }
            }
        }
        return st;
    }
    public static void main(String[] args)
    {
        String str1 = "geeksforgeeks";      
        System.out.println(printNum(str1));
    }
}
