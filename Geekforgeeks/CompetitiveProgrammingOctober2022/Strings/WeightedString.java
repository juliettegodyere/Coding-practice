/**
 * https://www.hackerrank.com/challenges/weighted-uniform-string/problem?isFullScreen=true
 */
package Strings;

import java.util.*;

public class WeightedString {
    public static List<String> weightedUniformStrings(String s, List<Integer> queries) {
        // Write your code here
            ArrayList<String> list = new ArrayList<>();
            char alphabets[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
            HashMap<Character, Integer> letters = new HashMap<>();
            HashMap<Character, Integer> count = new HashMap<>();
            for(int i = 1; i <= alphabets.length; i++){
                letters.put(alphabets[i-1], i);
            }
            for(int i = 0; i < s.length(); i++){
                //System.out.print(s.charAt(i));

                if(letters.containsKey(s.charAt(i))){
                    System.out.println(s.charAt(i));
                    //System.out.println(letters.get(s.charAt(i)));
                    //System.out.println(count.get(s.charAt(i)));
                    count.put(s.charAt(i), (letters.get(s.charAt(i))));
                }
            }
            System.out.println(letters.get(s.charAt(3)));
            //System.out.println(letters);
            System.out.println(count);
            return list;
        }

        public static void main(String[] args) 
    {   
        String str1 = "abbcccdddd";
        ArrayList<Integer> list = new ArrayList<>();
        int n = str1.length();
        System.out.println(weightedUniformStrings(str1, list));
    }
}
