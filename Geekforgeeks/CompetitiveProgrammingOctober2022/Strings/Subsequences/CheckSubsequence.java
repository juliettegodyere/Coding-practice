package Strings.Subsequences;

public class CheckSubsequence {
    static boolean isSubquence(String str1, String str2, int n, int m){
        int j = 0;
        if(n < m){
            return false;
        }
        for(int i = 0; i < n && j < m; i++){
            if(str1.charAt(i) == str2.charAt(j)){
                j++;
            }
        }
        
        return j == m;
    }
    //Recursive solution
    static boolean isSubquence2(String str1, String str2, int n, int m){
        
        if(m == 0){
            return true;
        }
        if(n == 0){
            return false;
        }
        if(str1.charAt(n-1) == str2.charAt(m-1)){
            return isSubquence2(str1, str2, n-1, m-1);
        }else{
            return isSubquence2(str1, str2, n-1, m);
        }
    }

    public static void main(String[] args) 
    {   
        String str1 = "GEEKSFORGEEKS";
        String str2 = "GEEK";
        int n = str1.length();
        int m = str2.length();
        System.out.println(isSubquence(str1, str2, n, m));
        System.out.println(isSubquence2(str1, str2, n, m));
    }
    
}
