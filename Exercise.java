import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student{
    int age;
    String name;

    //constructor
    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    //toString
    @Override
    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }
}

public class Exercise{
    public static void main(String[] args) {
        List <Student> nums = new ArrayList<>();
        
        nums.add(new Student(19, "CNL"));
        nums.add(new Student(20, "BNL"));
        nums.add(new Student(18, "DNL"));

        Comparator<Student> com = new Comparator<Student>() {
            public int compare(Student i, Student j){
                if(i.age > j.age){
                return 1;
                }
                else{
                    return -1;
                }
            }
        };
        Collections.sort(nums, com);
        System.out.println(nums);
    }
}