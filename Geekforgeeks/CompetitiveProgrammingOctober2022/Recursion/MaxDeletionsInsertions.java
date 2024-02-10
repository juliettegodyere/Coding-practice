
/** The Edit Distance problem.
 * Example
 * S1 = "CAT", S2 = "CUT" O/P 1 One replacement
 * S1 = "GEEK", S2 = "GEEKS" O/P 1 removal
 * S1 = "SATURDAY", S2 = "SUNDAY" O/P 3 => here we need two removal operations, 
 * and one replacement
 * Here we can carry out the following operations. Insert, replace and delete
 * The goal is to convert S1 into S2 using 3 operations. We can insert the 
 * charcater, delete or replace any of these characters with any other characters.
 * We need to do this conversion using minimum number of operations. So we count 
 * every operation, whether it is insert, delete or replace operation as one operation.
 * and we need to minimize the total number of operations.
 * 
 */
package Recursion;

public class MaxDeletionsInsertions {
    static int eD(String s1, String s2, int m, int n)
        {
            if(m==0)
                return n;
            if(n==0)
                return m;
                
            if(s1.charAt(m-1)==s2.charAt(n-1))
                return eD(s1,s2,m-1,n-1);
            else
            {
                return 1 + Math.min(eD(s1,s2,m,n-1), Math.min(eD(s1,s2,m-1,n), 
                                                            eD(s1,s2,m-1,n-1)));
            }
            
        }


	public static void main (String[] args) {
		
	    String s1="METRONIDAZOLE SUSP 200MG/5ML", s2="METRONIDAZOLE TAB 200MG";
        int m= s1.length(), n=s2.length();
	
	  
	   System.out.println(eD(s1,s2,m,n));
	    
	}
}
