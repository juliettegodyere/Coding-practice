//This code prints the count for elements in both array 1 and 2
package Hashing;

import java.util.*;

public class IntersectionOfTwoArrays {
    //Improved method. Time: 0(N), space 0(N). My code
    static int countIntersetion(Integer arr[], Integer arr2[], int n, int m){

        HashSet<Integer> set = new HashSet<>(Arrays.asList(arr));
        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(arr2));
        int count = 0;
        for(int x: set2){
            if(set.contains(x)){
                count++;
            }
        }
        
        return count;
    }
    //Tutorial example
    static int intersection(int arr1[], int m, int arr2[], int n)
    {
        Set<Integer> hs = new HashSet<Integer>();
        for(int i = 0; i < m; i++)
          hs.add(arr1[i]);
        int res = 0;
        for(int i = 0; i < n; i++)
        {
            if(hs.contains(arr2[i]))
            {
                res++;
                hs.remove(arr2[i]);
            }
        }
        return res;
    }
    public static void main(String[] args) 
	{   
        Integer arr[] = {10,15,20,15,30,30,5};
        Integer arr2[] = {30,5,30,80};
        int n = arr.length;
        int m = arr.length;
        System.out.println(countIntersetion(arr,arr2,n, m));
        int arr1[] = new int[]{15, 17, 27, 27, 28, 15};
        int arr22[] = new int[]{16, 17, 28, 17, 31, 17};
        int m1 = arr1.length;
        int n1 = arr2.length;
        
        System.out.println(intersection(arr1, m1, arr22, n1));
	}
}
