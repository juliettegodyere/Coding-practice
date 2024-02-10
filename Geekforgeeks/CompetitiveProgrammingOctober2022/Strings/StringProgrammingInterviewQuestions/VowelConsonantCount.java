
/**
 * https://www.java67.com/2013/11/how-to-count-vowels-and-consonants-in-Java-String-word.html
 */
package Strings.StringProgrammingInterviewQuestions;

public class VowelConsonantCount {
    //My solution is exactly has their solution
    static void printVowelConsonant(String s){
        int n = s.length();
        int count = 0;
        for(int i = 0; i < n; i++){
            switch(s.charAt(i)){
                case 'a':
                case 'A':
                case 'e':
                case 'E':
                case 'i':
                case 'I':
                case 'o':
                case 'O':
                case 'u':
                case 'U':
                    count++;
                    break;
                default:
            }
        }
        System.out.println("Consonants: " + (26-count));
        System.out.println("Vowels: " + (count));
    }
    public static void main(String[] args) {

        String str = "geekforgeeks";

        printVowelConsonant(str);

    }
}
