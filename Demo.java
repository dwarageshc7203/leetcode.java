class Solution {
    public boolean exist(char[][] board, String word) {
        for( int i = 0; i < board.length; i++){
            for( int j = 0; j < board[0].length; j++){
                if( movement(board, word, 0, i, j)){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean movement( char[][] board, String word, int index, int i, int j){
        if(i > board.length ||
           j > board[0].length ||
           board[i][j] != word.charAt(index)
        ){
            return false;
        }

        if(index == word.length()){
            return true;
        }

        boolean result = (
        movement(board, word, index + 1, i + 1, j) ||
        movement(board, word, index + 1, i - 1, j) ||
        movement(board, word, index + 1, i , j + 1) ||
        movement(board, word, index + 1, i , j - 1)
        );

        return result;
    }
}

public class Demo{
    public static void main(String[] args) {
        Solution obj = new Solution();

        

        char[][] board = {
            {'A','B','C','E'},
            {'S','F','C','S'},
            {'A','D','E','E'}
        };

        String word = "SEE";

        boolean output = obj.exist(board, word);
        System.out.println(output);

    }
}