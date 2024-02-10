/**
 * Find the leftmost repeating character.
 * Example:
 * Str = ABBCC ans index 1
 * string geeksforgeeks - ans is index 0. g is the first lefmost character.
 * 
 */

package Strings;

import java.util.Arrays;

public class LeftMostRepeatingCharacter {
    //Naive approach
    static int checkRepeatingCharacter(String str, int n){
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                if(str.charAt(i) == str.charAt(j)){
                    return i;
                }
            }
        }
        return -1;
    }
    
    /** 
     * Better approach
     * In this approach, we use two traversal. In the first transversal, we store
     * counts or frequencies of all the characters. In the second transversal, we 
     * check which is the first character which is having frequecy more than one.
     * O(N)
    */
    static final int CHAR = 256;
    static int checkRepeatingCharacter2(String str1, int n){
        int count[] = new int[CHAR];

        for(int i = 0; i < n; i++){
            count[str1.charAt(i)]++;
        }
        for(int i = 0; i < n; i++){
            if(count[str1.charAt(i)] > 1){
                return i;
            }
        }
        return -1;
    }
    /**
     * In this Efficient approach, we tranverse from left to right and keep track of 
     * index of first occurence of every character and we use our standard trick. Which is to use 
     * characters as indexes.
     * str = "ABCCBD"
     * initially res = infinite
     * fIndex = []
     * i = 0, fIndex['a'] = 0
     * i = 1. fIndex['b'] = 1
     * i = 2, fIndex['c'] = 2
     * i = 3, res = 2
     * i = 4, res = 1
     * i = 5, fIndex['d'] = 5,
     * O(N + CHAR) Time
     * O(CHAR) space
     */
    static int checkRepeatingCharacter3(String str1, int n){
        int fIndex[] = new int[CHAR];
        Arrays.fill(fIndex, -1);
        int res = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++){
            int fi = fIndex[str1.charAt(i)];
            if(fi == -1){
                fIndex[str1.charAt(i)] = i;
            }else{
                res = Math.min(res, fi);
            }
        }
        return (res == Integer.MAX_VALUE) ? -1 : res;
    }
    /**
     * In this more efficient approach
     * str = "ABCCBD"
     * initially res = -1
     * visited = []
     * i = 5, visited['d'] = true
     * i = 4, visited['b'] = true
     * i = 3, visited['c'] = true
     * i = 2, res = 2
     * i = 1, res = 1
     * i = 0, visited['a'] = true
     */
    static int checkRepeatingCharacter4(String str1, int n){
        boolean visited[] = new boolean[CHAR];
        int res = -1;
        for(int i = n-1; i >= 0; i--){
            if(visited[str1.charAt(i)]){
                res = i;
            }else{
                visited[str1.charAt(i)] = true;
            }
        }
        return res;
    }
    public static void main(String[] args) 
    {   
        String str = "CABBAD";
        int n = str.length();
        System.out.println(checkRepeatingCharacter(str, n));
        System.out.println(checkRepeatingCharacter2(str, n));
    }
}
