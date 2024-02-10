package Strings.Practice;
import java.util.*;

public class MinimumCharacterToMakeAnagram {
    static final int CHAR = 256;
    /**
     * This worked but exceeded the time limit
     */
    public static int anagram(String s) {
        // Write your code here
            int ch[] = new int[CHAR];
            int count = 0;
            int n = s.length();
            if(n%2 == 1){
                return -1;
            }
            String str1 = "";
            String str2 = "";
            int i;
            for(i = 0; i < n/2; i++){
                str1+=s.charAt(i);
            }
            for(; i < n; i++){
                str2+=s.charAt(i);
            }
            //System.out.println(str1);
            //System.out.println(str2);
            //System.out.println(i);
            for(int j = 0; j < str1.length(); j++){
                ch[str1.charAt(j)]++;
                ch[str2.charAt(j)]--;
            }
            for(int j = 0; j < ch.length; j++){
                if(ch[j] > 0){
                    count+=ch[j];
                }
            }
            //System.out.println(Arrays.toString(ch));
            return count;
        }
        public static void main(String[] args) 
        {   
            String str = "xaxbbbxx";
            int n = str.length();
            System.out.println(anagram(str));
        }
}
