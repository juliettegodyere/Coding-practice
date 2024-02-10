/**
 * https://javarevisited.blogspot.com/2014/03/3-ways-to-find-first-non-repeated-character-String-programming-problem.html#axzz7znYXvVb2
 */
package Strings.StringProgrammingInterviewQuestions;

import java.util.*;

public class FirstNonRepeatedCharacter {
    static char nonRepeated(String s){
        int n = s.length();
        Map<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < n; i++){
            if(map.containsKey(s.charAt(i))){
                //System.out.println(s.charAt(i));
                map.put(s.charAt(i), map.get(s.charAt(i))+1);
            }else{
                map.put(s.charAt(i), 1);
            }
        }
        for(Map.Entry<Character, Integer> mp: map.entrySet()){
            if(mp.getValue() == 1){
                return mp.getKey();
            }
        }
        return ' ';
    }
    static final int CHAR = 256;
    static char nonRepeated2(String str1, int n){
        //You can also use char datatype
        int count[] = new int[CHAR];

        for(int i = 0; i < n; i++){
            count[str1.charAt(i)]++;
        }
        for(int i = 0; i < n; i++){
            if(count[str1.charAt(i)] == 1){
                return str1.charAt(i);
            }
        }
        return ' ';
    }
    public static void main(String[] args) 
    {   
        String str = "Hehhhhlllllo";
        System.out.println(nonRepeated(str));
    }
}
