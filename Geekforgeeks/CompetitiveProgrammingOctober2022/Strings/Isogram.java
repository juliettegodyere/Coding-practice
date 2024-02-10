
/*
 * Given a word or phrase, check if it is an isogram or not. 
 * An Isogram is a word in which no letter occurs more than once
 */
package Strings;

import java.util.HashMap;
import java.util.Map;

public class Isogram {
    static boolean isIsogram(String str){
        char[] count = new char[256];
        str = str.toLowerCase();
        int n = str.length();
        for(int i = 0; i < n; i++){
            count[str.charAt(i)]++;
        }
        // for(int i = 0; i < 256; i++){
        //     if(count[i] > 1){
        //         return false;
        //     };
        // }
        for(int i = 0; i < n; i++){
            if(count[str.charAt(i)] > 1){
                return false;
            };
        }
        return true;
    }
    static boolean isIsogram2(String data){
        //Your code here
        Map<Character, Integer> hash = new HashMap<Character, Integer>();
        for(int i = 0; i < data.length(); i++){
            if(hash.containsKey(data.charAt(i))){
                return false;
            }
            hash.put(data.charAt(i), 1);
        }
        return true;
    }
    public static void main(String[] args)
    {
        String str1 = "String";      
        System.out.println(isIsogram(str1) ?  "Yes"
                              : "No");
    }
}
