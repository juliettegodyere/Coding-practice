package Strings.StringMethods;

public class CharAt {
    public static char charAt(int index, String st){
        char ch[] = st.toCharArray();
        return ch[index];
    }
    public static void main(String args[]) {

        String name = "Simplilearn";
        
        char ch = charAt(5, name);
        
        System.out.println(ch);
        
    }
}
