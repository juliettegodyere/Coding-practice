package Recursion;

public class GuessOP1 {
    public static void func1(){
        System.out.println("Catch");
        func1();
    }
    public static void main(String[] args) 
	{ 
        func1();
	}
}
//Catch
//Catch
//This is a non taminating function. It will keep calling itself