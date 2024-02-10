/**
 * Find the two numbers that appeared old times.
 * Properties of XOR
 * x ^ 0 = x
 * x ^ y = y ^ x
 * x ^ (y^z) = (x ^ y) ^ z
 * x ^ x = 0;
 */
package BitMagic;

public class TwoOddAppearingNumbers {
    //Naive method
    static void oddAppearing(int arr[], int n)
    {
        for(int i = 0; i < n; i++)
        {
            int count = 0;
            
            for(int j = 0; j < n; j++)
            {
                if(arr[i] == arr[j])
                    count++;
            }
            
            if(count % 2 != 0)
                System.out.print(arr[i]+" ");
            
        }
        
    }
    /** The efficient approach.
     * This problem is an extension of one odd occuring number.
     * We will use XOR again
     * Exxample
     * arr[]= {3, 4, 3, 4, 5, 4, 4, 6, 7, 7}
     * 1. We do XOR of all the numbers. All the even occuring numbers will cancel each other.
     * because x ^ x = 0; The two odd occuring numbers will not cancel each other.
     * xor = 3^4^3^4^5^4^4^6^7^7
     * xor = 5^6
     * How do we find the two numbers from the xor?
     * If you do xor of two numbers x and y, then your xor is 
     * going to have a bit as 1 when the bit is diffrent in x and y
     * and it will have a bit as 0 when the tow bits are same.
     * 5: 0101
     * 6: 0110
     * -------
     * 3: 0011 - xor of 5 and 6
     * Now we take a set bit in this number xor which is 3, and we divide all the 
     * numbers in the array into two sets. One set of numbers have the set bit as set 
     * and one set don't have the set bit as set.
     * Let's say we consider the last set bit in the binary representation of 3,
     * We know that the two numbers that we going to find, one of them will have it's
     * set bit as 0 will the other will have it's set bit has 1.
     * To find the rightmost set bit
     * xor = 3 - 011
     * xor-1 = 2 010
     * ~xor-1 = 5 101
     * xor & (~xor-1) = 001
     * group1 => last bit set [3,3,5,7,7]
     * group2 => last bit not set [4,4,4,4,6]
     * Next we do xor of all the numbers in group1 and group2
     * xor1 = 3^3^5^7^7
     * xor2 = 4^4^4^4^6
     * print(xor1, xor2) => result
     * 
     */
    static void oddAppearing2(int arr[], int n)
    {
        int xor = 0, res1 = 0, res2 = 0; 
        
        for (int i = 0; i < n; i++) 
        xor = xor ^ arr[i]; //xor of all numbers 

        int sn = xor & (~(xor - 1)); //find the rightmost bit
  
        for (int i = 0; i < n; i++) 
        { 
            if ((arr[i] & sn) != 0) 
                res1 = res1 ^ arr[i]; 
            else
                res2 = res2 ^ arr[i]; 
        } 
        
        
        System.out.println( res1 + " " + res2);
        
    }
	public static void main (String[] args) {
	    
	    int arr[]= {3, 4, 3, 4, 5, 4, 4, 6, 7, 7}, n = 10;
	    
	    oddAppearing(arr, n);
	}
}
