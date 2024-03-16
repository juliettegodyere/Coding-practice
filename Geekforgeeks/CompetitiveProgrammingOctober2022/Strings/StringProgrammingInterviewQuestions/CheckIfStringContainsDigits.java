/**
 * https://javarevisited.blogspot.com/2012/10/regular-expression-example-in-java-to-check-String-number.html#axzz7znYXvVb2
 */
package Strings.StringProgrammingInterviewQuestions;

public class CheckIfStringContainsDigits {
    /**
     * This code does not work. Check it later
     * @param s
     * @return
     */
    static boolean isDigit(String s){
        int n = s.length();
        for(int i = 0; i < n; i++){
            int c = s.charAt(i);
            if(!Character.isDigit(c)){
                return false;
            }
        }
       
        return true;
    }

    public static void main(String[] args) {

        String c = "123989012d";
        System.out.println(isDigit(c));
    }
}
