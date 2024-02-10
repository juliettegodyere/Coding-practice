package BinarySearch;

import java.util.Arrays;

public class medianofTwoArrays {
    /**Naive approach
     * 1. Create a temp array of n1+n2
     * 2. Copy elemnts of A1 and A2 to temp array
     * 3. Sort the temp array
     * 4. If n1+n2 then return middle of the element
     * 5. else return average of middle two elemnts
     */
    public static float getMed(int A1[], int A2[], int n1, int n2){
        int temp[] = new int[n1+n2];
        int i = 0;
        int mid = 0; 
        float res = 0;
        for(i = 0; i < n1; i++){
            temp[i] = A1[i];
        }
        for(int j = 0; j < n2; j++){
            temp[i+j] = A2[j];
        }
        Arrays.sort(temp);
      // System.out.println(Arrays.toString(temp));
        mid = (n1+n2)/2;

        if((n1+n2)%2 == 0){
            int l = mid - 1;
            res = (temp[mid] + temp[l]) /2;
           System.out.println(res);
           // System.out.println(temp[l]);
        }else{
            res = temp[mid];
            System.out.println(res);
        }
        return res;
    }
    /**
     * a1=[10,20,30,40,50]
     * a2=[5,15,25,27,28,55,65,75,85]
     * Efficient appraoch is to us binary search.
     * In this implementation, we are going to assume that a1 is always having size
     * smaller than a2. i.e n1<=n2. if user provides first array of greater size, then 
     * you cal always swap the reference and ensure that a1 id smaller. The time complexity 
     * of the solution is 0(logn1). We will begin our binary search from the middle of the 
     * smaller size array. During the binary search, we maintain two sets. The first set
     * contains some elements from left side of a1 and some elements fro left side of a2.
     * The second set contains some elements from right side of a1 and some elements fro.
     * right side of a2. During the binary search, we ensure that in every iteration, the left
     * set contains exactly half of the elements and the right side contains exactly half of
     * the elements. If they are odd elements, then we can have one extra element in the left
     * half.
     * How do we find out index in the other array so that we can have exactly two sets of half
     * half elements. We can use this formular l2 = ((n1+n2+1)2) - i1. If you know the first index in the 
     * first array and you want to divide all 14 elements ie 5+9 elements into two half of set
     * 7 7 halves elements. Then you can find out l2 using this above element.
     * i1 is the beginning of the right set in a1 array ie the index of 2. and l2 is 
     * the beginning of the right set in the second array ie the index of 5. The formular takes 
     * care of even and odd elements.
     * How do we do our binary search? If you take a look at our array, you could notice that all
     * the elements of the right side is greater than elements on the left side. What this means that is
     * that you have found a place where your median lies.
     * set1 = [10,20,5,15,25,27,28]
     * set2 =[30,40,50,55,65,75,8]
     * 
     * 
     * @param args
     */
    static double getMed2(int a1[], int a2[], int n1, int n2)
	{
		int begin1 = 0, end1 = n1;

		while(begin1 <= end1)
		{
			int i1 = (begin1 + end1) / 2;
			int i2 = ((n1 + n2 + 1) / 2 )- i1;

			int min1 = (i1 == n1)?Integer.MAX_VALUE:a1[i1];
			int max1 = (i1 == 0)?Integer.MIN_VALUE:a1[i1 - 1];
			
			int min2 = (i2 == n2)?Integer.MAX_VALUE:a2[i2];
			int max2 = (i2 == 0)?Integer.MIN_VALUE:a2[i2 - 1];

			if(max1 <= min2 && max2 <= min1)
			{
				if((n1 + n2) % 2 == 0)
					return ((double)Math.max(max1, max2) + Math.min(min1, min2)) / 2;
				else
					return (double) Math.max(max1, max2);
			}
			else if(max1 > min2)
				end1 = i1 - 1;
			else 
				begin1 = i1 + 1;
		}
		
		return -1;
	}
    public static void main(String args[]) 
    {

		int a1[] = {10, 20, 30, 40, 50}, n1 = a1.length, a2[] = {5, 15, 25, 35, 45, 20}, n2 = a2.length;
		getMed(a1, a2, n1, n2);
        //System.out.println(getMed(a1, a2, n1, n2));


    }
}
