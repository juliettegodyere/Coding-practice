
/**
 * Remove adjacent duplicate characters from a string
 * https://www.techiedelight.com/remove-adjacent-duplicates-characters-string/
 */
package Recursion;

public class RemoveAdjacentCharacters {
    public static String removeDuplicates(String s, int n){
        int start = 0, end = 1;
        String res = ""+s.charAt(start);
        while(start <= n || end <= n){
            if((start < n || end < n) && s.charAt(end) != s.charAt(start)){
                res+=s.charAt(end);
            }
            start++;
            end++;
        }
        return res;
        
    }
    public static void main(String[] args)
    {
        String s = "AABBBCDDD";
        int n = s.length();
        System.out.println(removeDuplicates(s,n-1));
    }
}
