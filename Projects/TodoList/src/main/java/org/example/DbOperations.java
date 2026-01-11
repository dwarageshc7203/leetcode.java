package TodoList.src.main.java.org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DbOperations{
    private Connection con;
    private int index = 1;
    private String nameInput = "";
    private String descInput = "";

    Task task = new Task();

    public DbOperations(){
        try{
            //Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/demo",
                    "postgres",
                    "dwarageshdc"
            );
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

    //create Task
    public void createTask(String nameInput, String descInput)throws Exception{
        String sql = "insert into tasks values (?, ?, ?, ?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, index);
        ps.setString(2, task.setTaskName(nameInput));
        ps.setString(3, task.setDesc(descInput));
        ps.setString(4, "Not Completed");
        ps.execute();

        index++;
        System.out.println("Task added");
    }

    //view Task
    public void viewTask() throws Exception{
        String sql = "select * from tasks";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while(rs.next())
        {
            System.out.println("[ " + rs.getInt(1) + " : " + rs.getString(2) + " : " + rs.getString(3) + " : " + rs.getString(4) + " ]");
        }
        rs.close();
        System.out.println("Tasks loaded");
    }

    //Complete Task
    public void completeTask(int idInput) throws Exception{
        String sql = "update tasks set status = 'Completed' where id = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, task.setId(idInput));
        ps.execute();
        System.out.println("Task completed!");
    }

    //Delete Task
    public void deleteTask(int idInput) throws Exception{
        String sql = "delete from tasks where id = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, task.setId(idInput));
        ps.execute();
        System.out.println("Task successfully deleted!");
    }
}
