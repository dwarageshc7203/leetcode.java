class Solution {

    private static final int GRID_SIZE = 9;

    private static boolean inRow(char[][] board, char number, int row) {
        for (int i = 0; i < GRID_SIZE; i++) {
            if (board[row][i] == number) {
                return true;
            }
        }
        return false;
    }

    //for the column
    private static boolean inColumn(char[][] board, int column, char number) {
        for (int i = 0; i < GRID_SIZE; i++) {
            if (board[i][column] == number) {
                return true;
            }
        }
        return false;
    }

    //for the box
    private static boolean inBox(char[][] board, int row, int column, char number) {
        int localRow = row - row % 3;
        int localColumn = column - column % 3;

        for (int i = localRow; i < localRow + 3; i++) {
            for (int j = localColumn; j < localColumn + 3; j++) {
                if (board[i][j] == number) {
                    return true;
                }
            }
        }
        return false;
    }

    //check valididty
    private static boolean isValid(char[][] board, int row, int column, char number) {
        return !inRow(board, number, row) &&
                !inColumn(board, column, number) &&
                !inBox(board, row, column, number);
    }

    //actual solver logic
    private static boolean sudokuSolver(char[][] board) {
        for (int row = 0; row < GRID_SIZE; row++) {
            for (int column = 0; column < GRID_SIZE; column++) {
                if (board[row][column] == '.') {
                    for (int i = 1; i <= GRID_SIZE; i++) {
                        if (isValid(board, row, column, (char)(i + '0'))) {
                            board[row][column] = (char)(i + '0');

                            if (sudokuSolver(board)) {
                                return true;
                            } else {
                                board[row][column] = '.';
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }


    public void solveSudoku(char[][] board) {
        sudokuSolver(board);
    //main function here hehe

    //for the row

}
}