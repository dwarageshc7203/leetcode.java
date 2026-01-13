package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        s.setSid(3);
        s.setName("ENL");
        s.setAge(21);

        Configuration cfg = new Configuration()
                .addAnnotatedClass(org.example.Student.class)
                .configure();

        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();

        Transaction transaction = session.beginTransaction();
        session.persist(s);
        transaction.commit();
        sf.close();
        session.close();

        System.out.println(s);
    }
}