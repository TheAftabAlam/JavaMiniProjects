package com.tut;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Project start" );
        //SessionFactory factory=new Configuration().configure().buildSessionFactory();
        
        Configuration cfg=new Configuration();
        cfg.configure();
        SessionFactory factory=cfg.buildSessionFactory();
       
        Student student=new Student();
        student.setId(2);
        student.setName("David");
        student.setMarks(90);
        
        Certificate certificate=new Certificate();
        certificate.setCourse("Java");
        certificate.setDuration("3_Months");
        student.setCertificate(certificate);
        
        System.out.println(student.toString());
        
        Session session= factory.openSession();
        
        session.beginTransaction();
        session.save(student);
        session.getTransaction().commit();
        session.close();
        factory.close();
        
        
    }
}
