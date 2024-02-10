package Recursion;

public class PrintNTo1 {
    public static int func1(int n){
        if(n == 0){
            return 0;
        }else{
            System.out.println(n);
            func1(n-1);
        }
        return 0;
        
    }
    public static void main(String[] args) 
	{ 
        func1(5);
	}
}
//5,4,3,2,1