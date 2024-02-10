/**
 * Here is the code for subset generation /Users/julietnkwor/Documents/workspace/Juliette/Geekforgeeks/CompetitiveProgrammingOctober2022/Recursion/SubsetGeneration.java
 * Time 0(2^n)
 */

package Recursion;

public class SubsetSum {
    public static int countSubset(int arr[], int n, int sum){
        if(n == 0){
            return (sum == 0) ? 1 : 0;
        }
        return countSubset(arr, n-1, sum) + countSubset(arr, n-1, sum-arr[n-1]);
    }
    public static void main(String[] args)
    {
        int arr[] = {1,2,3};
        int sum = 4;
        int n = arr.length;
 
        System.out.println(countSubset(arr, n, sum));
    }
}
