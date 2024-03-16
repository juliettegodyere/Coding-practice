package Strings.methods;

public class Subsequence {
    public static void main(String args[]) {

        String str = "Hello, world!";

        // Get a subsequence from index 7 to index 12 (excluding 12)
        String subSeq = (String) str.subSequence(7, 12);
        if(subSeq.equals("dlorw")){
            System.out.println("Yes");
        }else{
            System.out.println("No: ");
        }        
        
    }
}
