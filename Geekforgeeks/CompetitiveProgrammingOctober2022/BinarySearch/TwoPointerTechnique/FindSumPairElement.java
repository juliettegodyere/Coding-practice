/**Given a sorted array and a sum, find if there is a sum with given sum
 * Takes 0(N) time and 0(1) space. The two pointer approach works for sorted
 * array. If you have an unsorted array, use the hashing technique or
 * you sort the array first which will give 0(nlogn) time but the hashing
 * will give 0(n) time and 0(n) space.
 * 
 */
package BinarySearch.TwoPointerTechnique;

public class FindSumPairElement {
    public static boolean getPair(int arr[], int n, int x){
        int left = 0;
        int right = n-1;

        while(left <= right){
            if(arr[left]+arr[right]==x){
                return true;
            }else if(arr[left]+arr[right] > x ){
                right--;
            }else {
                left++;
            }
        }
        return false;
    }
    // Main to test the above function 
	public static void main(String[] args) 
	{ 
		int A[] = { 2, 3, 7, 8, 11 }; 
		int n = A.length;
        int x = 14; 
		System.out.println(getPair(A, n, x)); 
	} 
}
