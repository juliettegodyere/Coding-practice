package Matrix;

public class SpiralMatrix {
    static void printSpiral(int mat[][], int R, int C)
	{
		int top = 0, left = 0, bottom = R - 1, right = C - 1;

		while(top <= bottom && left <= right)
		{
			for(int i = left; i <= right; i++)
				System.out.print(mat[top][i] + " ");

			top++;

			for(int i = top; i <= bottom; i++)
				System.out.print(mat[i][right] + " ");
			
			right--;

			if(top <= bottom){
			for(int i = right; i >= left; i--)
				System.out.print(mat[bottom][i] + " ");

			bottom--;
			}

			if(left <= right){
			for(int i = bottom; i >= top; i--)
				System.out.print(mat[i][left] + " ");

			left++;
			}			
		}
	}

	public static void main(String args[]) 
    {
        int arr[][] = {{1, 2, 3, 4},
    				   {5, 6, 7, 8},
    				   {9, 10, 11, 12},
    				   {13, 14, 15, 16}};
					   /***
						* Expected Output
						* 1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5, 6, 7, 11, 10
					    */

    	printSpiral(arr, 4, 4);

		
    } 
}
