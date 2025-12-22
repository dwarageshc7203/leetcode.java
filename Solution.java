import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> findWords(char[][] board, String[] words) {
        //init the row and column
        int row = board.length;
        int column = board[0].length;
        int len = words.length;
        List<String> output = new ArrayList<>();

        for (int k = 0; k < len; k++) {
            boolean found = false;
            for (int i = 0; i < row && !found; i++) {
                for (int j = 0; j < column && !found; j++) {
                    if(movement(board, words, i , j, k , 0)){
                        output.add(words[k]);
                        found = true;
                    }
                }
            }
        }
        return output;
    }

    //movement
    public boolean movement(char[][] board, String[] words, int row, int column, int k, int index){
        
        if(index == words[k].length()){
            return true;
        }

        if( 
            row < 0 ||
            column < 0 ||
            row >= board.length ||
            column >= board[0].length ||
            board[row][column] != words[k].charAt(index)
            ){
            return false;
        }

        char temp = board[row][column];
        board[row][column] = '$';

        boolean result =(
             movement( board, words, row + 1, column, k, index + 1) || 
             movement( board, words, row - 1, column, k, index + 1) ||
             movement( board, words, row, column + 1, k, index + 1) ||
             movement( board, words, row, column - 1, k, index + 1)
        );
        board[row][column] = temp;

        return result;
    }

    public static void main(String[] args){
        char[][] board = {
    {'o','a','a','n'},
    {'e','t','a','e'},
    {'i','h','k','r'},
    {'i','f','l','v'}
};

String[] words = {"oath", "pea", "eat", "rain"};

Solution obj = new Solution();

System.out.println(obj.findWords(board, words));
    }
}