package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Classroom c =  new Classroom();
        c.setcId(1);
        c.setClassName("I - A");
        c.setStaffName("ANL");

        Student s = new Student();
        s.setSid(11);
        s.setName("CNL");
        s.setAge(20);
        s.setClassroom(c);

        Configuration cfg = new Configuration()
                .addAnnotatedClass(org.example.Student.class)
                .addAnnotatedClass(org.example.Classroom.class)
                .configure();

        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();

        Transaction transaction = session.beginTransaction();
        session.persist(s);
        session.persist(c);
        transaction.commit();
        sf.close();
        session.close();

        System.out.println(s);
    }
}