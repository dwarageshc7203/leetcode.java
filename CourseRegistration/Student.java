package CourseRegistration;

import java.sql.*;

public class Student {
    private int age = 0;
    private String name = "";

    //constructor
    public Student(int age, String name){
        this.age = age;
        this.name = name;

        System.out.println("Recorded. Name: " + this.name + " ; Age: " + this.age);
    }

    //create Student
    public void createStud(int age, String name) throws SQLException{
        
        Connection con = DriverManager.getConnection(
            "jbdc:postgres://localhost:5432/demo",
            "postgres",
            "dwarageshdc"
        );

         System.out.println("Connection Established");
        
        PreparedStatement insert = con.prepareStatement("insert into student values (?, ?)");
        insert.setInt(1, this.age);
        insert.setString(2, this.name);
    }
}
