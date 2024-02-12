package Strings;

public class FirstRepeatedCharacter {
    String firstRepChar(String s) 
    { 
        // code here
        int count[] = new int[256];
        int n = s.length();
        
        // for(int i = 0; i < n;i++){
        //     count[s.charAt(i)]++;
        // }
        
        for(int i = 0; i < n;i++){
            if(count[s.charAt(i)]++ > 1){
                return ""+s.charAt(i);
            }else{
                count[s.charAt(i)]++;
            }
        }
        return "-1";
    }
}
