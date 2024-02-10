package Recursion;

public class PracticeOutput3 {
    public static int func1(int n){
        if(n == 0){
            return 0;
        }else{
            return 1 + func1(n/2);
        }
        
    }
    public static void main(String[] args) 
	{ 
        func1(16);
	}
}
//Output
//4