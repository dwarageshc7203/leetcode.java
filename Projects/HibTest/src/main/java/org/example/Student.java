    package org.example;

    import jakarta.persistence.*;

    @Entity
    public class Student {

        @Id
        private int sid;
        private String name;
        private int age;
        @OneToOne
        private Classroom classroom;

        public Student(){
        }

        public int getSid() {
            return sid;
        }

        public Classroom getClassroom() {
            return classroom;
        }

        public void setClassroom(Classroom classroom) {
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
                    '}';
        }
    }
