import java.util.ArrayList;
import java.util.List;

class Solution{
    public static void main(String[] args){

    }
}

class Main{
    List<String> result = new ArrayList();
    TrieNode root;
    Trie trie = new Trie();
    public List<String> findWords(char[][] board, String[] words) {

        //creating the tree of words
        for( String s : words){
            trie.insert(s);
            root = trie.root;
        }

        for( int i = 0; i < board.length; i++){
            for( int j = 0; j< board[0].length; j++){
                root.search(board, i, j, root, result);
            }
        }
        return result;
    }
}

class Trie{
    //constructor
    public Trie(){
        Trie root = new Trie();
    }
}

class TrieNode{
    //instance variables
    TrieNode[] children;
    String word;

    public void insert(String word){
        TrieNode current = new TrieNode();

        for( char c : word.toCharArray())
        {
            if( current.children[ c - 'a'] == null)
                current.children[ c - 'a'] = new TrieNode();
            current = current.children[ c - 'a'];
        }
    }
    
    public void search(char[][] board, int i, int j, TrieNode node, List<String> result){

        char temp = board[i][j];

        if(
            board[i][j] == '$' ||
            node.children == null
        ){
            return;
        }

        node = node.children[ board[i][j] - 'a'];

        if(node.word != null){
            result.add(node.word);
            node.word = null;
        }

        board[i][j] = '$';

        if(i > board.length - 1){
            search( board, i - 1, j, node, result);
        }

        if( j > board[0].length - 1){
            search( board, i, j - 1, node, result);
        }

        if( i < 0){
            search( board, i + 1, j, node, result);
        }

        if( j < 0){
            search( board, i, j + 1, node, result);
        }

        board[i][j] = temp;
    }
}