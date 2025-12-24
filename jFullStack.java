public class jFullStack {
    public static void main(String[] args) {

        Human obj = new Human("CNL");
        System.out.println(obj.name);

}
}

class Human{
    String name;
    public Human(String n){
        name = n;
    }

}
