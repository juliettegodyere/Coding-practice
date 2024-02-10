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
            System.out.println(s.charAt(i));
            int c = s.charAt(i);
            System.out.println(c >= 0);
            System.out.println(c <= 9);

            if((c >= 0) && (c <= 9)){
                //continue;
            }else{
                return false;
            }
        }
       
        return true;
    }

    public static void main(String[] args) {

        String c = "123989";
        System.out.println(isDigit(c));
    }
}
