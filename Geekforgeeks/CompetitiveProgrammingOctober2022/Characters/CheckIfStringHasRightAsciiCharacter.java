/**Ascii character list https://www.w3schools.com/charsets/ref_html_ascii.asp
 * Here we are going to check if the given String has the valid characters
 * The valid characters are 
 * 1. The character most be a number between 0-9 
 * 2. A lowercase alphabet a-z
 * 3. A uppercase alphabet A-Z
 * 4. The accepted special characters
 * In the ascii character list, 0-37 are not a valid special character.
 */
package Characters;

public class CheckIfStringHasRightAsciiCharacter {
    static String validString(String s){
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) >= 0 && s.charAt(i) <= 32){
                System.out.println(s.charAt(i));
                System.out.println((int)s.charAt(i));
                return "invalid";
            }
        }
        return "valid";
    }
    public static void main(String[] args) {

        String str = "'aA:/12&%";
        System.out.println(validString(str));
    }
}
