
@FunctionalInterface
interface A{
    public void show(String name);
}

public class Exercise{
    public static void main(String[] args){
        A obj = (String name) -> System.out.println("In show" + " " + name);
        obj. show("CNL");
    }
}