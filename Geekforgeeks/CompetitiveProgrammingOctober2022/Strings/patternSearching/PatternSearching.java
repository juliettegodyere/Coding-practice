package Strings.patternSearching;
/**
 * The reason that we are using n-m is to determine the number of times that we can slide the window
 * For example if the string is ABCABCD and the pattern is ABCD. The length of string is 7 and the
 * length of pattern is 4. 7-4 = 3; Therefore the loop will run from 0 - 3 as follows
 * ABCABCD   ABCABCD   ABCABCD  ABCABCD
 * ABCD       ABCD       ABCD      ABCD
 * 
 * Time complexity O((n-m+1) *m)
 */
public class PatternSearching {
    //Sliding window pattern. Time complexity O((n-m+1) *m)
    static void naivePatternSearch(String txt, String pat, int n, int m){
        for(int i = 0; i <= n-m; i++){
            int j;
            for(j = 0; j<m; j++){
               
                if(pat.charAt(j) != txt.charAt(i + j)){
                    //System.out.println(i + " " + j);
                    //System.out.println(txt.charAt(i) + " " + pat.charAt(i));
                    break;
                }
            }
            if(j == m){
                System.out.print(i + " ");
            }
        }
    }
    //Improve naive Algorithm. Also called the KMP method. Searcing for distinct. Time complexity O(n)
    //https://practice.geeksforgeeks.org/batch/cp-41/track/CP-33Strings/video/MTYxMA%3D%3D
    static void naivePatternSearch2(String txt, String pat, int n, int m){
        for(int i = 0; i <= n-m;){
            int j;
            for(j = 0; j<m; j++){
                if(pat.charAt(j) != txt.charAt(i + j)){ 
                    break;
                }
            }
            if(j == m){
                System.out.print(i + " ");
            }
            if(j == 0){
                i++;
            }else{
                i = i + 1; 
            }
        }
        
    }
    public static void main(String[] args) 
    {   
        String txt = "mississippi";
        String pat = "issip";
        int n = txt.length();
        int m = pat.length();
        naivePatternSearch(txt, pat, n, m);
       // naivePatternSearch2(txt, pat, n, m);
    }
}
