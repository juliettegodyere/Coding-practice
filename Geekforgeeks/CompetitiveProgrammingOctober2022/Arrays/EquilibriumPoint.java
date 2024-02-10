/**https://www.geeksforgeeks.org/equilibrium-index-of-an-array/
 * Equilibrium index of an array
 * Given a sequence arr[] of size n, Write a function int equilibrium(int[] arr, int n) 
 * that returns an equilibrium index (if any) or -1 if no equilibrium index exists. 

The equilibrium index of an array is an index such that the sum of elements at lower indexes 
is equal to the sum of elements at higher indexes. 

Examples: 

Input: A[] = {-7, 1, 5, 2, -4, 3, 0} 
Output: 3 
3 is an equilibrium index, because: 
A[0] + A[1] + A[2] = A[4] + A[5] + A[6]
 */
package Arrays;

public class EquilibriumPoint {
    /**
     * Naive Approach
     * Initially
     * Time Complexity: O(N2)
     * Auxiliary Space: O(1)
     */
    public static int equilibrium(int arr[], int n){
        int i, j;
        int leftsum, rightsum;
 
        /* Check for indexes one by one until
           an equilibrium index is found */
        for (i = 0; i < n; ++i) {
 
            /* get left sum */
            leftsum = 0;
            for (j = 0; j < i; j++)
                leftsum += arr[j];
 
            /* get right sum */
            rightsum = 0;
            for (j = i + 1; j < n; j++)
                rightsum += arr[j];
 
            /* if leftsum and rightsum are same,
               then we are done */
            if (leftsum == rightsum)
                return i;
        }
 
        /* return -1 if no equilibrium index is found */
        return -1;
    }
    /**
     * Equilibrium index of an Array using Array-Sum:
To solve the problem follow the below idea:

The idea is to get the total sum of the array first. Then Iterate through the array 
and keep updating the left sum which is initialized as zero. In the loop, we can get 
the right sum by subtracting the elements one by one. Thanks to Sambasiva for 
suggesting this solution and providing code for this.

Follow the given steps to solve the problem:

Initialize leftsum  as 0
Get the total sum of the array as sum
Iterate through the array and for each index i, do the following:
Update the sum to get the right sum.  
sum = sum – arr[i] 
The sum is now the right sum
If leftsum is equal to the sum, then return the current index. 
update left sum for the next iteration.
leftsum = leftsum + arr[i]
Return -1 
If we come out of the loop without returning then there is no equilibrium index
Time Complexity: O(N)
Auxiliary Space: O(1)
     */
    public static int equilibrium2(int arr[], int n)
    {
        int sum = 0; // initialize sum of whole array
        int leftsum = 0; // initialize leftsum
 
        /* Find sum of the whole array */
        for (int i = 0; i < n; ++i)
            sum += arr[i];
 
        for (int i = 0; i < n; ++i) {
            sum -= arr[i]; // sum is now right sum for index
                           // i
 
            if (leftsum == sum)
                return i;
 
            leftsum += arr[i];
        }
 
        /* If no equilibrium index found, then return 0 */
        return -1;
    }
    /**Equilibrium index of an array using Prefix-Sum:
To solve the problem follow the below idea:

This is a quite simple and straightforward method. The idea is to take the prefix sum of the array twice. Once from the front end of the array and another from the back end of the array. After taking both prefix sums run a loop and check for some i if both the prefix sum from one array is equal to prefix sum from the second array then that point can be considered as the Equilibrium point

Follow the given steps to solve the problem:

Declare two arrays to store the prefix sum of the array from the front and the back
Run a loop from 1 to N and check if at any point prefix sum of the array from the front is equal to the prefix sum of the array from the back
If any such index is found then return that index
Else return -1
Time Complexity: O(N)
Auxiliary Space: O(N)
     * 
     */
    static int equilibrium3(int a[], int n)
    {
        if (n == 1)
            return (0);
 
        int[] front = new int[n];
        int[] back = new int[n];
 
        // Taking the prefixsum from front end array
        for (int i = 0; i < n; i++) {
            if (i != 0) {
                front[i] = front[i - 1] + a[i];
            }
            else {
                front[i] = a[i];
            }
        }
 
        // Taking the prefixsum from back end of array
        for (int i = n - 1; i > 0; i--) {
            if (i <= n - 2) {
                back[i] = back[i + 1] + a[i];
            }
            else {
                back[i] = a[i];
            }
        }
 
        // Checking for equilibrium index by
        // comparing front and back sums
        for (int i = 0; i < n; i++) {
            if (front[i] == back[i]) {
                return i;
            }
        }
 
        // If no equilibrium index found,then return -1
        return -1;
    }
    /**
     * Equilibrium index of an array using two pointers:
The given code is trying to find the equilibrium index of an array, where an equilibrium index 
is an index such that the sum of elements at lower indexes is equal to the sum of elements at higher indexes.

The code uses two pointers, left and right, to keep track of the sum of elements to the left and right of the 
pivot index. It starts by initializing the left pointer to 0, pivot to 0, and right pointer to the sum of all elements in the array minus the first element.

The code then enters a while loop where the pivot index is incremented until the left and right pointers are 
equal, or until the pivot index is the last index in the array.

In each iteration of the loop, the pivot index is incremented, and the right pointer is decremented by the value of 
the element at the current pivot index. The left pointer is incremented by the value of the element at the previous 
pivot index.

The code then checks if the left pointer is equal to the right pointer. If it is, the current pivot index is returned 
as the equilibrium index. If the pivot index is the last index in the array and the left pointer is still not equal 
to the right pointer, the function returns -1, indicating that no equilibrium index was found.
     */
    public static int equilibrium4(int nums[], int n) {
        int left = 0, pivot = 0, right = 0;
        for (int i = 1; i < n; i++) {
            right += nums[i];
        }
        while (pivot < n - 1 && right != left) {
            pivot++;
            right -= nums[pivot];
            left += nums[pivot - 1];
        }
        return (left == right) ? pivot : -1;
    }
 
    // Driver code
    public static void main(String[] args)
    {
        int arr[] = { -7, 1, 5, 2, -4, 3, 0 };
        int arr_size = arr.length;
 
        // Function call
        System.out.println(equilibrium4(arr, arr_size));
    }
}
