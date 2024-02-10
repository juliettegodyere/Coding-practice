package Matrix;
//https://ide.geeksforgeeks.org/0FIDTEfXmO
/**Matrix boundary traversal refers to the process of accessing and printing the elements present on the outermost edges 
 * of a two-dimensional array or matrix. By iterating through the boundary elements in a specific order, we can extract 
 * and display the values along the perimeter of the matrix. This technique is often employed in various programming 
 * scenarios, such as image processing, matrix manipulation, and algorithmic problem-solving, where analyzing or 
 * displaying only the boundary elements is required.**/
public class BoundaryTransversal {
    static int R = 4, C = 4;
    static void bTraversal(int mat[][])
	{
		if(R == 1)
		{
			for(int i = 0; i < C; i++)
				System.out.print(mat[0][i] + " ");
		}
		else if(C == 1)
		{
			for(int i = 0; i < R; i++)
				System.out.print(mat[i][0] + " ");
		}
		else
		{
			for(int i = 0; i < C; i++)
				System.out.print(mat[0][i] + " ");
			for(int i = 1; i < R; i++)
				System.out.print(mat[i][C - 1] + " ");
			for(int i = C - 2; i >= 0; i--)
				System.out.print(mat[R - 1][i] + " ");
			for(int i = R - 2; i >= 1; i--)
				System.out.print(mat[i][0] + " ");
		}

	}

	public static void main(String args[]) 
    {
        int arr[][] = {{1, 2, 3, 4},
    				   {5, 6, 7, 8},
    				   {9, 10, 11, 12},
    				   {13, 14, 15, 16}};
					   //Expected Output: 1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5

    	bTraversal(arr);
    } 
}
