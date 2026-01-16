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

        Classroom c =  new Classroom();

        Student s1 = new Student();
        s1.setSid(13);
        s1.setName("DNL");
        s1.setAge(21);
        s1.setClassroom(c);

        Student s2 = new Student();
        s2.setSid(14);
        s2.setName("ENL");
        s2.setAge(22);
        s2.setClassroom(c);

        c.setcId(3);
        c.setClassName("I - B");
        c.setStaffName("CNL");
        c.setStudents(Arrays.asList(s1, s2));

        Configuration cfg = new Configuration()
                .addAnnotatedClass(org.example.Student.class)
                .addAnnotatedClass(org.example.Classroom.class)
                .configure();

        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();

        Transaction transaction = session.beginTransaction();
        session.persist(s1);
        session.persist(s2);
        session.persist(c);
        transaction.commit();
        sf.close();
        session.close();

        System.out.println(s1);
        System.out.println(s2);
    }
}