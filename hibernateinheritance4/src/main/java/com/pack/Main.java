package com.pack;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
public static void main(String args[])
{
	SessionFactory sf=new Configuration().configure().buildSessionFactory();
	Session s=sf.openSession();
	Transaction t=s.beginTransaction();
	Student st=new Student();
	st.setStudentid(100);
	st.setStudentname("Ram");
	st.setStudentgroup("Maths");
	Address ad=new Address();
	ad.setAddressid(101);
	ad.setPlace("chennai");
	ad.setStudent(st);
	s.persist(ad);
	t.commit();
	System.out.println("inserted successfully");
	s.close();
}
}
