import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class q744{
// class Solution {
    public static char nextGreatestLetter(char[] letters, char target) {

        List <Character> list = new ArrayList<>();

        for ( int i = 0; i < letters.length; i++)
        {
            if( letters[i] - 'a' > target - 'a'){
                list.add(letters[i]);
            }
        }
        if(list.isEmpty()){
            return letters[0];
        }
        Collections.sort(list);
        return list.get(0);
    }

    public static void main(String[] args) {
        char[] letters = {'c','f','j'};
        char target = 'a';

        System.out.println(nextGreatestLetter(letters, target));
    }
}