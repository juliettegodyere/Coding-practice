/**
 * To find the Lexicographic rank of a word using pen and paper. The naive method
 * 1. You sort all the characters of the word
 * 2. We generate all pamutations of the word in increasing order. In lexicographically increasing order
 * 3. Then you find the position of the word in the permutation.
 * e.g BAC
 * When you sort, you get ABC. The permutation of the word is
 * ABC, ACB, BAC, BCA, CAB, CBA. 
 * In this order, you can identify that the position of BAC is 3.
 * The efficient Method demostration. Count lexigraphically smaller strings and add 1 to it
 * STRING
 * S - There are 4 characters that are lexigraphically smaller than S on the right - R,I,N,G.
 * If you replace S with any of the characters you'll get 5
 * R _ _ _ _ _
 * I _ _ _ _ _
 * N _ _ _ _ _
 * G _ _ _ _ _
 * if I fix T, there are also 4 character that are lexigraphically smaller than T on the right- R,I,N,G.
 * If you replace T with any of the characters, you'll get 4
 * SR _ _ _ _
 * SI _ _ _ _
 * SN _ _ _ _
 * SG _ _ _ _
 * There are 3 characters that are lexigraphically smaller than R on the right - I,N,G.
 * If you replace R with any of the characters, you'll get 3
 * STI _ _ _
 * STN _ _ _
 * STG _ _ _
 * There are 1 character that are lexigraphically smaller than I on the right - G.
 * If you replace I with any of the characters, you'll get 2
 * STRG _ _
 * There are 1 character that are lexigraphically smaller than N on the right - G.
 * If you replace N with any of the characters, you'll get 1
 * STRIG _ 
 * There are 0 character that are lexigraphically smaller than G on the right.
 * Hence ((4*5!)+(4*4!)+(3*3!)+(1*2!)+(1*1!))+1
 */

package Strings;

public class LexicographicRank {
    static final int CHAR = 256;

    public static int makefactorial(int n) {
        return (n <= 2) ? n : n * makefactorial(n - 1);
    }
    //Naive method
    public static int calcuLexicoRank(String str, int n) {
        int ctrOfRank = 1;
        for (int i = 0; i < n; i++) {
            int ctr = 0;
            for (int j = i + 1; j <= n; j++) {
                if (str.charAt(i) > str.charAt(j))
                ctr++;
            }
            ctrOfRank += ctr * makefactorial(n - i);
        }
        return ctrOfRank;
    }
    static int fact(int num){
        if(num == 0){
            return 1;
        }
        return num * fact(num-1);
    }
    //Efficient method
    static int lexRank(String str){
        int res = 1;
        int n = str.length();
        int fact = fact(n);
        int count [] = new int[CHAR];
        for(int i = 0; i < n; i++)
            count[str.charAt(i)]++;

        for(int i = 1; i < CHAR; i++)
            count[i] += count[i-1];
        for(int i = 0; i < n-1; i++){
            fact = fact/(n-1);
            res = res + count[str.charAt(i)-1]*fact;
            for(int j = str.charAt(i); j < CHAR; j++){
                count[j]--;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        String str = "BDCA";
        System.out.println("The Given String is: " + str);
        int n = str.length();
        System.out.print("The Lexicographic rank of the given string is: " + calcuLexicoRank(str, n - 1));
    }
      
}
