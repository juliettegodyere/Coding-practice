package Recursion;

public class PracticeOutput2 {
    public static void func1(int n){
        if(n == 0){
            return;
        }
        func1(n-1);
        System.out.println(n);
        func1(n-1);
    }
    public static void main(String[] args) 
	{ 
        func1(3);
	}
}
//Output
//1
//2
//1
//3
//1
//2
//1