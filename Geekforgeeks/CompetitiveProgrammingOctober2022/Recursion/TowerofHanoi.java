/**
 * Tower of Hanoi.
 * When you are moving these discs, you have to move them in the same 
 * order. The largest will be at the bottom while the smallest will be at the top.
 * When you are moving these discs from tower A to tower C, you need to follow certain rules.
 * 1. Only one disc moves at a time
 * 2. No larger disc above smaller
 * 3. Only the top disc of the tower can be moved
 * We need to print moves to be done to move disc from tower A-C following the given rules.
 * Example
 * n = 2
 * 1st move
 * 1. Place Disc 1 and Disc 2 in A
 * 2. Move disc 1 from A to B
 * 3. Move disc 2 from A to C
 * 4. Move disc 1 from B to C
 * 
 * Implementation
 * 1. 1st recursive call - you move disc from A - B and use C as auxilary space.
 * 2. Move disc n from A-C
 * 3. 2nd recursive call - you move disc from B - C and use A as auxilary space.
 */
package Recursion;

public class TowerofHanoi {
    public static void TOH(int n, char A, char B, char C){
        if(n == 1){
            System.out.println("Move 1 from " + A + " to " + C);
            return;
        }
        TOH(n-1, A, C, B);
        System.out.println("Move " + n +  " from " + A + " to " + C);
        TOH(n-1, B, A, C);
    }
    public static void main(String[] args) 
	{   
        int n = 2;
        TOH(n, 'A', 'B', 'C');
	}
}
