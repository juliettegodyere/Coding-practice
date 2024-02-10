package Strings;

public class RotateByKValue {
    //Rotate a string by a given position to the left (anticlockwise)
    static String strRotate(String str, int d){
        char[]charArr = str.toCharArray();
        int n = charArr.length;
        char first = charArr[0];
        for(int i = 1; i <= d; i++){
            for(int j = 0; j < n-1; j++){
                charArr[j] = charArr[j+1];
            }
            charArr[n-1] = first;
        }
        return new String(charArr);
    }
    static String rotate(String str, int n, int d){
        char c[] = str.toCharArray();
        reverse(c, 0, d-1);
        reverse(c, d, n-1);
        reverse(c, 0, n-1);

        return new String(c);
    }
    static void reverse(char c[], int l, int h){
        while(l < h){
            char temp = c[l];
            c[l] = c[h];
            c[h] = temp;
            l++;
            h--;
        }
    }
    
    public static void main(String[] args) 
    {   
        String str = "arun";
        int n = str.length();
        int d = 2;
        //System.out.println(strRotate(str1, 3));
        System.out.println(rotate(str, n, d));
    }
}
