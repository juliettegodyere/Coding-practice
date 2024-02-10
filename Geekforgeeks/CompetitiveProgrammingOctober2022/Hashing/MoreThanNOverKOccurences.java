package Hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MoreThanNOverKOccurences {
    public static void main (String[] args) 
    {
        int arr[] = new int[]{10, 10, 20, 30, 20, 10,10};
        
        int n = arr.length;
        int k=2;
        printNByK(arr, n, k);
        
    }
    
    static void printNByK(int arr[], int n, int k)
    {
        Arrays.sort(arr);
        int i=1,count=1;
        while(i<n){
            while(i<n&& arr[i]==arr[i-1]){
                count++;
                i++;
            }
            if(count>n/k)
                System.out.print(arr[i-1]+" ");
            count=1;
            i++;
        }
        
    }

    static void printNByKEff(int arr[], int n, int k)
    {
        HashMap<Integer,Integer> m=new HashMap<Integer,Integer>();
        
        for(int x:arr)
            m.put(x,m.getOrDefault(x,0)+1);
        for(Map.Entry <Integer,Integer> e:m.entrySet())
            if(e.getValue()>n/k)
                System.out.print(e.getKey()+" ");
    }
}
