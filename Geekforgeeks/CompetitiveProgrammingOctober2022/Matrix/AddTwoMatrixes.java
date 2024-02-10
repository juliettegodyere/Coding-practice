package Matrix;

public class AddTwoMatrixes {
    static int[][] sumMatrix(int A[][], int B[][])
    {
       // code here
        int [][] res = new int[A.length][A[0].length];
        int [][] r = new int [1][1];
       if (A.length!=B.length || A[0].length!=B[0].length){r[0][0]=-1; return r;}
       for(int i=0;i<A.length;i++){
           for (int j=0;j<B[0].length;j++){
               res[i][j]= A[i][j]+B[i][j];
           }
       }
       return res;
    }
}
