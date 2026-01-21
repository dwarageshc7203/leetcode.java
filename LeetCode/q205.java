import java.util.HashMap;

public class q205{
// class Solution {

    public static boolean isIsomorphic(String s, String t) {
        HashMap <Character, Character> hash = new HashMap<>();
        boolean output = true;

        for( int i = 0; i < s.length(); i ++)
        {
            if( !hash.containsKey(s.charAt(i)))
            {
                if()
            }
        }
        return output;
    }

    public static void main ( String[] args)
    {
        String s = "egg";
        String t = "add";

        String s1 = "badc";
        String t1 = "baba";

        // System.out.println(isIsomorphic(s, t));
        System.out.println(isIsomorphic(s1, t1));
    }
}