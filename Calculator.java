public class Calculator{
    public static void main(String[] args){

    Human obj = new Human();

    /* System.out.println(obj.name); */

    obj.setName("CNL");
    obj.getName();
    }
}

class Human{
    private String name;

    public String getName(){
        System.out.println(name);
        return name;
    }

    public void setName(String a){
        name = a;
    }
}