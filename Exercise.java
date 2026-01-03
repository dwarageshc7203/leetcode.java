import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Exercise{
    public static void main(String[] args){
        Set<Integer> nums = new HashSet<Integer>();
        nums.add(111);
        nums.add(2222);
        nums.add(333);
        System.out.println(nums);

        Iterator<Integer> val = nums.iterator();
        Map<String, Integer> students = new HashMap<>();
        students.put("CNL", 100);
        students.put("CNL", 99);
        students.put("CNL", 100);
        students.put("BNL", 99);
        students.put("ANL", 99);
        System.out.println(students);
        System.out.println(students.keySet());
        System.out.println(students.values());

}
}