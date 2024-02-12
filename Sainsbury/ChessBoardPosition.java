package Sainsbury;

/**
 * Give me the solution to this problem in java
The chessboard bellow has 64 squares, 8 rows and 8 columns each is labelled from 1 to 8 and each column is labelled from a t h lowercase. A square is located at the intersection of a row and of a column like square 2c it's intersection of the row 2 and column C.
Positioning a pawn to a starting square, you need to find out the end square after moving it R times (rows vertically) to the top and C times (Column) horitally to the right. If during the moves the pawn reaches the end of the board, it will start again from the opposite direction like in the second example. 

String startPosition
Number rows
Number column

Output endPosition

Here's a Java solution to find the end position of the pawn after moving it R times vertically and C times horizontally from the starting position:
 */

public class ChessBoardPosition {
    public static void main(String[] args) {
        String startPosition = "2c";
        int rows = 3; // Number of rows to move vertically
        int columns = 5; // Number of columns to move horizontally
        String endPosition = findEndPosition(startPosition, rows, columns);
        System.out.println("End position: " + endPosition);
    }

    public static String findEndPosition(String startPosition, int rows, int columns) {
        char rowChar = startPosition.charAt(0);
        char colChar = startPosition.charAt(1);
        
        // Calculate row and column numbers
        int row = Character.getNumericValue(rowChar);
        int col = colChar - 'a' + 1; // Convert column char to column number
        
        // Move vertically
        row += rows;
        // Handle wrap around for rows
        if (row > 8) {
            row = row % 8;
            if (row == 0) row = 8;
        }
        
        // Move horizontally
        col += columns;
        // Handle wrap around for columns
        if (col > 8) {
            col = col % 8;
            if (col == 0) col = 8;
        }
        
        // Convert row and column numbers back to characters
        rowChar = (char) (row + '0');
        colChar = (char) (col + 'a' - 1); // Convert column number to column char
        
        return "" + rowChar + colChar;
    }
}
