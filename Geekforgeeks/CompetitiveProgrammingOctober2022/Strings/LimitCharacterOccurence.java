/**
 * This question was asked during BT coding test.
 * write a program to limit the occurrence of the given character in a String. 
 * For Example : Input String is aaabbbccaa and limit is 2 then output should be aabbccaa. 
 * Another Example : Input String is aaacccbaba and limit is 1 then output should be acbaba. 
 * For this you can choose any language or IDE of your choice. Total time for this round is 45 mins. 30 mins for coding and 15 mins discussion about what you coded
 */
package Strings;

import java.util.ArrayList;

public class LimitCharacterOccurence {
    static ArrayList<Character> limitOcc(String str, int n, int limit){
        ArrayList<Character> list = new ArrayList<>();

        for(int i = 0; i < n; i++){
            int count = 1;
            int t = 0;
            for(int j = i+1; j < n; j++){
                if(str.charAt(i) != str.charAt(j)){
                    break;
                }else{
                    count++;
                }
            }
            System.out.print(count);
            t = count;
            if(count > limit){
                count = limit;
            }
            for(int k = 0; k < count; k++){
                list.add(str.charAt(i));
            }
            i+=t-1;
        }

        return list;
    }
    public static void main(String args[]) 
    { 
        String str = "aaacccbaba"; 
	    int n = str.length();  
        int limit = 1;
        System.out.print(limitOcc(str, n, limit)); 
    }
}
