
@FunctionalInterface
interface A{
    public String name(String name);
}

public class Exercise{
    public static void main(String[] args){
        A obj = (name) -> {
            return ("Your name is " + name);
        };
        String answer = obj.name("CNL");

        System.out.println(answer);
        System.out.println(obj.name("CNL"));
    }
} 