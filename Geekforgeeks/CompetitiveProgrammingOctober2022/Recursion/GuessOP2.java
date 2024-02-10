package Recursion;

public class GuessOP2 {
    public static void func1(int n){
        if(n == 0){
            return;
        }
        System.out.println("Catch");
        func1(n-1);
    }
    public static void main(String[] args) 
	{ 
        func1(2);
	}
}
//Same as GuessOP1 only that there is a termination statement