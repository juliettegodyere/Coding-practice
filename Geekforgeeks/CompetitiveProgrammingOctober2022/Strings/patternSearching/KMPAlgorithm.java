package Strings.patternSearching;

import java.util.*;

public class KMPAlgorithm {
    static boolean search(String s, int end, char ch){
        for(int i = 0; i < end; i++){
            if(ch == s.charAt(i)){
                return true;
            }
        }
        return false;
    }
    static void lcs(String txt, String pat){
        int n = txt.length();
        int m = pat.length();
        int prefix[] = new int[m];
        prefix[0] = 0;
        if(pat.charAt(0) != pat.charAt(1)){
            prefix[1] = 0;
        }else{
            prefix[1] = 1;
        }
        for(int i = 2; i < m; i++){
            for(int j = 0; j < i; j++){
                if(pat.charAt(j) == pat.charAt(i)){
                    //System.out.println(pat.charAt(j) + " " + pat.charAt(i));
                    //System.out.println(j + " " + i);
                    prefix[i] = j+1;
                    //System.out.println(Arrays.toString(prefix));
                }
               
            }
        }
       // System.out.println(Arrays.toString(prefix));

         
    }
    public static void main(String[] args) 
    {   
        String txt = "ABCABCD";
        String pat = "ABCDABC"; 
        int n = txt.length();
        int m = pat.length();
        lcs(txt, pat);
       // naivePatternSearch2(txt, pat, n, m);
    }
}
