package TodoList;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DbOperations{
    private Connection con;
    private int index = 1;

    Task task = new Task();

    public DbOperations(){
        try{
            con = DriverManager.getConnection(
            "jdbc:postgresql://localhost:5432:/demo",
            "postgres",
        "dwarageshdc"
        );
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

    //create Task
    public void createTask()throws Exception{
        String sql = "insert into tasks values (?, ?, ?, ?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, index);
        ps.setString(2, task.getTaskName());
        ps.setString(3, task.getDesc());
        ps.setString(4, "Not Completed");
        ps.execute();

        index++;   
        System.out.println("Task added");     
    }

    //view Task
    public void viewTask() throws Exception{
        String sql = "select * from tasks";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery(sql);
        while(rs.next())
        {
            System.out.println(rs.getInt(1));
            System.out.println(rs.getString(2));
            System.out.println(rs.getString(3));
            System.out.println(rs.getString(4));
        }
        rs.close();
        System.out.println("Tasks loaded");
    }

    //Complete Task
    public void completeTask() throws Exception{
        String sql = "update tasks set status = 'Completed' where id = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.execute();
        System.out.println("Task completed!");
    }

    //Delete Task
    public void deleteTask() throws Exception{
        String sql = "delete from tasks where id = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.execute();
        System.out.println("Task successfully deleted!");
    }
}
