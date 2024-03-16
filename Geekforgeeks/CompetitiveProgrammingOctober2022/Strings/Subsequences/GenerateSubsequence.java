package Strings.Subsequences;

import java.util.ArrayList;
import java.util.List;

public class GenerateSubsequence {
    // Declare a global list
    static List<String> al = new ArrayList<>();
 
    // Creating a public static Arraylist such that
    // we can store values
    // IF there is any question of returning the
    // we can directly return too// public static
    // ArrayList<String> al = new ArrayList<String>();
    public static void main(String[] args)
    {
        String s = "abcd";
        findsubsequences(s, "", 0); // Calling a function
        System.out.println(al);
    }
    public static void findsubsequences(String str, String curr, int i){
        int n = str.length();
        if(i == n){
            System.out.println(curr);
            al.add(curr);
            return;
        }else{
            findsubsequences(str, curr, i+1);
            findsubsequences(str, curr+str.charAt(i), i+1);
        }
    }
}
