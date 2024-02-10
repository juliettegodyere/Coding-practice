/**Repeating Elements
 * 1. Array size n >=2
 * 2. Only one element repeats(Any number of time)
 * 3. All the elements from 0 to max are present
 * Therefore 0 <= max(arr) <= n-2.
 * We need to sole the problem
 * 1. 0(n) time
 * 2. 0(1) Aux space
 * 3. No modification to the original array
 * This solution modifies the original array which is not the requirement
 */
package BinarySearch;

import java.util.Arrays;

public class RepeatingElement {
    /**
     * 0(n^2) time and 0(1) aux 
     */
    public static int getElement(int aa[], int n){
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                if(aa[i] == aa[j]){
                    return aa[i];
                }
            }
        }
        return -1;
    }
    /**
     * 0(nlogn) time and 0(1) aux 
     * Sort the array in this solution
     * This solution modifies the original array which is not the requirement
     */
    public static int getElement2(int aa[], int n){
        Arrays.sort(aa);
        for(int i = 1; i < n; i++){
            if(aa[i-1] == aa[i]){
                return aa[i];
            }
            
        }
        return -1;
    }
    /**Efficient solution.
     * The idea is simple. We use a boolean array of same size as the 
     * given array and we are going to use the array elements as indexes
     * in this boolean array. So we transverse through the original array,
     * Every index we visit, we use it as index in the boolean array and mark 
     * it as visited and if you see an element whose entry is already marked
     * as true, it means this element is repeating and that's out answer.
     * 0(n) time and 0(n) space
     * 
     */
    public static int getElement3(int aa[], int n){
        boolean visit[] = new boolean[n];

		for(int i = 0; i < n; i++)
		{
			if(visit[aa[i]])
				return aa[i];
			visit[aa[i]] = true;
		}

		return -1;
	}
    /**An optimal solution that meets the requirement
     * Here is the idea to solve the problem with the given time and space constraint.
     * The idea is to transverse the array from let to right, use array elements as indexes
     * and form chain. and in this chain, we will always see a circle, where our repeating
     * element will always be the first element of the circle. Our target is to find the first
     * node of the circle and the first node of the circle, we are going to use the popular algorithm
     * which is LinkedList .
     * I don't understand this solution
     * 
     * @param args
     */
    static int repeat(int arr[], int n)
	{
		int slow = arr[0], fast = arr[0];

		do{
			slow = arr[slow];
			fast = arr[arr[fast]];
		
		}while(slow != fast);
		
		slow = arr[0];

		while(slow != fast)
		{
			slow = arr[slow];
			fast = arr[fast];
		}
		return slow;
	}

    
    public static void main(String args[]) 
    {

		int arr[] = {0, 2, 1, 3, 2, 2}, n= 6;

        System.out.println(getElement(arr, n));
        System.out.println(getElement2(arr, n));
        System.out.println(getElement3(arr, n));

    }
}
