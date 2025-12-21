//Given an m x n grid of characters board and a string word, return true if word exists in the grid.

class Solution {
    public boolean exist(char[][] board, String word) {

        int row = board.length;
        int column = board[0].length;

        for( int i = 0; i < row; i++){
            for( int j = 0; j < column; j++){
                if(movement(board, i, j, 0, word))
                    return true;
            }
        }

        return false;
    }

    public boolean movement(char[][] board, int row, int column, int index, String word){

        if(index == word.length()){
            return true;
        }

        if( row < 0 ||
            column < 0 ||
            row >= board.length ||
            column >= board[0].length ||
            board[row][column] != word.charAt(index)
        ){
            return false;
        }

        char temp = board[row][column];
        board[row][column] = '$';

        //I implemented backtracking here hehe

        boolean result = (
            movement(board, row + 1, column, index+1, word) ||
            movement(board, row, column + 1, index+1, word) ||
            movement(board, row - 1, column, index+1, word) ||
            movement(board, row, column - 1, index+1, word)
        );

        board[row][column] = temp;

        return result;

    }

    //main method
    public static void main( String[] args){
        char[][] board = {{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'} }; //[["A","B","C","E"],["S","F","C","S"]
        String word = "ABCCED";
        Solution obj = new Solution();
        System.out.println(obj.exist(board, word));
    }
}

