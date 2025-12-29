import java.util.ArrayList;
import java.util.List;

class Solution {
    List<String> result = new ArrayList<>();
    TrieNode root;

    public List<String> findWords(char[][] board, String[] words) {

        Trie trie = new Trie();
        for( String a : words){
            trie.insert(a);
        }
        root = trie.root;
        
        for( int i = 0; i < board.length; i++){
            for( int j = 0; j < board[0].length; j++){
                search(board, i, j, root);
            }
        }
    
        return result;
    }

    public void search(char[][] board, int i, int j, TrieNode node){

        char temp = board[i][j];

        if(
            temp == '*' ||
            node.children[temp - 'a'] == null
        ){
            return;
        }

        node = node.children[temp - 'a'];

        if(node.word != null){
            result.add(node.word);
            node.word = null;
        }

        board[i][j] = '*';

        if( i > 0){
            search(board, i - 1, j, node);
        }
        if( j> 0){
            search(board, i, j - 1, node);
        }        
        if( i < board.length - 1){
            search(board, i + 1, j, node);
        }
        if( j < board[0].length - 1){
            search(board, i, j + 1, node);
        }

        board[i][j] = temp;
    }
}

class TrieNode{
    TrieNode[] children = new TrieNode[26];
    String word;
}

class Trie{
    TrieNode root = new TrieNode();

    void insert(String word){
        TrieNode node = root;
        for ( char c : word.toCharArray()){
            int i = c - 'a';
            if( node.children[i] == null){
                node.children[i] = new TrieNode();
            }
            node = node.children[i];
        }
        node.word = word;
    }
}