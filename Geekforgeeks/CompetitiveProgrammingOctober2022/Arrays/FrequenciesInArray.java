/**
 * You are given a sorted array, find the frequencies of the 
 * elements in the array
 */
package Arrays;

import java.util.LinkedHashMap;
import java.util.Map;

public class FrequenciesInArray {
    static void printFreq(int arr[], int n)
    {
    	int freq = 1, i = 1;

    	while(i < n)
    	{
    		while(i < n && arr[i] == arr[i - 1])
    		{
    			freq++;
    			i++;
    		}

    		System.out.println(arr[i - 1] + " " + freq);

    		i++;
    		freq = 1;
    	}
    	if(n==1 || arr[n-1]!=arr[n-2])
    	System.out.println(arr[n-1]+" "+ 1) ;
    }

	public static void getFrequencies(int arr[]){
		Map<Integer, Integer> hash = new LinkedHashMap<>();
		int n = arr.length;

		for(int i = 0; i < n; i++){
			hash.put(arr[i], hash.getOrDefault(arr[i], 0)+1);
		}

		for(Map.Entry<Integer, Integer> h: hash.entrySet()){
			System.out.println(h.getKey() + " : " + h.getValue());
		}
	}


    public static void main(String args[]) 
    { 
       int arr[] = {10, 10, 20, 30, 30, 30}, n = 6;

       printFreq(arr, n);
	   getFrequencies(arr);

    } 
}
