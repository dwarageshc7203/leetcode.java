
import java.util.HashMap;

public class q1859 {
//public class Solution{
    public static String sortSentence(String s) {
        HashMap <Integer, String> hash = new HashMap<>();

        String[] arr = new String[10];
        arr = s.split(" ");

        for( String st : arr){
            int order = st.charAt(st.length() -1 ) - '0';
            st = st.substring(0, st.length() - 1);
            hash.put(order, st);
        }
        String output = "";
        for(int i = 1; i <= hash.size(); i++){
            if( i > 1){
            output = output + " " + hash.get(i);}
            else{
                output = hash.get(i);
            }
        }

        // System.out.println(hash);
        // System.out.println(output);

        return output;
    }

    public static void main(String[] args) {
        String s1 = "is2 sentence4 This1 a3";
        String s2 = "Myself2 Me1 I4 and3";

        System.out.println(sortSentence(s1));
        System.out.println(sortSentence(s2));
    }
}
