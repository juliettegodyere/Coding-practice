
/**
 * Anagram Search
 * Example:
 * I/P: text = "geeksforgeeks", pat = "frog"
 * We need to check if there is a permutation of "pat" in "text".
 * Check if pattern or any of it's permutation at a contigious
 * location is present in a given text. Two strings which are permutations of 
 * each other are also called anagram.
 */
package Strings;

public class AnagramSearch {
    
    static final int CHAR = 256;
    static boolean isAnagram(String txt, String pat, int i) {
        int m = pat.length();
        int n = txt.length();
    
        int[] count=new int[CHAR];
        for(int j=0;j<m;j++){
            count[pat.charAt(j)]++;
            count[txt.charAt(i+j)]--;
        }
        for(int j=0;j<CHAR;j++){
            if(count[j]!=0)return false;
        }
        return true;
    }
    /**Anagram Search naive apprach. //https://ide.geeksforgeeks.org/OhRcRNpfrj.
     * This solution requires 0(n-m+1)*m time
     * 
     */
    static boolean isPresent(String txt,String pat){
        int n=txt.length();
        int m=pat.length();
        for(int i=0;i<=n-m;i++){
            if(isAnagram(pat,txt,i))
                return true;
        }
        return false;
     }

     static boolean areSame(int CT[],int CP[]){
        for(int i=0;i<CHAR;i++){
            if(CT[i]!=CP[i])return false;
        }
        return true;
    }
    
    /**
     * Anagram Search Efficient apprach. //https://ide.geeksforgeeks.org/OhRcRNpfrj
     * 
     */
    static boolean isPresentEfficient(String txt,String pat){
        int[] CT=new int[CHAR];
        int[] CP=new int[CHAR];
        for(int i=0;i<pat.length();i++){
            CT[txt.charAt(i)]++;
            CP[pat.charAt(i)]++;
        }
        for(int i=pat.length();i<txt.length();i++){
            if(areSame(CT,CP))return true;
            CT[txt.charAt(i)]++;
            CT[txt.charAt(i-pat.length())]--;
        }
        return false;
    }
    public static void main(String[] args) 
    {   
        String txt = "geeksforgeeks"; 
        String pat = "frog";
        System.out.println(isPresentEfficient(txt, pat));
    }
}
