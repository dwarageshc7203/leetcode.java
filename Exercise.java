public class Exercise {
    public static void main(String[] args) {
        Mobile m1 = new Mobile();
        Mobile m2 = new Mobile();

        m1.brand = "IPhone";
        m2.brand = "Moto";

        Mobile.name = "SmartPhone";
        m1.show();
        m2.show();

        Mobile.name = "Phone";
        m1.show();
        m2.show();
        
    }
}

class Mobile{
    String brand;
    static String name;

    public void show(){
        System.out.println(brand + " ; " + name);
    }
}
