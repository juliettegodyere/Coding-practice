package Strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CountingDuplicates {
    public static int countDuplicate(String str){
        int count[] = new int[256];
        int n = str.length();
        String toStr = str.toLowerCase();

        for(int i = 0; i < n; i++){
            count[toStr.charAt(i)]++;
        }
        int occ = 0;
        for(int i = 0; i < 256; i++){
            if(count[i] > 1){
                occ++;
            }
        }
        return occ;
    }

     public static int countDuplicate2(String str){
       Map<Character, Integer> hash = new HashMap<>();
        int n = str.length();
        String toStr = str.toLowerCase();

        for(int i = 0; i < n; i++){
            char x = toStr.charAt(i);
            hash.put(x, hash.getOrDefault(x, 0)+1);
        }
        int occ = 0;
        for(Entry<Character, Integer> h: hash.entrySet()){
            if(h.getValue() > 1){
                occ++;
            }
        }
        return occ;
    }

    public static void main(String[] args) 
    {   
        String str1 = "indivisibility";
        System.out.println(countDuplicate(str1));
         System.out.println(countDuplicate2(str1));
    }
}
