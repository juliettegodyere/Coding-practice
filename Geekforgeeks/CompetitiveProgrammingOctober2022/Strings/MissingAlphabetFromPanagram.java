package Strings;
/**
 * https://www.geeksforgeeks.org/missing-characters-make-string-pangram/
 */
import java.util.ArrayList;
import java.util.HashSet;

public class MissingAlphabetFromPanagram {
    static ArrayList<Character> missingAlp(String str, int n){
        final boolean[] alphabet = new boolean[26];
        ArrayList<Character> charsList = new ArrayList<>();

        for(int i = 0; i < n; i++) 
        {
            if ('A' <= str.charAt(i) && str.charAt(i) <= 'Z'){
                alphabet[str.charAt(i) - 'A'] = true;
            }else if ('a' <= str.charAt(i) && str.charAt(i) <= 'z'){
                alphabet[str.charAt(i) - 'a'] = true;
            }
                            
        }

        for(int i = 0; i < alphabet.length; i++){
            if(alphabet[i] == false){
                charsList.add((char) (i+'a'));
            }
        }
        return charsList;
    }

    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the dog";
        int n = str.length();

        System.out.println(missingAlp(str, n));
    }
}
