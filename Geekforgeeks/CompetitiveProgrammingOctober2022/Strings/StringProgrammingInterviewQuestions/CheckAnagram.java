/**
 * https://javarevisited.blogspot.com/2013/03/Anagram-how-to-check-if-two-string-are-anagrams-example-tutorial.html#axzz7znYXvVb2
 */
package Strings.StringProgrammingInterviewQuestions;

public class CheckAnagram {
    //My solution
    static boolean isAnagram(String s1, String s2){
        int n = s1.length();
        int m = s2.length();

        if(n!=m){
            return false;
        }
        int count[] = new int[256];
        for(int i = 0; i < n || i < m; i++){
            count[s1.charAt(i)]++;
            count[s2.charAt(i)]--;
        }
        for(int j: count){
            if(j > 0){
                return false;
            }
        }
        return true;
    }
    /**
     * Their solution.
     * anagram = boat
     * word = atob
     * index - is the index of a character taken from the string word in the string anagram
     * a in anagram, index = 2
     * anagram - 0-2 + 3-4, bo+t
     * t in anagram, index = 2
     * anagram - 0-2 + 3-3, bo
     * o in anagram, index = 1
     * anagram - 0-1 + 2-2, b
     * b in anagram, index = 0
     * anagram - 0-0 + 1-1, ""
     */
    public static boolean isAnagram2(String word, String anagram){       
        if(word.length() != anagram.length()){
            return false;
        }
       
        char[] chars = word.toCharArray();
       
        for(char c : chars){
            int index = anagram.indexOf(c);
            System.out.println(c);
            System.out.println(index);
            if(index != -1){
                anagram = anagram.substring(0,index) 
                       + anagram.substring(index +1, anagram.length());
            }else{
                return false;
            }   
            System.out.println(anagram);        
        }
        return anagram.isEmpty();
    }
    public static void main(String[] args) 
    {   
        String str1 = "boat";
        String str2 = "atob";
        System.out.println(isAnagram2(str2, str1));
    }
}
