package Queue;

/**
 * Generate numbers with given digits
 * Given a number n, print first n number(in increasing order) such that all these numbers have digits in set {5, 6}
 */

import java.util.LinkedList;
import java.util.Queue;

public class GenerateNumbersWithGivenDigits {
    static void printFirstN(int n) 
	{ 
	    Queue<String> q = new LinkedList<>();
	    
	    q.add("5");
	    q.add("6");
	    
	    for(int i = 0; i < n; i++)
	    {
	        String curr = q.poll();
	       
	        System.out.print(curr+ " ");
	        
	        q.add(curr + "5");
	        q.add(curr + "6");
	    }
	        
	} 

 
	public static void main(String args[]) 
	{ 
		int n = 5;
		
		printFirstN(n);
	} 
}
