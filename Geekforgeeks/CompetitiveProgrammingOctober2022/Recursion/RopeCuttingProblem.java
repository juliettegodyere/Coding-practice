/**
 * A rope of length N. Our task is to cut this rope into maximum number of pieces
 * such that each length is either A, B , C.
 * Exmaple
 * N = 23, 11, 9, 12
 * The maximum pieces we can make is 23
 * Worst time complexity is 0(3^n)
 *                      23
 *            /         |       \
 *          12          14        11
 *        / |  \       / | \     / | \
 *       1  3   0     3  5  2    0  2 -1
 *      /|\ /|\      /|\/|\/|\     /|\
 *    
 */

package Recursion;
import java.lang.Math;
public class RopeCuttingProblem {
    public static int maxPieces(int n, int a, int b, int c){
        if(n == 0){
            return 0;
        }
        if(n < 0){
            return -1;
        }
        int recurA = maxPieces(n - a, a, b ,c);
        int recurB = maxPieces(n - b, a, b ,c);
        int recurC = maxPieces(n - c, a, b ,c);

        int maxAB = Math.max(recurA, recurB);
        int maxABC = Math.max(maxAB, recurC);

        if(maxABC == -1){
            return -1;
        }
        else{
             return maxABC + 1;
        }
    }
    public static void main(String[] args) 
	{   
        int n = 23;
        System.out.println(maxPieces(n, 11, 9, 12));
	}
}
