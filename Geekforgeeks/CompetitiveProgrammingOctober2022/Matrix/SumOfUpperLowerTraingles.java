package Matrix;

import java.util.ArrayList;

public class SumOfUpperLowerTraingles {
    static ArrayList<Integer> upperLowerTraingle(int mat[][])
	{
        int n = mat.length;
        int upperSum = 0;
        int lowerSum = 0;
        ArrayList<Integer> res = new ArrayList<>();
		for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                System.out.print(mat[i][j] + " ");
                System.out.println();
                System.out.print(mat[j][i] + " ");
                upperSum+=mat[i][j];
                lowerSum+=mat[j][i];
            }
        }
		res.add(upperSum);
        res.add(lowerSum);	

        return res;
	}
    public static void main(String args[]) 
    {
        int N = 3 ;
        int mat[][] = {{1, 2},
        {3, 4}};
                   System.out.println(upperLowerTraingle(mat).toString());
    } 
}
