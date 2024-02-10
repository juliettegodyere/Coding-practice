package Hashing;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class PositiveNagativePair {
     //Function to return list containing all the pairs having both
    //negative and positive values of a number in the array.
    public static ArrayList<Integer>findPairs(int arr[], int n) 
    { 
    	ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                int r = Math.abs(arr[i]);
                int l = Math.abs(arr[j]);

                if(r == l){
                    list.add(-r);
                    list.add(r);
                }
            }
        }

        return list;

    }

    public static ArrayList<Integer> findPairs2(int arr[], int n) {
        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> absSet = new HashSet<>();

        for (int i = 0; i < n; i++) {
            int num = arr[i];
            int absNum = Math.abs(num);

            if (absSet.contains(absNum)) {
                // Add the pair of positive and negative values
                list.add(-absNum);
                list.add(absNum);
            } else {
                absSet.add(absNum);
            }
        }

        return list;
    }


     public static void main(String[] args) 
	{   
        int arr[] = {1,3,6,-2,-1,-3,2,7};
        int n = arr.length;
        System.out.println(findPairs(arr,n));
	}
}
