package Strings;

import java.util.Arrays;

public class CaseSpecificSortingStrings {
    public static String caseSort(String str)
    {
        // Your code here
        // int count[] = new int[256];
        // String s = "";
        // for(int i = 0; i < str.length(); i++){
        //     count[str.charAt(i)] = 1;
        // }
        // for(int i = 0; i < count.length; i++){
        //     if(count[i] == 1){
        //         s+=str.charAt(i);
        //     }
        // }
        char arr[] = str.toCharArray();
        Arrays.sort(arr);
        return Arrays.toString(arr);
    }

    public static String caseSort2(String str) {
        // Separate uppercase and lowercase characters
        StringBuilder lowerChars = new StringBuilder();
        StringBuilder upperChars = new StringBuilder();
    
        for (char c : str.toCharArray()) {
            if (Character.isLowerCase(c)) {
                lowerChars.append(c);
            } else {
                upperChars.append(c);
            }
        }
    
        // Sort the separated strings
        char[] lowerArray = lowerChars.toString().toCharArray();
        char[] upperArray = upperChars.toString().toCharArray();
        Arrays.sort(lowerArray);
        Arrays.sort(upperArray);
    
        // Merge the sorted strings back into the original order
        int lowerIndex = 0, upperIndex = 0;
        StringBuilder result = new StringBuilder();
    
        for (char c : str.toCharArray()) {
            if (Character.isLowerCase(c)) {
                result.append(lowerArray[lowerIndex++]);
            } else {
                result.append(upperArray[upperIndex++]);
            }
        }
    
        return result.toString();
    }
    public static void main (String[] args) {
        String s = "srbDKi";
        System.out.println(caseSort2(s));

    }
}
