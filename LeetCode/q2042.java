import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class q2042 {
//public class Solution{
    public static boolean areNumbersAscending(String s) {
        boolean output = true;
        List <Integer> list = new ArrayList<>();

        for( int i = 0; i < s.length(); i++){
            if(Character.isDigit(s.charAt(i))){     //check number

                if( i < s.length() - 1 && Character.isDigit(s.charAt(i + 1)) ){            //check for 1+ digit numbers
                    int num = 0;
                    int digit = i;
                    while ( digit < s.length() - 1 && Character.isDigit(s.charAt(digit + 1))){
                        num = num * 10 + (s.charAt(digit) - '0');
                        digit ++;
                    }
                    num = num * 10 + (s.charAt(digit) - '0');
                    list.add(num);
                    System.out.println(num);
                    i = digit;
                }

                else{
                    list.add(s.charAt(i) - '0');
                    System.out.println(s.charAt(i) - '0');
                }
            }
        }
        //check the ascending order
        List <Integer> copy = new ArrayList<>(list);
        Set <Integer> dup = new HashSet<>(list);
        copy.sort(null);
        if(list.equals(copy)  && dup.size() == list.size()){
            output = true;
        }
        else{
            output = false;
        }
        return output;
    }
    public static void main(String[] args) {
        String s = "1 box has 3 blue 4 red 6 green and 12 yellow marbles"; //true
        System.out.println(areNumbersAscending(s));
    }
}
