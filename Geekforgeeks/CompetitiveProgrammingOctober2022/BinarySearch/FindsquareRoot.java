
/**
 * Note that any number which is greater than 4 and smaller than
 * 9 will have square root has 2. Any number which is greater equal
 * to 9 or greater and smaller than 16 will 3 has their square root.
 */
package BinarySearch;

public class FindsquareRoot {
    /**
     * i = 1
     * res = 1;
     * i = 2
     * res = 2
     * i = 3
     * res = 3
     * i = 4
     * res = 4
     */
    public static int findRoot(int n){
        int res = 0;
        for(int i = 1; i*i <= n; i++){
            res = i;
        }
        return res;
    }
    /**
     * x = 10
     * low = 0, high =10
     * 1st Iteration
     * mid = 5
     * msq = 25
     * high = 4
     * 2nd Iteration
     * mid = 2
     * msq = 4
     * low = 3
     * ans = 2
     * 3rd Iteration
     * mid = 3
     * msq = 9
     * low = 4
     * ans 3
     * 4th Iteration
     * mid = 4
     * msq = 16
     * high = 3
     */
    static int sqRootFloor(int x)
	{
		int low = 1, high = x, ans = -1;

		while(low <= high)
		{
			int mid = (low + high) / 2;

			int mSq = mid * mid;

			if(mSq == x)
				return mid;
			else if(mSq > x)
				high = mid - 1;
			else{
				low = mid + 1;
				ans = mid;
			}
		}
        return ans;
    }
    public static void main (String[] args) 
	{
        int n = 8;
        System.out.println(findRoot(n));
	}
}
