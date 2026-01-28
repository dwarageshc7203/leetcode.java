import java.util.Map.Entry;
import java.util.HashMap;

public class q205{
// class Solution {

    public static boolean isIsomorphic(String s, String t) {
        HashMap <Character, Character> hash = new HashMap<>();
        boolean output = true;

        for( int i = 0; i < s.length(); i++ )
        {
            if ( !hash.containsKey(s.charAt(i)) && !hash.containsValue(t.charAt(i)))
            {
                hash.put(s.charAt(i), t.charAt(i));
            }

            else if( hash.containsKey(s.charAt(i))){

                if( hash.get(s.charAt(i)) != t.charAt(i))
                {
                    output = false;
                }
            }

            else if( hash.containsValue(t.charAt(i)) ){

                char temp = 0;

                for ( Entry < Character, Character > entry : hash. entrySet()){
                    if(entry.getValue().equals(t.charAt(i))){
                        temp = entry.getKey();
                        System.out.println(s.charAt(i) + " : " + t.charAt(i));
                    }
                }
                if(temp != s.charAt(i))
                    output = false;
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

        String s2 = "foo";
        String t2 = "bar";

        System.out.println(isIsomorphic(s, t));//true
        System.out.println(isIsomorphic(s1, t1));//false
        System.out.println(isIsomorphic(s2, t2));//false
    }
}