/**
 * https://www.hackerrank.com/challenges/flipping-bits/problem?isFullScreen=true
 */

package BitMagic.Problem;

public class FlipAllBits {
    static long flip(int n){
        int res = 0;
        for(int i = 0; i < 31; i++){
            res = res + ~n;
        }
       return res;
    }
    public static void main (String[] args) {
	    
	    int n = 9;
	    
		System.out.println(flip(n));
	}
}
