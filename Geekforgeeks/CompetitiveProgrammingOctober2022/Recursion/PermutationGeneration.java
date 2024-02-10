/**
 * https://www.youtube.com/watch?v=TnZHaH9i6-0
 * https://www.techiedelight.com/generate-permutations-string-java-recursive-iterative/
 * If you are given an array and the length is n. You will print n! Strings. If it's an empty array,
 * you dont need to print anything
 */

package Recursion;

public class PermutationGeneration {
    
   static String swap(String str, int i, int j){
        char ch[] = str.toCharArray();
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;

        return String.valueOf(ch);
    }

    public static void permute(String str, int left, int right){
        if(left == right){
            System.out.println(str);
            System.out.println(" am returning");
            return;
        }
       for(int i = left; i <= right; i++){
            String swapped = swap(str, left, i);
            System.out.println("Left " + left);
            System.out.println("i " + i);
            System.out.println("Right " + right);
            System.out.println("Swapped " + swapped);
            permute(swapped, left+1, right);
            System.out.println("Left After Recursion " + left);
            System.out.println("Right Recursion " + right);
            swapped = swap(str, left, i);
            System.out.println("Swapped After Recursion " + swapped);
       }
    }

    public static void main(String[] args)
    {
        String str = "ABC";

        permute(str, 0, str.length()-1);
    }
}
