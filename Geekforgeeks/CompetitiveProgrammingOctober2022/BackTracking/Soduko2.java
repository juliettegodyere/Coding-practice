package BackTracking;
/**
 * https://www.youtube.com/watch?v=mcXc8Mva2bA
 */

public class Soduko2 {

    static boolean solveSudoku(int[][] board, int n){
        for(int row = 0; row < n; row++){
           for(int column = 0; column < n; column++){
                if(board[row][column] == 0){
                    for(int numberToTry = 1; numberToTry <= n; numberToTry++){
                        if(isValidPlacement(board, numberToTry, row, column, n)){
                            board[row][column] = numberToTry;

                            if(solveSudoku(board, n)){
                                return true;
                            }else{
                                board[row][column] = 0;
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    private static boolean isNumberInRow(int[][] board, int number, int row, int n){
        for(int i = 0; i < n; i++){
            if(board[row][i] == number){
                return true;
            }
        }
        return false;
    }
    private static boolean isNumberInColumn(int[][] board, int number, int column, int n){
        for(int i = 0; i < n; i++){
            if(board[i][column] == number){
                return true;
            }
        }
        return false;
    }

    private static boolean isNumberInBox(int[][] board, int number, int row, int column, int n){
        int s = (int)Math.sqrt(n);
        int localBoxRow = row - row % s;
        int localBoxColumn = column - column % s;

        for(int i = localBoxRow; i < localBoxRow + s; i++){
           for(int j = localBoxColumn; j < localBoxColumn + s; j++){
                if(board[i][j] == number){
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean isValidPlacement(int[][] board, int number, int row, int column, int n){
        return (!isNumberInRow(board, number, row, n) 
        &&!isNumberInColumn(board, number, column, n)
        &&!isNumberInBox(board, number, row, column, n));
    }
    public static void main(String args[]) 
    { 
  
        int[][] board = new int[][] { 
            { 3, 0, 6, 5, 0, 8, 4, 0, 0 }, 
            { 5, 2, 0, 0, 0, 0, 0, 0, 0 }, 
            { 0, 8, 7, 0, 0, 0, 0, 3, 1 }, 
            { 0, 0, 3, 0, 1, 0, 0, 8, 0 }, 
            { 9, 0, 0, 8, 6, 3, 0, 0, 5 }, 
            { 0, 5, 0, 0, 9, 0, 6, 0, 0 }, 
            { 1, 3, 0, 0, 0, 0, 2, 5, 0 }, 
            { 0, 0, 0, 0, 0, 0, 0, 7, 4 }, 
            { 0, 0, 5, 2, 0, 6, 3, 0, 0 } 
        }; 
        int N = board.length; 
  
        if (solveSudoku(board, N))  
        {  
           System.out.println("Solved Successfully");
        } 
        else { 
            System.out.println("No solution"); 
        } 
        printBoard(board, N);
    }
    private static void printBoard(int[][] board, int n) {
        for(int i = 0; i < n; i++){
           for(int j = 0; j < n; j++){
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    } 
}
