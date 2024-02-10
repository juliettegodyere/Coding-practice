/*
 * Two strings str1 and str2 are called isomorphic if there is a one-to-one mapping 
 * possible for every character of str1 to every character of str2. And all occurrences of 
 * every character in ‘str1’ map to the same character in ‘str2’.
 * https://www.geeksforgeeks.org/check-if-two-given-strings-are-isomorphic-to-each-other/
 */

package Strings;

import java.util.HashMap;

//Isomorphic Strings
/**
 * In this example, s1 = "paper" and s2 = "title". Let's go through the loop iterations:

i = 0:

s22[0] = 't', s11[0] = 'p'
count['t'] = 0, visited['p'] = false
count['t'] = 'p', visited['p'] = true
i = 1:

s22[1] = 'i', s11[1] = 'a'
count['i'] = 0, visited['a'] = false
count['i'] = 'a', visited['a'] = true
i = 2:

s22[2] = 't', s11[2] = 'p'
count['t'] = 'p' (previously set), visited['p'] = true
count['t'] == 'p', continues
i = 3:

s22[3] = 'l', s11[3] = 'e'
count['l'] = 0, visited['e'] = false
count['l'] = 'e', visited['e'] = true
i = 4:

s22[4] = 'e', s11[4] = 'r'
count['e'] = 0, visited['r'] = false
count['e'] = 'r', visited['r'] = true
 */
public class IsomorphicString {
    static boolean areIsomorphic(String s1, String s2){
        char[] count = new char[257];
        boolean[] visited = new boolean[257];
        int n = s1.length();
        int m = s2.length();
        if(n != m){
            return false;
        }
        char[] s11 = s1.toCharArray();
        char[] s22 = s2.toCharArray();
        for(int i = 0; i < n; i++){
            if(count[s22[i]] == 0 && visited[s11[i]]==false){
                count[s22[i]] = s11[i];
                visited[s11[i]] = true;
            }else if(count[s22[i]] != s11[i]){
                return false;
            }
        }
        return true;
    }
    /*
     * Check if two given strings are isomorphic to each other using Single Hashmap:
The idea is to store map the character and check whether the mapping is correct or not

Follow the steps to solve the problem:

1. Create a hashmap of (char, char) to store the mapping of str1 and str2.
2. Now traverse on the string and check whether the current character is present in the Hashmap.
    a. If it is present then the character that is mapped is there at the ith index or not.
    b. Else check if str2[i] is not present in the key then add the new mapping.
    b. Else return false.

     */
    static boolean areIsomorphic2(String str1, String str2){
        HashMap<Character, Character> charCount = new HashMap<>();
        char c = 'a';
        int n = str1.length();
        for (int i = 0; i < n; i++) {
            if (charCount.containsKey(str1.charAt(i))) {
                c = charCount.get(str1.charAt(i));
                if (c != str2.charAt(i))
                    return false;
            }else if (!charCount.containsValue(str2.charAt(i))) {
                charCount.put(str1.charAt(i), str2.charAt(i));
            }else {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args)
    {
        String str1 = "foo";
        String str2 = "bar";
      
        System.out.println(areIsomorphic(str1, str2) ?  "Yes"
                              : "No");
    }
}
