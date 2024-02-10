/**
 * https://www.youtube.com/watch?v=2sGL8Q_jX4k
 * https://www.geeksforgeeks.org/find-possible-words-phone-digits/
 */
package Recursion;

import java.util.*;

public class PossibleWord4PhoneDigits {
    static void solve(int i, String res,  Map<Integer, String> map, int a[], int N, ArrayList<String> ans){
        if(i >= N){
            ans.add(res);
            return;
        }
        int key = a[i];
        ArrayList<Integer> keys = new ArrayList<>();
        ArrayList<String> values = new ArrayList<>();
        for(Map.Entry<Integer, String> hmap: map.entrySet()){
            keys.add(hmap.getKey());
            values.add(hmap.getValue());
        }
        for(int j = 0; j < keys.get(i); i++){
            //res+=values.get(charAt(i));
            solve(i+1, res, map, a, N, ans);


        }
    }
    static ArrayList <String> possibleWords(int a[], int N)
    {
        Map<Integer, String> map = new HashMap<>(); 
        ArrayList<String> answer = new ArrayList<>();
        String res = "";

        map.put(1, "");
        map.put(2, "ABC");
        map.put(3, "DEF");
        map.put(4, "GHI");
        map.put(5, "JKL");
        map.put(6, "MNO");
        map.put(7, "PQRS");
        map.put(8, "TUV");
        map.put(9, "WXYZ");
        map.put(10, "*");
        map.put(11, "0");
        map.put(12, "£");//I used dollar sign because I do not have hash on my keyboard

        //solve(0, res, map, a, N, answe);

        return answer;
    }
}
