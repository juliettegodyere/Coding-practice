/**
 * Pring all permutations that does not contain AB as a substring
 * https://www.geeksforgeeks.org/generate-all-permutations-of-a-string-that-follow-given-constraints/
 */
package Recursion;

public class PermutationsOfSubstring {
    static String swap(String str, int i, int j){
        char ch[] = str.toCharArray();
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;

        return String.valueOf(ch);
    }

    public static void permute(String str, int left, int right){
        if(left == right){
            //System.out.println(str);
            if(!str.contains("AB")){
                System.out.print(str + " ");
            }
            return;
        }
        for(int i = left; i <= right; i++){
            String swapped = swap(str, left, i);
            permute(swapped, left+1, right);
        }
    }

    public static void main(String[] args)
    {
        String str = "ABC";
        //ABC ACB BAC BCA CAB CBA

        permute(str, 0, str.length()-1);
    }
}
