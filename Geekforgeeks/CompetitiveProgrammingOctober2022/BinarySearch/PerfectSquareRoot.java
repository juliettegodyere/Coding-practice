package BinarySearch;

/**
 * Any number which is greater than 4 and smaller than 9 will have a perfect sqare root of 2. 
 * Any number which is greater than 9 and smaller than 16 will have a root root of 3 because we are 
 * looking for the floor of the square
 */

public class PerfectSquareRoot {
    public static int square(int x){
        int i = 1;

        while(i*i <= x){
            i++;
        }
        return (i - 1);
    }

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
			else
			{
				low = mid + 1;
				ans = mid;
			}
		}

		return ans;
	}

    public static void main (String[] args) 
	{

        System.out.println(square(9));
	    
	}
}
