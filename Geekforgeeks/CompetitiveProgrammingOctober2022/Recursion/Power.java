package Recursion;

public class Power {
    public static int powerOf(int n, int k){
        if(k == 0){
            return 1;
        }
        return n*powerOf(n, k-1);
    }
    public static void main(String[] args) 
	{   
        int n = 9;
        System.out.println(powerOf(n, 9));
	}
}
