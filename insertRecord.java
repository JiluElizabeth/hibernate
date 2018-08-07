package com.deloitte;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class insertRecord {
public static void main(String args[]) {

Configuration config=new Configuration();
config.configure ("hibernate.cfg.xml");
SessionFactory sf=config.buildSessionFactory();
Session session=sf.openSession();
laptop l1=new laptop();
l1.setId(25);
l1.setBrandName("DELL");
l1.setPrice(12345.6);

Transaction tx=session.beginTransaction();
tx.begin();



session.save(l1);
tx.commit();
System.out.println("SUCCESSFULLY INSERTED ONE ROW");

}
}
