package Strings;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class UncommonCharacters {
    String UncommonChars(String A, String B)
    {
        // code here
        Set<Character> set2 = new LinkedHashSet<>();
        Set<Character> set3 = new TreeSet<>();
        String str = "";
        int n = A.length();
        int m = B.length();
        
        for(int i = 0; i < n; i++){
            set3.add(A.charAt(i));
        }
        for(int i = 0; i < m; i++){
            set2.add(B.charAt(i));
        }
        
        for (Character ch : set2) {
            if (set3.contains(ch)) {
                set3.remove(ch);
            }else{
                set3.add(ch);
            }
        }
        // for(Character ch : set1){
        //     set3.add(ch);
        // }
        for(Character ch : set3){
            str+=ch;
        }
        // System.out.println(set1);
        // System.out.println(set3);
        
        return str.length() == 0 ? "-1" : str ;
    }

    static String findAndPrintUncommonChars(String A, String B)
    {
        // code here
        Set<Character> set2 = new LinkedHashSet<>();
        Set<Character> set3 = new TreeSet<>();
        String str = "";
        int n = A.length();
        int m = B.length();
        
        for(int i = 0; i < n; i++){
            set3.add(A.charAt(i));
        }
        for(int i = 0; i < m; i++){
            set2.add(B.charAt(i));
        }
        
        for (Character ch : set2) {
            if (set3.contains(ch)) {
                set3.remove(ch);
            }else{
                set3.add(ch);
            }
        }
        
        for(Character ch : set3){
            str+=ch;
        }
        // System.out.println(set1);
        // System.out.println(set3);
        
        return str.length() == 0 ? "-1" : str ;
    }

    public static void main(String[] args)
    {
      String str1 = "characters";
      String str2 = "alphabets";
      System.out.println(findAndPrintUncommonChars(str1, str2));
    }
}
