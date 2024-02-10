package BitMagic;

public class CountTotalSetBits {
    /**
     * Simple solution
     */
    public static int setBits(int x){
        int cnt = 0;
        while(x > 0){
            if((x&1)==1) {//x%2=1
                cnt++;
            }
            x = x / 2; //x = x>>1
        }
        return cnt;
    }
    /**
     * Method 2 (Brian and Kerningham Algorithm)
     * Time: 0(Set bit count). The code will run based on the number of set bit.
     * 1st
     * n    = 40 - 101000
     * n-1  = 39 - 100111
     * n    = 32 = 100000
     * 
     * 2nd 
     * n    = 32 = 100000
     * n-1  = 31 - 011111
     * n    = 0  - 000000
     * 
     * How does this work? 
     * When you substract 1 from a number, all the bits which are 0 after
     * the last set bits becomes 1 and your last set bit becomes 0 from 1.
     * i.e the leftmost bit set when counting from the right.
     */
    static int SetBits2(int n) { 
		int count = 0; 
		while (n > 0) { 
			n  = (n & (n - 1)); 
			count++; 
		} 
		return count; 
	}  
    /**
     * The look up table method. Time is 0(1). However,
     * it requires some preprocessing. The idea is - 
     * We divide our input 32 bit number into 8 bit chunks.
     * There are 4 chunks, 8 bits means that you have 0 - 255.
     * i.e 0 - 2^7-1.
     *  */ 
    public static void main(String[] args) 
	{ 
        System.out.println(setBits(5));
	}
}
