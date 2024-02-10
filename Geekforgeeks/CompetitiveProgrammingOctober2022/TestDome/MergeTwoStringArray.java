package TestDome;

import java.util.*;

public class MergeTwoStringArray {
    public static String merge(String str1[], String str2[]){
        //Without duplicate
        Set<String> set = new HashSet<>();
        for(String str: str1){
            set.add(str);
        }
        for(String str: str2){
            set.add(str);
        }
        String result = "";
        for(String str: set){
            result+=" "+str;
        }
        return result;
    }

    public static void main(String[] args){
        String str1[] = {"hello", "world", "good"};
        String str2[] = {"beautiful", "people", "of", "Ika"};

        System.out.println(merge(str1, str2));
    }
}
