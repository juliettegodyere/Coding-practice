package Strings.methods;

public class Contains {
    public static void main(String[] args){
        String str = "Hello, world!";

        // Check if the string contains a specific substring
        if (str.contains("world")) {
            System.out.println("The string contains 'world'.");
        } else {
            System.out.println("The string does not contain 'world'.");
        }
    }
}
