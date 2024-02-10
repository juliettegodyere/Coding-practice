package Recursion;

public class ReverseString {
    public static void reverse(String s, int n){
        if(n == 0){
            return;
        }
        System.out.print(s.charAt(n-1));
        reverse(s, n-1);
    }
    public static void main(String[] args) 
    {   
        String s = "Techie Delight";
        int n=s.length();
        reverse(s, n);
        //thgileD eihceT
    }
}
