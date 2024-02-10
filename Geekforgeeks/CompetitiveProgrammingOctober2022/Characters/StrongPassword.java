/**
 * https://www.hackerrank.com/challenges/strong-password/problem?isFullScreen=true
 */
package Characters;

public class StrongPassword {
    public static int minimumNumber(int n, String password) {
        // Return the minimum number of characters to make the password strong
        int minVal = Integer.MAX_VALUE;
        int minCount = 0;
        for(int i = 0; i < n; i++){
            if(password.charAt(i) >= 0 && password.charAt(i) <= 32){
                //System.out.println(password.charAt(i));
                //System.out.println((int)password.charAt(i));
                minCount++;
            }
        }
        return 1;
            
        }
}
