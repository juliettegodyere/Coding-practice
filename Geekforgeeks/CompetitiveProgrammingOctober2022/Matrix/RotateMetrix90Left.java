package Matrix;
//90 degree anticlockwise
public class RotateMetrix90Left {
    static int n = 4;

	static void rotate90(int mat[][])
	{
		int temp[][] = new int[n][n];

		for(int i = 0; i < n; i++)
			for(int j = 0; j < n; j++)
				temp[n - j - 1][i] = mat[i][j];

		for(int i = 0; i < n; i++)
			for(int j = 0; j < n; j++)
				mat[i][j] = temp[i][j];

	}
    static void swap(int mat[][], int i, int j)
	{
			int temp = mat[i][j];
			mat[i][j] = mat[j][i];
			mat[j][i] = temp;
	}
	
	static void swap2(int low, int high, int i, int mat[][])
	{
	    	int temp = mat[low][i];
			mat[low][i] = mat[high][i];
			mat[high][i] = temp;
	}

	static void rotate902(int mat[][])
	{

		for(int i = 0; i < n; i++)
			for(int j = i + 1; j < n; j++)
				swap(mat, i, j);
				
		for(int i = 0; i < n; i++)
		{
		    int low = 0, high = n - 1;
		    
		    while(low < high)
		    {
		        swap2(low, high, i, mat);
		        
		        low++;
		        high--;
		    }
		}
	}

	public static void main(String args[]) 
    {
        int arr[][] = {{1, 2, 3, 4},
    				   {5, 6, 7, 8},
    				   {9, 10, 11, 12},
    				   {13, 14, 15, 16}};
					   /**Expected Output:
						* Transpose
                        * 1 5 9 13
                        * 2 6 10 14
                        * 3 7 11 15
                        * 4 8 12 16
						* Output
						* 4, 8, 12, 16
						* 3, 7, 11, 15
						* 2, 6, 10, 14
						* 1, 5, 9, 13

						temp = 3 0 => 0 0
						*      2 0 => 0 1
						*      1 0 => 0 2
						* 	   0 0 => 0 3
						*      3 1 => 1 0
						*      2 1 => 1 1
						*      1 1 => 1 2
						*      0 1 => 1 3
						* **/

						

    	rotate90(arr);

		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < n; j++)
			{
				System.out.print(arr[i][j]+" ");
			}

			System.out.println();
		}	
    } 
}
