package DynamicProgramming;

public class MinDeletionsToMakeArraySorted {
    static int minDel( int arr[], int n )  
        {  
            int lis= LongestIncreasingSubsequence.LIS(arr, n);
            
            return n-lis;
         
        }  

	public static void main (String[] args) 
	{
	    int arr[] ={3, 4, 2, 8, 10, 5, 1};
        int n = 7;
        
        System.out.println(minDel(arr, n));

	    
	}
}
