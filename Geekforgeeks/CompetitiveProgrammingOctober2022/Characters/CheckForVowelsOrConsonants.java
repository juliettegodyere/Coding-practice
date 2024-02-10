/**
 * Check whether an alphabet is vowel or consonant using if..else statement
 * https://www.programiz.com/java-programming/examples/vowel-consonant
 */

package Characters;

public class CheckForVowelsOrConsonants {
    static String vowelConsonant(char ch){
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
            return ch + " is vowel";
        else
            return ch + " is consonant";

    }

    static String vowelConsonant2(char ch){
        String res = "";
        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                res =  ch + " is vowel";
                break;
            default:
                res = ch + " is consonant";
        }
        return res;
    }
    public static void main(String[] args) {

        char ch = 'i';

        System.out.println(vowelConsonant(ch));

    }
}
