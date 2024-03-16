/**
 * This is another varaition of Longest Incresing Subsequence(LIS)
 * Sort the north-south pairs on the basis of increasing order of south x-coordinates.
If two south x-coordinates are same, then sort on the basis of increasing order of north x-coordinates.
Now find the Longest Increasing Subsequence of the north x-coordinates.
One thing to note that in the increasing subsequence a value can be greater as well as can be equal to its previous value.
 * 
 */

package DynamicProgramming;

import java.util.Arrays;
import java.util.Comparator;

class CityPairs // Create user-defined class
{
    int north, south;
    CityPairs(int north, int south) // Constructor
    {
        this.north = north;
        this.south = south;
    }
}

class MyCmp implements Comparator<CityPairs> 
{
    public int compare(CityPairs cp1, CityPairs cp2)
    {
        // If 2 cities have same north coordinates
        // then sort them in increasing order
        // according to south coordinates.
        if (cp1.north == cp2.north)
            return cp1.south - cp2.south;
 
        // Sort in increasing order of
        // north coordinates.
        return cp1.north - cp2.north;
    }
}

public class BuildingBridges {

    public static int maxBridges(CityPairs[] pairs, int n)
    {
        int[] LIS = new int[n];
        // By default single city has LIS = 1.
        Arrays.fill(LIS, 1);
 
        Arrays.sort(pairs, new MyCmp()); // Sorting->
                                         // calling
        // our self made comparator
 
        // Logic for Longest increasing subsequence
        // applied on south coordinates.
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (pairs[i].south >= pairs[j].south)
                    LIS[i] = Math.max(LIS[i], LIS[j] + 1);
            }
        }
        int max = LIS[0];
        for (int i = 1; i < n; i++) {
            max = Math.max(max, LIS[i]);
        }
 
        // Return the max number of bridges that can be
        // built.
        return max;
    }
    

    // Driver Program to test above
    public static void main(String[] args)
    {
        int n = 4;
        CityPairs[] pairs = new CityPairs[n];
        pairs[0] = new CityPairs(6, 2);
        pairs[1] = new CityPairs(4, 3);
        pairs[2] = new CityPairs(2, 6);
        pairs[3] = new CityPairs(1, 5);
        System.out.println("Maximum number of bridges = "
                           + maxBridges(pairs, n));
    }
}
