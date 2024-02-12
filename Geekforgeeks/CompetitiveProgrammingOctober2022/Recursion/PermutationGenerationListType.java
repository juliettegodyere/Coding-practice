package Recursion;

import java.util.ArrayList;
import java.util.List;

public class PermutationGenerationListType {
    public static List<String> find_permutation(String str) {
        List<String> result = new ArrayList<>();
        permute(str.toCharArray(), 0, result);
        result.sort(null);
        return result;
    }

    static void permute(char[] strArray, int currentIndex, List<String> result) {
        if (currentIndex == strArray.length - 1) {
            //result.add(new String(strArray));
            if(!result.contains(new String(strArray))){
                result.add(new String(strArray));
             }
            return;
        }

        for (int i = currentIndex; i < strArray.length; i++) {
            swap(strArray, currentIndex, i);
            permute(strArray, currentIndex + 1, result);
            swap(strArray, currentIndex, i); // Backtrack to restore the original string
        }
    }

    static void swap(char[] strArray, int i, int j) {
        char temp = strArray[i];
        strArray[i] = strArray[j];
        strArray[j] = temp;
    }

    public static void main(String[] args) {
        String str = "ABB";
        List<String> permutations = find_permutation(str);
        System.out.println("Permutations: " + permutations);
    }
}
