
//Generate all possible substring
package Strings.Substring;

import java.util.HashSet;

public class Substring {
    //Useed the print all substrings
    static void generateAllSub(String str, int n){
        for(int i = 0; i < n; i++){
            String res = "";
            for(int j = i; j < n; j++){
                 res = res + str.charAt(j);
                if(res.length() == 2){
                   System.out.print(res + ",");
                }
                // if(firstLastValueSame(res)){
                //     System.out.print(res + ",");
                // }
                //System.out.print(res + ",");
            }
            //System.out.println();
        }
    }
    //Used to pring unique substring
    static void generateAllUniqueSub(String str, int n) {
    for (int i = 0; i < n; i++) {
        HashSet<Character> hash = new HashSet<>();
        String res = "";
        for (int j = i; j < n; j++) {
            if (!hash.contains(str.charAt(j))) {
                res = res + str.charAt(j);
                hash.add(str.charAt(j));
                if(res.length() == 2){
                    System.out.print(res + ",");
                }
            } else {
                //hash.remove(str.charAt(i));
                break; // Break the inner loop if a repeated character is encountered
            }
        }
        System.out.println();
    }
}

    public static void main(String[] args) 
    {   
        String txt = "aaaa";
        int n = txt.length();
        generateAllSub(txt,n);
    }
}
