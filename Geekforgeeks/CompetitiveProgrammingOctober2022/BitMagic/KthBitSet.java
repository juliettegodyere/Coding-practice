package BitMagic;

class KthBitSet {
    public static void isSet(int n, int k) { 
		if ((n & (1 << (k-1))) != 0) {
			System.out.println("SET"); 
        }else{
			System.out.println("NOT SET"); 
        }
	}
	public static void isSet2(int n, int k) { 
		if (((n >> (k-1)) & 1) == 1) {
			System.out.println("SET"); 
        }else{
			System.out.println("NOT SET"); 
        }
	} 
	// driver code 
	public static void main(String[] args) 
	{ 
		isSet(39, 5); 
		isSet2(39, 5); 
	}
}
