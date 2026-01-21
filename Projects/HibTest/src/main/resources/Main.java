package org.example;

import jakarta.persistence.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
//        Student s2 = new Student();
//        Student s3 = new Student();
//
//        Classroom c1 =  new Classroom();
//        Classroom c2 =  new Classroom();
//        Classroom c3 =  new Classroom();

        s1.setSid(1);
        s1.setName("ANL");
        s1.setAge(19);

//        s2.setSid(2);
//        s2.setName("BNL");
//        s2.setAge(20);
//
//        c1.setcId(1);
//        c1.setClassName("I - A");
//        c1.setStaffName("ANL");
//        c1.setStudents(Arrays.asList(s1, s2));

//        c2.setcId(2);
//        c2.setClassName("II - A");
//        c2.setStaffName("BNL");
//        c2.setStudents(Arrays.asList(s2, s3));
//
//        c3.setcId(3);
//        c3.setClassName("III - A");
//        c3.setStaffName("CNL");
//        c3.setStudents(Arrays.asList(s2, s3));

        SessionFactory sf = new Configuration()
                .addAnnotatedClass(org.example.Student.class)
                .configure()
                .buildSessionFactory();

        Session session = sf.openSession();

        Query query = session.createQuery("from Student where age = 19");
        List<Student> students = query.getResultList();
        session.close();

        Session sess = sf.openSession();
        Query q = session.createQuery("from Student where age = 19");
        List<Student> students = q.getResultList();
        sess.close();

        sf.close():

    }
}