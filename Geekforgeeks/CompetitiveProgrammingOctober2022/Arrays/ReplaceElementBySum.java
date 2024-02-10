/**
 * Replace every element of the array by sum of all other elements
 * https://www.geeksforgeeks.org/replace-every-element-of-the-array-by-sum-of-all-other-elements/?ref=rp
 * Input:  arr[] = {5, 1, 3, 2, 4} 
Output: 10 14 12 13 11
Original array {5, 1, 3, 2, 4}
Encrypted array is obtained as:
= {1+3+2+4, 5+3+2+4, 5+1+2+4, 5+1+3+4, 5+1+3+2}
= {10, 14, 12, 13, 11}
Each element of original array is replaced by the 
sum of the remaining array elements.  

Input: arr[] = {6, 8, 32, 12, 14, 10, 25 }
Output: 101 99 75 95 93 97 82 
 */
package Arrays;

public class ReplaceElementBySum {
    // Finds and prints the elements
    // of the encrypted array
    static void findEncryptedArray(int arr[], int n)
    {
        // total sum of elements
        // of original array
        int sum = 0;
        for (int i = 0; i < n; i++)
            sum += arr[i];
 
        // calculating and displaying
        // elements of encrypted array
        for (int i = 0; i < n; i++)
            System.out.print(sum - arr[i] + " ");
    }
 
    // Driver program
    public static void main(String[] args)
    {
        int arr[] = { 5, 1, 3, 2, 4 };
        int N = arr.length;
        findEncryptedArray(arr, N);
    }
}
