package Strings;

import java.util.Arrays;
import java.util.HashSet;

public class LongestSubstringDistinctCharacters {
    static boolean isDistinct(String str, int i, int j){
        boolean[] visited = new boolean[256];
        for(int k = 0; k < j; k++){
            if(visited[str.charAt(k)] == true){
                return false;
            }
            visited[str.charAt(k)] = true;
        }
        return true;
    }

    static boolean isDistinct2(String str, int start, int end) {
        HashSet<Character> set = new HashSet<>();
        for (int i = start; i <= end; i++) {
            if (set.contains(str.charAt(i))) {
                return false;
            }
            set.add(str.charAt(i));
        }
        return true;
    }
   
    /**
     * Naive method N^3
     * abac
     * res = 0
     * i = 0, j=0, i to j = a, j-i+1 = 1
     * res = 1
     * i = 0, j=1, i to j = ab, j-i+1 = 2
     * res = 2
     * i = 0, j=2, i to j = aba, j-i+1 = 2
     * res = 2
     * i = 0, j=3, i to j = abac, j-i+1 = 4
     * res = 2
     * i = 1, j=0, i to j = abac, j-i+1 = 4
     */
    static int longestDistinct(String str){
        int n = str.length();
        int res = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(isDistinct2(str, i, j)){
                    res = Math.max(res, j-i+1);
                }
            }
        }
        return res;
    }
    //Better solution N^2
    static int longestDistinct2(String str){
        int n = str.length();
        int res = 0;
        for(int i = 0; i < n; i++){
            boolean[] visited = new boolean[256];
            for(int j = i; j < n; j++){
                if(visited[str.charAt(j)] == true){
                    break;
                }else{
                    res = Math.max(res, j-i+1);
                    visited[str.charAt(j)] = true;
                }
            }
        }
        return res;
    }
    //O(n)
    static int longestDistinct4(String str) 
    { 
	int n = str.length(); 
	int res = 0;
	int prev[]=new int[256];
	Arrays.fill(prev,-1);
	int i=0;
	for (int j = 0; j < n; j++){
	    i=Math.max(i,prev[str.charAt(j)]+1);
	    int maxEnd=j-i+1;
	    res=Math.max(res,maxEnd);
	    prev[str.charAt(j)]=j;
	} 
	return res; 
    } 
    //The working example
    static int longestDistinct3(String str) {
        int n = str.length();
        int res = 0;
        int i = 0;
        int j = 0;
        HashSet<Character> set = new HashSet<>();

        while (j < n) {
            if (!set.contains(str.charAt(j))) {
                set.add(str.charAt(j));
                res = Math.max(res, j - i + 1);
                j++;
            } else {
                set.remove(str.charAt(i));
                i++;
            }
        }

        return res;
    }
    public static void main(String args[]) 
    { 
        String str = "ABCDEFGABEF"; 
	    int len = longestDistinct3(str);  
        System.out.print("The length of the longest distinct characters substring is "+ len); 
    }
}

