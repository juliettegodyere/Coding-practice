/**
 * The maximum length bitonic subsequence. This is another variation
 * of longest increasing subsequence (LIS).
 * 
 * This is a subsequence which is first increasing and later start decreasing.
 * The idea for this solution is based on the LIS, we find out the longest
 * increasing subsequence ending with every element. So that gives us the 
 * icreasing part. Now we need to find the longest decreasing subsequence
 * that begins with every element. How do we do it? This is same as LIS, you
 * just transverse from the right side. If you transverse from the right side,
 * you will have the increasing subsequence ending with this element which is
 * decreasing subsequence from left side, beginning with this element. When you have
 * both LIS, then you run one more loop that considers every element in the main array
 * as a pivot.
 * lis[i] + lds[i] - 1
 * Then you take the max value
 */

package DynamicProgramming;

public class MaximumLengthBitonicSubsequence {
    
}
