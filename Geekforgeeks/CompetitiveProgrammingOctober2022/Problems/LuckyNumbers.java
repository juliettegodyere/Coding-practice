/**
 * https://www.youtube.com/watch?v=zikfR0fmx5Q
 * https://www.geeksforgeeks.org/lucky-numbers/
 */
package Problems;

public class LuckyNumbers {
    //This code works
    public static boolean isLucky(int n)
    {
        for(int i = 2; i <= n; i++){
            if(n % i == 0){
                return false;
            }
            n -= n/i;
        }
        
        return true;
    }
    //This code does not pass for all cases
    static int counter = 2;
    public static boolean isLucky2(int n)
    {
        if(counter > n){
            return true;
        }
        if(n % counter == 0){
            return false;
        }
        n -= n/counter;
        counter++;
        
        return isLucky(n);
    }
    public static void main(String[] args) 
	{   
        System.out.println(isLucky(5));
	}
}
