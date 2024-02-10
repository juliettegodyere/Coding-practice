/*
 * Given two strings s1 and s2. Modify both the strings such that all the common
 *  characters of s1 and s2 are to be removed and the uncommon characters of s1 and
 *  s2 are to be concatenated.
Note: If all characters are removed print -1.
https://practice.geeksforgeeks.org/batch/cp-41/track/CP-33Strings/problem/remove-common-characters-and-concatenate-1587115621
https://www.geeksforgeeks.org/concatenated-string-uncommon-characters-two-strings/
 */
package Strings;

import java.util.*;

public class RemoveCommonCharacters {
    public static String concatenatedString(String s1,String s2)
    {
        // Your code here
        int [] count = new int[256];
        int n = s1.length();
        int m = s2.length();
        String res = "";
        for(int i = 0; i < n; i++){
            count[s1.charAt(i)] = 1;
        }
        for(int i = 0; i < m; i++){
            if(count[s2.charAt(i)] == 1){
                count[s2.charAt(i)] = 2;
            }
        }
        for(int i = 0; i < n; i++){
            if(count[s1.charAt(i)] != 2){
                res = res+s1.charAt(i);
            }
        }
        for(int i = 0; i < m; i++){
            if(count[s2.charAt(i)] != 2){
                res = res+s2.charAt(i);
            }
        }
        return res == "" ? "-1" : res;
    }
    
    public static void main(String[] args) 
    {   
        String str1 = "rqunudsgdgbcuyqywbvghxsuakuefup";
        String str2 = "wkjjeocntkowhoofkrbszakvdvrhamyywhidymstwgpdxglhxmcyoourlnz";
        System.out.println(concatenatedString(str1, str2));
    }
}
