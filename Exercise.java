// TODO: Create an interface called Machine with one method: String start()


// TODO: Create an abstract class called Appliance that:
// - Implements Machine interface


// TODO: Create a class Fan that:
// - Extends Appliance


// TODO: Create a class WashingMachine that:
// - Extends Appliance

interface Machine{
    String start();
}

abstract class Appliance implements Machine{
    private String name;
    
    public Appliance(){
        this.name = name;
    }
}

class Fan extends Appliance{
    public String start(){
        return "Fan is running";
    }
}

class WashingMachine extends Appliance{
    public String start(){
        return "Washing Machine is operating";
    }
}


public class Exercise {
    public static void main(String[] args) {
        // TODO: Create objects of Fan and WashingMachine using interface references
        // TODO: Print the result of start() for each object

        Fan fan = new Fan();
        WashingMachine wm = new WashingMachine();

        System.out.println(fan.start());
        System.out.println(wm.start());
    }
}