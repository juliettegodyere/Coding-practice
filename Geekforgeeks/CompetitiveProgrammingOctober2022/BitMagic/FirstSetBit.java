package BitMagic;

public class FirstSetBit {
    public static int getFirstSetBit(int n) 
	{ 
		for(int i = 0; i <= n; i++){
            if ((n & (1 << (i))) > 0) {
                System.out.println("SET"); 
                System.out.println(i); 
                return i;
            }
        }
        return 0;
	} 

	// driver code 
	public static void main(String[] args) 
	{ 
		getFirstSetBit(3); 
	}
}


	