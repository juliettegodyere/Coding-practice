package Arrays.Sliding_window_technique;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//Smallest window that contains all characters of string itself
//https://www.youtube.com/watch?v=zm50uGBsSz4

public class SmallestDistinctWindow {
    static int findSubString(String str, int n){
        Set<Character> set = new HashSet<>();
        Map<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < n; i++){
            set.add(str.charAt(i));
        }
        int j = 0;
        int k = 0;
        int maxLen = Integer.MAX_VALUE;
        //AABBBCBBAC
        while(k < n){
            map.put(str.charAt(k), map.getOrDefault(str.charAt(k), 0)+1); //{A:2}{B:3}{C:1}
            if(map.size() == set.size()){ //set.size() = 3, 
                while(map.get(str.charAt(j)) > 1){
                    map.put(str.charAt(j), map.get(str.charAt(j))-1);
                    j++;
                }
                maxLen = Math.min(maxLen, k - j + 1);
            }
            k++;
        }
        return maxLen;
    }
    public static void main (String[] args) 
    { 
        String str = "aabcbcdbca"; 
        System.out.println(findSubString(str, str.length())) ; 
    } 
}
