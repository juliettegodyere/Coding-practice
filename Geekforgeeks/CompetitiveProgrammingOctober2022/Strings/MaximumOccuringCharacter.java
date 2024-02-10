package Strings;

public class MaximumOccuringCharacter {
    static final int ASCII_SIZE = 256;

    public static char getMaxOccuringChar(String line) {
        final int ASCII_SIZE = 256;
    
        int[] count = new int[ASCII_SIZE];
    
        int n = line.length();
        for (int i = 0; i < n; i++) {
            count[line.charAt(i)]++;
        }
    
        int max = -1;
        char res = ' ';
        for (int i = 0; i < n; i++) {
            if (max < count[line.charAt(i)]) {
                max = count[line.charAt(i)];
                res = line.charAt(i);
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
