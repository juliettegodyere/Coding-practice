/**
 * In this example, we need to find, the count of elements in the union of the
 * two unsorted arrays. You need to count only the destinct elements. This function 
 * will print the distinct element in both array 1 and 2
 */


package Hashing;

import java.util.HashSet;

public class UnionOfTwoArrays {
    static int countUnion(int arr[], int arr2[], int n, int m){

        HashSet<Integer> set = new HashSet<>();
        for(int x: arr){
            set.add(x);
        }
        for(int x: arr2){
            set.add(x);
        }
        
        return set.size();
    }
    public static void main(String[] args) 
	{   
        int arr1[] = new int[]{15, 17, 27, 27, 28, 15};
        int arr2[] = new int[]{16, 17, 28, 17, 31, 17};
        int m1 = arr1.length;
        int n1 = arr2.length;
        
        System.out.println(countUnion(arr1, arr2, n1, m1));
	}
}
