package BitMagic;

public class OldAppearingNumber {
    /**
     * For the efficient method, we are using the XOR property.
     * x ^ 0 = x
     * x ^ y = y ^ x
     * x ^ (y^z) = (x ^ y) ^ z
     * x ^ x = 0;
     * This means that even appearing numbers will cancel themselves.
     */
    static int oldElements2(int arr[], int n){
        int res = 0;
        for(int i = 0; i < n; i++){
            res = res ^ arr[i];
        }
        return res;
    }
    /**
     * The naive appraoach
     * arr = [4, 3, 4, 4, 4, 5, 5, 3, 3]
     * i = 0, j = 0, count = 1
     * 4 == 3 no
     * j = 1 
     * 4 == 4 yes
     * count = 2
     * j = 2
     * 4 = 4 yes
     * count = 3
     * j = 3
     * 4 == 4 yes
     * count = 4
     * 4 = 5 no
     * 4 = 5 no
     * 4 = 3 no
     * 4 = 3 no
     * i = 1, j = 2
     * 
     */
    static int oldElements(int arr[], int n){
        for(int i = 0; i < n; i++){
            int count = 0;
            for(int j = 0; j < n; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if(count % 2 == 1){
                //System.out.println("Value " + i + "is old");
                return arr[i];
            }
        }
        return 0;
    }
    
	public static void main (String[] args) {
	    
	    int arr[]= {4, 3, 4, 4, 4, 5, 5, 3, 3}, n = 9;
	    
		System.out.println(oldElements2(arr, n));
	}
}
