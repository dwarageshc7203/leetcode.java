    package org.example;

    import jakarta.persistence.*;

    import java.util.List;

    @Entity
    public class Student {

        @Id
        private int sid;
        private String name;
        private int age;
        @ManyToMany
        private List<Classroom> classroom;

        public Student(){
        }

        public int getSid() {
            return sid;
        }

        public List<Classroom> getClassroom() {
            return classroom;
        }

        public void setClassroom(List<Classroom> classroom) {
            this.classroom = classroom;
        }

        public void setSid(int sid) {
            this.sid = sid;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "sid=" + sid +
                    ", name='" + name + '\'' +
                    ", age=" + age +
                    ", classroom=" + classroom +
                    '}';
        }
    }
