public class Calculator{
    Operation obj = new Operation();
    obj.show();
    
    
}

class Operation{
    
    static int num;
     static String name = "Casio";
    static{
        num = 10;
        name = "Mechanical Calc";
        System.out.println("Static is implemented");
    }

    static void show(){
        System.out.println("Show method");
        System.out.println(num);
        System.out.println(name);
    }
}