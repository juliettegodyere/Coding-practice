
/**
 * We are given a string, and we are required to generate all the subsets of 
 * the string. In genral, if you have n characters in the subset, then you have 
 * 2^n subsets because for every characters, there are two possibilities. Either
 * the character is present or not present.
 * Hint:
 * Your powerset can be in any order
 */
package BitMagic;

public class PowerSet {
    public static void printPowerSet(String s, int n){
        System.out.print(" ");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < i; j++){
                System.out.print(s.charAt(j));
            } 
        }
    }
    /**
     * There is a bitwise operation for genrating powerset.
     * We know that there are 2^n elements in the powerset.
     * What we do is to use a counter variable that varies from 0 - 2^n-1.
     * So if n is 3, the counter will vary from 0-7. So we generate the 
     * counter from 0-7 and we consider the binary representation and 
     * we use the set bits in the binary binary representation to generate
     * the corresponding subsets.
     * If all the bits are 0, then you return empty string.
     * Note:
     * Left shifting a number multiplies the number those many times by
     * 2.
     * Example:
     * 1 - 0001
     * 1<<1 - 0010
     * result is 2
     * 1 = 0001
     * 1<<3 - 1000
     * result is 8 because 2 * 2 * 2 = 8
     * 1<<2 0100 
     * result is 4 because 2 * 2 = 4
     * 
     */
    static void printPowerSet(String str)
    {
    	int n = str.length();

    	int powSize = (int)Math.pow(2, n);

    	for(int counter = 0; counter < powSize; counter++)
    	{
    		for(int j = 0; j < n; j++)
    		{
    			if((counter & (1 << j)) != 0)
    				System.out.print(str.charAt(j));
    		}
    		
    		System.out.println();
    	}
    }
    public static void main(String args[]) 
    { 
        String s = "abc";
        int n = s.length();

        printPowerSet(s, n);  
    }
}
