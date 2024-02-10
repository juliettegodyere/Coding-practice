package Strings;

public class ReverseCharacters {

    static String reverse(String str, int n) {
        int l = 0, h = n - 1;

        char[] arr = str.toCharArray();

        while (l < h) {
            char temp = arr[l];
            arr[l] = arr[h];
            arr[h] = temp;
            l++;
            h--;
        }
        return new String(arr);
    }

    static String reverseEachWord(String str, int n){
        String s = "";
        String originalString = "";
        char apha = ' ';
        for(int i = 0; i < n; i++){
            if(str.charAt(i) == ' '){
                originalString = originalString + reverse(s,s.length())+apha;
                s = "";
                apha = ' ';
            }else{
                System.out.println(Character.isAlphabetic(str.charAt(i)));
                if(Character.isAlphabetic(str.charAt(i))){
                     s = s + str.charAt(i);
                }else{
                    apha = str.charAt(i);
                }
            }
        }
        originalString = originalString + reverse(s,s.length())+apha;
        return originalString;
    }

    public static void main(String[] args) {
        String originalString = "I am, Robot!";
        int length = originalString.length();

        String reversedString = reverseEachWord(originalString, length);
        System.out.println("Original String: " + originalString);
        System.out.println("Reversed String: " + reversedString);
    }
}
