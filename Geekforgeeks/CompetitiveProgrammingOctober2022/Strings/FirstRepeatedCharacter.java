package Strings;

public class FirstRepeatedCharacter {
    static String  firstRepChar(String s, int n) 
    { 
        // code here
        int count[] = new int[256];
        
        for(int i = 0; i < n;i++){
            count[s.charAt(i)]++;
        }
        
        for(int i = 0; i < n;i++){
            if(count[s.charAt(i)] > 1){
                return ""+s.charAt(i);
            }
        }
        return "-1";
    }
    public static void main(String[] args) {
        String str = "abcdeedf";

        System.out.println(firstRepChar(str, str.length()));

    }
}
