/**
 * The Josehus problem. There are n people standing in the queue, we need to kill
 * the kth person in every iteration and this has to be done in a circular manner.
 * After that, we need to find the position of the survivor. The first killed person
 * is always the k-1th person.
 * Example
 * n = 7 and k = 3
 * 0,1,2,3,4,5,6
 * 1st kill from 0 is 2
 * 0,1,3,4,5,6
 * 2nd kill from 3 is 5
 * 0,1,3,4,6
 * 3rd kill from 6 is 1
 * 0,3,4,6
 * 4th kill from 3 is 6
 * 0,3,4
 * 5th kill from 0 is 4
 * 0,3
 * 6th kill from 0 is 0
 * 3
 * Dry run
 * jsP(5,3)
 * ((jsP(4,3) + 3) 
 * (jsP(3,3) + 3)% 4 + 3)%5
 * ((jsP(2,3) + 3)% 3 + 3)%4 + 3)%5
 * ((((jsP(1,3) + 3)% 2)+ 3)%3 + 3)%4 + 3)%5 = 3
 */
package Recursion;

public class JosehusProblem {
    public static int jsP(int n, int k){
        if(n == 1){
            return 0;
        }

        return ((jsP(n-1, k)+k)%n);
    }
    public static void main(String[] args) 
	{   
        int n = 5;
        System.out.println(jsP(n, 3));
	}
}
