package Strings.Practice;

import java.util.*;

public class StringContruction {
    public static void stringConstruction(String s) {
        int n = s.length();
        String p = ""+s.charAt(0);
        int count = 1;
        for(int i = 1; i < n; i++){
           System.out.println(p + " " +s.substring(0,i));
           // System.out.println(p.equals(s.substring(0,i)));
            if(p.equals(s.substring(0,i+1))){
                p+=s.substring(0,i);
                System.out.println(p);
                System.out.println(count);
                System.out.println("Inside the if");
            }else{
                p+=s.charAt(i);
                count++;
                System.out.println(p);
                System.out.println(count);
                System.out.println("Inside the else");
            }
        }
    }
    //Substring generation
    static void subString(String s){
        for(int i = 0; i < s.length(); i++){
            String cat = "";
            for(int j = i; j < s.length(); j++){
                cat +=s.charAt(j);
                System.out.println(cat);
            }
        }
    }
    public static void main(String[] args) 
        {   
            String str1 = "abab";
            int n = str1.length();
            //System.out.println(stringConstruction(str1));
            //stringConstruction(str1);
            subString(str1);
        }
    
}
