package CourseRegistration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Enrollment {
    private String sname = "";
    private String cname = "";

    //constructor
    public Enrollment(String sname, String cname){
        this.sname = sname;
        this.cname = cname;
    }

    public void enrollCourse(String sname, String cname) throws SQLException{
        Connection con = DriverManager.getConnection(
            "jbdc:postgres://localhost:5432/demo",
            "postgres",
            "dwarageshdc"
        );

         System.out.println("Connection Established");
        
        PreparedStatement insert = con.prepareStatement("insert into student values (?, ?)");
        insert.setString(1, this.sname);
        insert.setString(2, this.cname);
    }
}
