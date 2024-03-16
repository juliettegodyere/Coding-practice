package Strings.methods;

public class CompareTo {
    public static void main(String args[]) {

        String str1 = "Simplilearn";
        String str2 = "Simplilearn";

        if(str1.compareTo(str2) == 0 ){
            System.out.println("Both Strings are equal");
        }else{
            System.out.println("Both Strings are not equal");
        }

        String str3 = "Simplilearn";
        String str4 = "simplilearn";

        if(str3.compareToIgnoreCase(str4) == 0 ){
            System.out.println("Both Strings are equal");
        }else{
            System.out.println("Both Strings are not equal");
        }
        
        
    }
}
