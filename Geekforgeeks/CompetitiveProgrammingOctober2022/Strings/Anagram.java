
/**Anagram: is basically checking whether two strings are permutations of each other or not.
 * Which means, every character that appears in the first string should also appear in the second string.
 * The frequency of every character should also be the same in both strings. However, the order of appearance
 * may differ.
 * Examples - 
 * s1 = listen, s2 silent
 * */
package Strings;

import java.util.Arrays;

public class Anagram {
    /**
     * First compare the length. if there are not equal return false.
     * If they are same, sort both strings and compare.
     * O(NlogN) time
     */
    static boolean isAnagram(String str1, String str2, int n, int m){
        if(n != m){
            return false;
        }
        char arr1[] = str1.toCharArray();
        Arrays.sort(arr1);
        String ar1 = new String(arr1);

        char arr2[] = str2.toCharArray();
        Arrays.sort(arr2);
        String ar2 = new String(arr2);

        return ar1.equals(ar2);

    }
    /**
     * This idea is the standard character counting technique for strings.
     * We use characters as indexes in a count array of size 256.
     * 1. We initialize a count array
     * 2. For every character in string one, we increment the count, for 
     * every character in string 2 we decrement the count. If two Strings are anagram,
     * finally, your count array should become zero.
     * O(N + CHAR) time
     * O(CHAR) Space
     */
    static final int CHAR = 256;
    static boolean isAnagram2(String str1, String str2, int n, int m){
        int count[] = new int[CHAR];
        if(n != m){
            return false;
        }
        for(int i = 0; i < n; i++){
            count[str1.charAt(i)]++;
            count[str2.charAt(i)]--;
        }
        // for(int i = 0; i < CHAR; i++){
        //     if(count[i] != 0){
        //         return false;
        //     }
        // }
        for(int i = 0; i < n; i++){
            if(count[str2.charAt(i)] != 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) 
    {   
        String str1 = "LISTEN";
        String str2 = "SILENT";
        int n = str1.length();
        int m = str2.length();
        System.out.println(isAnagram2(str1, str2, n, m));
    }
}
