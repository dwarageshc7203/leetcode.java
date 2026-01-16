package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        Classroom c1 =  new Classroom();
        Classroom c2 =  new Classroom();
        Classroom c3 =  new Classroom();

        s1.setSid(1);
        s1.setName("ANL");
        s1.setAge(19);
        s1.setClassroom(Arrays.asList(c1, c2));

        s2.setSid(2);
        s2.setName("BNL");
        s2.setAge(20);
        s2.setClassroom(Arrays.asList(c2, c3));

        s3.setSid(3);
        s3.setName("CNL");
        s3.setAge(21);
        s3.setClassroom(Arrays.asList(c1, c3));

        c1.setcId(1);
        c1.setClassName("I - A");
        c1.setStaffName("ANL");
        c1.setStudents(Arrays.asList(s2, s2));

        c2.setcId(2);
        c2.setClassName("II - A");
        c2.setStaffName("BNL");
        c2.setStudents(Arrays.asList(s2, s3));

        c3.setcId(3);
        c3.setClassName("III - A");
        c3.setStaffName("CNL");
        c3.setStudents(Arrays.asList(s2, s3));

        Configuration cfg = new Configuration()
                .addAnnotatedClass(org.example.Student.class)
                .addAnnotatedClass(org.example.Classroom.class)
                .configure();

        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();

        Transaction transaction = session.beginTransaction();
        session.persist(s2);
        session.persist(s2);
        session.persist(s3);

        session.persist(c1);
        session.persist(c2);
        session.persist(c3);

        transaction.commit();
        sf.close();
        session.close();

        System.out.println(s2);
        System.out.println(s2);
    }
}