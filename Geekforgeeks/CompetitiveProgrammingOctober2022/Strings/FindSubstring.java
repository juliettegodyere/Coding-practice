package Strings;

public class FindSubstring {
    /**String s1 = "geeksforgeeks";
     * String s2 = "for"
     * i = 0, j =0
     * 
     * 
     */
    static int strstr(String x, String s)
    {
       // Your code here
       int res = -1;
       int n = s.length();
       int m = x.length();
       for(int i = 0; i <= n-m; i++){
            int j;
            for(j = 0; j<m; j++){
                if(x.charAt(j) != s.charAt(i + j)){
                    break;
                }
            }
            if(j == m){
                //System.out.print(i + " ");
                res = i;
            }
        }
        return res;
    }
    /*
     * Another Efficient Solution: 

An efficient solution would need only one traversal i.e. O(n) on the longer string s1. 
Here we will start traversing the string s1 and maintain a pointer for string s2 from 0th index.
For each iteration, we compare the current character in s1 and check it with the pointer at s2.
If they match we increment the pointer on s2 by 1. And for every mismatch, we set the pointer back to 0.
Also keep a check when the s2 pointer value is equal to the length of string s2, if true we break and return the value (pointer of string s1 - pointer of string s2)
Works with strings containing duplicate characters.

     */
    //Efficient Method
    public static int Substr(String s2, String s1){
        int counter = 0; //pointing s2
        int i = 0;
        for(;i<s1.length();i++){
            if(counter==s2.length())
                break;
            if(s2.charAt(counter)==s1.charAt(i)){
                counter++;
            }else{
                //Special case where character preceding the i'th character is duplicate
                if(counter>0){
                    i -= counter;
                }
                counter = 0;
            }
        }
        return counter < s2.length()?-1:i-counter;
    }
    public static void main (String[] args) {
        String s1 = "geeksforgeeks";
        String s2 = "for";
        //System.out.println(s2.indexOf("for"));
        System.out.println(Substr(s2, s1));
        System.out.println(strstr(s2,s1));

    }

}
