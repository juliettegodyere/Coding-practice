/**
 * https://practice.geeksforgeeks.org/batch/cp-41/track/CP-33Strings/video/MTM5Nw%3D%3D
 * Proper prefix of ABC = "", a, ab
 * Suffix of ABC = "", c, bc, abc
 * To find out the longest proper prefix suffix (lps)
 * 1. We construct an array of lps []. 
 *  a. the first value of this array will always be 0; because for a string of 1, 
 * you can not have a lps that is more than 0.
 * b. Your second entry depends if the first two values in the string are the same. e.g In the String ABC, 
 * A & B are not same. This means that the lps is O.
 * 
 * Examples will help clarify further
 * Str = ababc
 * lps = [0, 0, 1, 2, 0]
 * 1. First entry always 0
 * 2. A & B aint same
 * 3. aba. The result is 1 because there is a proper prefix of length 1 which is also a suffix
 * 4. abab - The result is 2 because there is a proper prefix of length 2 which is also a suffix
 * 5. ababc - The result is 0 because there is no proper prefix or suffix
 * 
 * Example 2
 * Str = abacabad
 * lps=[0,0,1,0,1,1,2,3,0]
 * 1. First entry always 0
 * 2. A & B aint same
 * 3. aba. The result is 1 because there is a proper prefix of length 1 which is also a suffix
 * 4. ababc - The result is 0 because there is no proper prefix or suffix
 * 5. ababca - The result is 1 because there is a proper prefix of length 1 which is also a suffix
 * 6. ababcab - The result is 2 because there is a proper prefix of length 2 which is also a suffix
 * 7. ababcaba - The result is 3 because there is a proper prefix of length 3 which is also a suffix
 * 8. ababcabad - The result is 0 because there is no proper prefix or suffix
 * 
 * Example 3
 * Str = abbabb
 * lps = [0, 0, 0, 1,2,3]
 * 
 * Example 4
 * Str = aaaa
 * lps = [0,1,2,3]
 * 
 * Example 5
 * str = ababab
 * lps = [0,0,1,2,3,4]
 */

package Strings;

public class KMPLongestPrefixSuffix {
    
}
