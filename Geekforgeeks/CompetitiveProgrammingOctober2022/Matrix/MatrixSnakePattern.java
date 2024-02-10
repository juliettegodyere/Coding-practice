package Matrix;

/**
 * We are given a matrix, the idea is to print the matrix in snake pattern.
 */

public class MatrixSnakePattern {
    static void printArray(int[][] arr, int n){
        int R = 4; int C = 4;
        for(int i = 0; i < R; i++){
           if(i % 2 == 0){
                for(int j = 0; j < C; j++){
                    System.out.print(arr[i][j] + " ");
                }
            }else{
                for(int j = C-1; j >= 0; j--){
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
    }
    public static void main (String[] args) {
   
        int[][] arr={
            {1, 2, 3, 4},
            {8, 7, 6, 5},
            {9, 10, 11, 12},
            {13, 14, 15, 16}};
            //Expected Output: 1, 2, 3, 4, 8, 7, 6, 5, 9, 10, 11, 12, 16, 15, 14, 13
        int n = arr.length;
       printArray(arr,n);
      
    }
}
