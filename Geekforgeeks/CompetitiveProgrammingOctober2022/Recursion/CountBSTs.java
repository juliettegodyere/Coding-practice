package Recursion;

public class CountBSTs {
    static int countBSTs(int n){
        int res = 0;
        if(n == 0 || n == 1){
            return 1;
        }
        for(int i = 1; i < n; i++){
            res += countBSTs(i-1)*countBSTs(n-i);
        }
        return res;
    }
    public static void main (String[] args) {
		
		int n = 4;
    
        System.out.println(countBSTs(n));
		

	}

}
