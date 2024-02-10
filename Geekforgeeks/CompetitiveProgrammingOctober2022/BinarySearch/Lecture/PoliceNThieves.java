package BinarySearch.Lecture;

//https://practice.geeksforgeeks.org/problems/e47329920b4e75869ea7b0e9b7c59ea145ccc22c/1
import java.util.*;

class Solution 
{ 
    static int catchThieves(char arr[], int n, int k) 
	{ 
        // Code here
        int count = 0;
        ArrayList<Integer> police = new ArrayList<Integer>(); 
        ArrayList<Integer> thief = new ArrayList<Integer>(); 
        
        for(int i = 0; i < n; i++){
            if(arr[i] == 'T'){
                thief.add(i);
            }else{
                police.add(i);
            }
        }
        int i = 0, j = 0;
        while(i < police.size() && j < thief.size()){
            int distance = Math.abs(police.get(i) - thief.get(j));
            if(distance <= k){
                count++;
                i++;
                j++;
            }else if(police.get(i) < thief.get(j)){
                i++;
            }else{
                j++;
            }
        }
        return count;
	} 
}