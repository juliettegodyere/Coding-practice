/**
 * Given a Roman numeral, the task is to find its corresponding decimal value.
 * SYMBOL       VALUE
  I            1
  IV           4
  V            5
  IX           9
  X            10
  XL           40
  L            50
  XC           90
  C            100
  CD           400
  D            500
  CM           900 
  M            1000
 */

package Strings;

import java.util.Map;
import java.util.HashMap;

public class RomanNumeralToNumber{
	
private static final Map<Character,
						Integer> roman = new HashMap<Character,
													Integer>()
{{
	put('I', 1);
	put('V', 5);
	put('X', 10);
	put('L', 50);
	put('C', 100);
	put('D', 500);
	put('M', 1000);
}};

/**
 * str = "MCMIV"
 * sum = 0
 * i = 0
 * n = 5
 * n-1 = 4
 * 0 != 4 && 1000 < 100 no
 * sum = 1000
 * i = 1
 * 1 != 4 && 100 < 1000 yes
 * sum = 1000 + 900
 * i = 3
 * 3 != 4 && 1 < 5 yes
 * sum = 1900 + 4
 * i = 5
 * sum = 1904
 * 
 */
private static int romanToInt(String s)
{
	int sum = 0;
	int n = s.length();
	
	for(int i = 0; i < n; i++){
		if (i != n - 1 && roman.get(s.charAt(i)) < roman.get(s.charAt(i + 1))){
			sum += roman.get(s.charAt(i + 1)) - roman.get(s.charAt(i));
			i++;
		}else{
			sum += roman.get(s.charAt(i));
		}
	}
	return sum;
}

// Driver Code
public static void main(String[] args)
{
	
	// Considering inputs given are valid
	String input = "III";
	
	System.out.print("Integer form of Roman Numeral is " +
					romanToInt(input));
}
}

// This code is contributed by rahuldevgarg
