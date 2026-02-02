package org.example;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Classroom {

    @Id
    private int cId;
    private String className;
    private String staffName;
    @OneToMany(fetch = FetchType.EAGER)
    private List<Student> students;

    public int getcId() {
        return cId;
    }

    public void setcId(int cId) {
        this.cId = cId;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    @Override
    public String toString() {
        return "Classroom{" +
                "cId=" + cId +
                ", className='" + className + '\'' +
                ", staffName='" + staffName + '\'' +
                ", students='" + students + '\'' +
                '}';
    }
}
