package TodoList;

public class Task {

    private int id;
    private String taskName;
    private String desc;
    private String status;

    public Task(){
    }

    public Task(int id, String taskName, String desc, String status)
    {
        this.id = id;
        this.taskName= taskName;
        this.desc = desc;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
