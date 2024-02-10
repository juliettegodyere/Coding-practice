/**
 * Find the index of the leftmost non repeating character
 */

package Strings;

import java.util.Arrays;

public class LeftMostNonRepeatingCharacter {
    //Naive approach
    static int NonRepeatingLeftMost(String str, int n){
        for(int i = 0; i < n; i++){
            boolean flag = false;
            for(int j = 0; j < n; j++){
                if(i != j && str.charAt(i) == str.charAt(j)){
                    flag = true;
                    break;
                }
            }
            if(flag == false){
                return i;
            }
        }
        return -1;
    }
    /**
     * In this better approach
     * Initially
     * str = "abbcda"
     * count = [0,0,0,.......,0]
     * After first transversal
     * count = [0,...2,2,1,1,.......,0]
     *               a b c d
     * 0(N) time
     * 0(1) space
     *  */ 
    static final int CHAR = 256;
    static int NonRepeatingLeftMost2(String str1, int n){
        //You can also use char datatype
        int count[] = new int[CHAR];

        for(int i = 0; i < n; i++){
            count[str1.charAt(i)]++;
        }
        for(int i = 0; i < n; i++){
            if(count[str1.charAt(i)] == 1){
                return i;
            }
        }
        return -1;
    }
    /**
     * This Efficient solution we are transversing only once and then 
     *  one constant transversal of a loop.
     *  
     * 1. We create fi array which stores first indexes. Finally, it is going
     * to store indexes of a non-repeating charaters. For other charaters which are repeated,
     * it is going to store -2 and the charaters which were never seen, is going to have -1.
     * Initially
     * str = "abbcbda"
     * fi = [-1,-1,-1,.......,-1]
     *  i = 0, f1['a'] = 0
     *  i = 1, f1['b'] = 1
     *  i = 2, f1['b'] = -2
     *  i = 3, f1['c'] = 3
     *  i = 4, f1['b'] = -2
     *  i = 5, f1['d'] = 5
     *  i = 6, f1['a'] = -2
     */
    static int NonRepeatingLeftMost3(String str1, int n){
        int fi[] = new int[CHAR];
        Arrays.fill(fi, -1);
        int res = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++){
            if(fi[str1.charAt(i)] == -1){
                fi[str1.charAt(i)] = i;
            }else{
                fi[str1.charAt(i)] = -2;
            }
        }
        for(int i = 0; i < CHAR; i++){
            if(fi[i] > 0){
                res = Math.min(res, fi[i]);
            }
        }
        return (res == Integer.MAX_VALUE) ? -1 : res;
    }
    public static void main(String[] args) 
    {   
        String str = "CABBAD";
        int n = str.length();
        System.out.println(NonRepeatingLeftMost(str, n));
        System.out.println(NonRepeatingLeftMost2(str, n));
    }
}
