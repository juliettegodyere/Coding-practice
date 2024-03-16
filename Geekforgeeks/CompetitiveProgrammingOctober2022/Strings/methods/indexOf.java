package Strings.methods;

public class indexOf {
    public static void main(String[] args){
        String str = "Hello, world!";

        // Find the index of the first occurrence of a substring
        int index = str.indexOf("world");

        if (index != -1) {
            System.out.println("The substring 'world' starts at index " + index + ".");
        } else {
            System.out.println("The substring 'world' is not found in the string.");
        }
    }
}
