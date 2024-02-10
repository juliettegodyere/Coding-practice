/**
 * https://www.java67.com/2014/03/how-to-find-duplicate-characters-in-String-Java-program.html
 */

package Strings.StringProgrammingInterviewQuestions;

import java.util.HashSet;
import java.util.*;

public class PrintDuplicateCharacters {
    //My solution
    static void printDuplicate(String s){
        int n = s.length();
        boolean count[] = new boolean[256];
        Set<Character> set = new HashSet<>();

        for(int i = 0; i < n; i++){
            if(count[s.charAt(i)] == true){
                //System.out.println(s.charAt(i));
                set.add(s.charAt(i));
            }else{
                count[s.charAt(i)] = true;
            }
        }
        for(char i: set){
            System.out.println(i);
        }
    }
    //My solution 2
    static void printDuplicate2(String s){
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
            if(mp.getValue() > 1){
                System.out.println(mp.getKey());
            }
        }
    }
    public static void main(String[] args) 
    {   
        String str = "Hehhhhlllllo";
        printDuplicate2(str);
    }
}
