/**Minimum indexed character
 * Given a string str and another string patt. Find the minimum index of the character in str 
 * that is also present in patt.
 * https://practice.geeksforgeeks.org/batch/cp-41/track/CP-33Strings/problem/minimum-indexed-character-1587115620
 */
package Strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class MinimumIndexedCharacter {
    public static int minIndexChar(String str, String patt)
    {
        // Your code here
        int[] count = new int[256];
        // char [] arr = str.toCharArray();
        // Arrays.sort(arr);
        // str = new String(arr);
        int n = str.length();
        int m = patt.length();
        int idx = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++){
            count[str.charAt(i)] = i;
        }
        // for(int i = 0; i < n; i++){
        //     System.out.println(count[str.charAt(i)]);
        // }
        for(int i = 0; i < m; i++){
            if(count[patt.charAt(i)] < idx){
                idx = count[patt.charAt(i)];
            }
        }
        return idx;
    }
    public static int minIndexChar2(String str, String patt)
    {
        // Your code here
        Map<Character, Integer> hash = new HashMap<>();
        char [] arr = str.toCharArray();
        Arrays.sort(arr);
        str = new String(arr);
        int n = str.length();
        int m = patt.length();
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++){
            if(!hash.containsKey(str.charAt(i))){
                hash.put(str.charAt(i), i);
            }
        }
        for(int i = 0; i < n; i++){
           // System.out.println(count[str.charAt(i)]);
        }
        for(int i = 0; i < m; i++){
            if(hash.containsKey(patt.charAt(i)) && hash.get(patt.charAt(i)) < min){
                min = hash.get(patt.charAt(i));
            }
        }
        return -1;
    }
    /*
     * This passed
     */
    public static int minIndexChar3(String str, String patt)
    {
        // Your code here
        HashSet<Character> set = new HashSet<>();
        for(int i = 0; i < patt.length(); i++){
            set.add(patt.charAt(i));
        }
        for(int i = 0; i < str.length(); i++){
            if(set.contains(str.charAt(i))){
                return i;
            }
        }
        return -1;
    }
    /**
     * Passed but exceeded time limit
     * @param str
     * @param patt
     * @return
     */
    public static int minIndexChar5(String str, String patt)
    {
        // Your code here
        for(int i = 0; i < str.length(); i++){
            int j = 0;
            while(j < patt.length()){
                if(str.charAt(i) != patt.charAt(j)){
                    j++;
                }else{
                    return i;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) 
    {   
        String str = "geeksforgeeks";
        String patt = "set";
        System.out.print(minIndexChar3(str, patt));
    }
}
