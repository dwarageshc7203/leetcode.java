public class Exercise {
    public static void main(String[] args) {
        Employee emp = new Employee();
        Manager man = new Manager();

          /* Name:  Alice,  Salary:  50000.0

  Name:  Bob,  Salary:  80000.0,  Department:  IT */
         String name1 = "Alice";
        double salary1 = 50000.0;

        String name2 = "Bob";
        double salary2 = 80000.0;
        String dept2 = "IT";

        emp.getDetails(name1, salary1);
        man.getDetails(name2, salary2, dept2);


    }
}

class Employee
//Employee class
{
    private String name;
    private double salary;

    public Employee(){ // constructor
    }

    public void getDetails(String name, double salary){//getter        
        System.out.println("Name: " + name + ", " + "Salary: " + salary);
    }
}

class Manager extends Employee
//Manager class
{

    private String department;

    public Manager(){ // constructor
        String name;
        double salary;
        String department;
    }

    public void getDetails(String name, double salary, String department){ // getter        
        System.out.println("Name: " + name + ", " + "Salary: " + salary + ", " + "Department: " + department);
    }

}