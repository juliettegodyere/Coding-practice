package BitMagic;

public class PowerofTen {
    static boolean isPow10(int n)
    {
        if(n == 0)
            return true;
        
        while(n != 1)
        {
            if(n % 10 != 0)
                return false;
            
            n = n / 10;
        }
        
        return true;
    }

    public static void main (String[] args) {
	    
	    int n = 1000;
		System.out.println(isPow10(n));
	}
}
