package Strings.StringProgrammingInterviewQuestions;

import java.util.Arrays;

public class MinOccuringCharacter {
    static final int ASCII_SIZE = 256;

    public static char getMaxOccuringChar(String line)
    {
        // Your code here
        int [] count = new int[ASCII_SIZE];
        char [] arr = line.toCharArray();
        //Arrays.sort(arr);
        String S = new String(arr);
        System.out.println(S);
        int n = S.length();

        for(int i = 0; i < n; i++){
            count[S.charAt(i)]++;
        }
        int min = Integer.MAX_VALUE;
        char res = ' ';
        for(int i = 0; i < n; i++){
            //System.out.println(count[S.charAt(i)]);
            if(count[S.charAt(i)] < min){
                min =  count[S.charAt(i)];
                res = S.charAt(i);
                //System.out.println(count[S.charAt(i)]+ "nnnddbb");
            }
        }
        return res;
    }
    
    public static void main(String[] args) 
    {   
        String str = "output";
        System.out.println(getMaxOccuringChar(str));
    }
}
