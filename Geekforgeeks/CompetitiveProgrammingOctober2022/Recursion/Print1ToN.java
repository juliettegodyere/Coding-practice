package Recursion;

public class Print1ToN {
    public static int func1(int n){
        if(n == 0){
            return 0;
        }else{
            func1(n-1);
            System.out.println(n);
        }
        return 0;
        
    }
    public static void main(String[] args) 
	{ 
        func1(5);
	}
}
