package Recursion;

public class PracticeOutput {
    public static void func1(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        func1(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) 
	{ 
        func1(3);
	}
}
//Output
//3
//2
//1
//1
//2
//3