package org.example;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Classroom {

    @Id
    private int cId;
    private String className;
    private String staffName;

    public int getcId() {
        return cId;
    }

    public void setcId(int cId) {
        this.cId = cId;
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
                '}';
    }
}
