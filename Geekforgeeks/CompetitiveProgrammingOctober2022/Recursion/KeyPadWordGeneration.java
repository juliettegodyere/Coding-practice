package Recursion;

import java.util.HashMap;
import java.util.*;

public class KeyPadWordGeneration {
   
    static String swap(String str, int i, int j){
        char ch[] = str.toCharArray();
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;

        return String.valueOf(ch);
    }
    public static ArrayList<String> keypad(int a[], int N){
        Map<Integer, String> mp = new HashMap<>();
        ArrayList<String> list = new ArrayList<>();
       
        mp.put(2, "ABC");
        mp.put(3, "DEF");
        mp.put(4, "GHI");
        mp.put(5, "JKL");
        mp.put(6, "MNO");
        mp.put(7, "PQRS");
        mp.put(8, "TUV");
        mp.put(9, "WXYZ");
        for(int i = 0; i < N; i++){
            String str = mp.get(a[i]);
            int l = 0;
            int r = str.length()-1;
            permute(str, l,r, list);
            System.out.println(list);
        }
        return list;
    }
    public static void permute(String str, int left, int right, List<String> s){

        if(left == right){
           //System.out.println(str);
           s.add(str);
            return;
        }
        //System.out.println(s);
        for(int i = left; i <= right; i++){
            String swapped = swap(str, left, i);
            permute(swapped, left+1, right, s);
            swapped = swap(str, left, i);
        }
        //System.out.println(list);
    }

    public static void main(String[] args){
        int a[] = {2,3,4};
        int n = a.length;
        System.out.print(keypad(a, n));
    }
}
