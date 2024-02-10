package Matrix;

public class RotateMetrix90Right {
    static int n = 4;
    static void rotate90(int mat[][])
	{

		for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }

        for(int i = 0; i < n; i++){
            int low = 0, high = n-1;
            while(low < high){
                int temp = mat[i][low];
                mat[i][low] = mat[i][high];
                mat[i][high] = temp;
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
                        *Output
						* 13, 9, 5, 1
						* 14, 10, 6, 2
						* 15, 11, 7, 3
						* 16, 12, 8, 4

						temp = 0 0 => 3 0
						*      0 1 => 2 0
						*      0 2 => 1 0
						* 	   0 3 => 0 0
						*      1 0 => 3 1
						*      1 1 => 3 2
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
