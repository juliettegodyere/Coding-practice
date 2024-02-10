/*
 * https://www.geeksforgeeks.org/pangram-checking/
 * Given a string Str. The task is to check if it is Pangram or not. 
 * A pangram is a sentence containing every letter in the English Alphabet.
 * Input: “The quick brown fox jumps over the lazy dog” 
 */
package Strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Pangram {
    public static boolean checkPangram  (String str) {
        // your code here
        // Create a hash table to mark the
        // characters present in the string
        // By default all the elements of
        // mark would be false.
        boolean[] mark = new boolean[26];
        int index = 0;

        for (int i = 0; i < str.length(); i++) {
            if ('A' <= str.charAt(i) && str.charAt(i) <= 'Z'){
                index = str.charAt(i) - 'A';
            }else if ('a' <= str.charAt(i) && str.charAt(i) <= 'z'){
                index = str.charAt(i) - 'a';
            }else{
                continue;
            }
            mark[index] = true;
        }
 
        for (int i = 0; i <= 25; i++)
            if (mark[i] == false)
                return (false);
 
        return (true);
    }
    static final int CHAR = 256;
    /**
     * My solution but did not pass all test cases
     * @param s
     * @return
     */
    public static String pangrams(String s) {
        // Write your code here
            String res = "not pangram";
            int arr[] = new int[CHAR];
            int n = s.length();
            String str = s.toLowerCase();
            
            Arrays.fill(arr, 0);

            for(int i = 0; i < n; i++){
                if(str.charAt(i) != ' '){
                    arr[str.charAt(i)] = 1;
                    //System.out.println(arr[s.charAt(0)]);
                }
            }
            System.out.println(Arrays.toString(arr));
            int count = 0;
            for(int i = 0; i < 256; i++){
                if(arr[i] == 1){
                    count++;
                }
            }
            if(count == 26){
                res = "pangram";
            }
            System.out.println(count);
            return res;
        }
        static int myApproach(String str){
            String alphabet = "abcdefghijklmnopqrstuvwxyz";
            String tracked = "";
            String test = str.toLowerCase();
            for(int i = 0; i < str.length(); i++){
                if(alphabet.contains(String.valueOf(test.charAt(i)))){
                    tracked = tracked+test.charAt(i);
                }
            }
            System.out.println(tracked);
            char arr[] = tracked.toCharArray();
            Arrays.sort(arr);
            if(getDistictValues(new String(arr)).equals(alphabet)){
                return 1;
            }
            return 0;
        }
     static int myApproach2(String str){
            String alphabet = "abcdefghijklmnopqrstuvwxyz";
            Map<Character, Integer> map = new HashMap<>();
            String test = str.toLowerCase().trim();
            for(int i = 0; i < alphabet.length(); i++){
                map.put(alphabet.charAt(i), 0);
            }
            for(int i = 0; i < test.length(); i++){
                if(map.containsKey(test.charAt(i))){
                    map.put(test.charAt(i), 1);
                }
            }
            System.out.println(map);
            for(Map.Entry<Character, Integer> entry: map.entrySet()){
                if(entry.getValue() != 1){
                    return 0;
                }
            }
            return 1;
        }
        static String getDistictValues(String str){
            int count [] = new int[256];
           for(int i = 0; i < str.length(); i++){
             count[str.charAt(i)] = 1;
           }
           String res = "";
           for(int i = 0; i < 256; i++){
             if(count[i] == 1){
                res=res+(char)i;
             }
           }
           System.out.println(res);
           return res;
        }
    public static void main(String[] args)
    {
        String str = "Bawds jog, flick quartz, vex nymph";

        System.out.println(checkPangram(str));
 
        // if (checkPangram(str) == true)
        //     System.out.print(str + " \nis a pangram.");
        // else
        //     System.out.print(str + " \nis not a pangram.");
    }
}
