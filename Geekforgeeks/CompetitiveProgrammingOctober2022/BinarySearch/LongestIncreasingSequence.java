/**
 * https://ide.geeksforgeeks.org/RVW6wkr5qV
 * Other solutions are here: /Users/julietnkwor/Documents/workspace/Juliette/Geekforgeeks/CompetitiveProgrammingOctober2022/DynamicProgramming/LongestIncreasingSubsequence.java
 * Dry run
 * Example
 * arr = [3, 10, 20, 4, 6, 7]
 * Initially
 * tail = [3, 0, 0, 0, 0, 0]
 * len = 1
 * 
 * i = 1
 * tail = [3, 10, 0, 0, 0, 0]
 * len = 2
 * 
 * i = 2
 * tail = [3, 10, 20, 0, 0, 0]
 * len = 3
 * 
 * i = 3
 * tail = [3, 4, 20, 0, 0, 0]
 * len = 3
 * 
 * i = 4
 * tail = [3, 4, 6, 0, 0, 0]
 * len = 3
 * 
 * i = 5
 * 
 * tail = [3, 4, 6, 7, 0, 0]
 * len = 4
 * 
 * final answer is 4
 * Time complexity is O(NlogN)
 * Aux space 0(n)
 */
package BinarySearch;

public class LongestIncreasingSequence {
    static int ceilIdx(int tail[], int l, int r, int key) 
        { 
            while (r > l) {         
                int m = l + (r - l) / 2; 
                if (tail[m] >= key) 
                    r = m; 
                else
                    l = m+1; 
            } 
      
            return r; 
        }
        
  
    static int LIS(int arr[], int n) 
    { 
     
  
        int[] tail = new int[n]; 
        int len =1; 
  
        tail[0] = arr[0]; 
        
        for (int i = 1; i < n; i++) {
            
            if(arr[i] > tail[len - 1])
            {
                tail[len] = arr[i];
                len++;
            }
            else{
                int c = ceilIdx(tail, 0, len - 1, arr[i]);
                
                tail[c] = arr[i];
            }
        } 
  
        return len; 
    } 

	public static void main (String[] args) 
	{
	    int arr[] ={3, 10, 20, 4, 6, 7};
        int n = 6;
        
        System.out.println(LIS(arr, n));

	    
	}
}
