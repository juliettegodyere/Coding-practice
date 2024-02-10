package Sorting;
/**
 * The condition necessary for 3 elements to form a triangle, the sum of any two sides should be greater than any two sides.
 * s1+s2 > s3
 * A + B > C
 * A + C > B
 * B + C > A
 * 
 * Efficient approach
 * if A <= B <= C
 * then C > A
 * C > B
 * Also
 * C + B > A
 * C + A > B
 * To solve
 * 1. Sort the array
 * arr[4, 6, 7, 8, 9]
 * C = 9, B = 8, A = 4
 * A + B > C
 * 4 + 8 = 12 which is greater than 9
 * If this A + B > C is satisfied, meaning that if A = 6 or A = 7 will also satisfy this condition  A + B > C
 * Then increment the count with count =+ (b-a)index => index B is 3 and index A is 0 => 3
 * count = 3;
 * At this stage, decrement the value of B. B = 7
 * 4 + 7 = 11 > 9
 * count = count + (B - A) => 5
 */
import java.util.Arrays;

public class CountNumberOfPossibleTriangles {
    static int findNumberOfTriangles(int arr[], int n) {
        Arrays.sort(arr);
        int count = 0;

        for (int i = n - 1; i >= 1; i--) {
            int A = 0;
            int B = i - 1;
            int C = arr[i];

            while (A < B) {
                if (arr[A] + arr[B] > C) {
                    // If the sum of two smaller sides is greater than the largest side,
                    // then triangles can be formed with these sides.
                    count += B - A;
                    B--;
                } else {
                    // If not, move to the next pair of smaller sides.
                    A++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int arr[] = {6, 4, 9, 7, 8};
        int n = arr.length;

        int result = findNumberOfTriangles(arr, n);
        System.out.println("Number of triangles: " + result);
    }
}
