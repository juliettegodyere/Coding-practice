package Recursion;

public class PracticeOutput4 {
    public static int func1(int n){
        if(n == 0){
            return 0;
        }else{
            func1(n/2);
            System.out.print(n%2);
        }
        return 0;
        
    }
    public static void main(String[] args) 
	{ 
        func1(16);
	}
}
