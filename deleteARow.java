package com.deloitte;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class deleteARow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Configuration config=new Configuration();
config.configure("hibernate.cfg.xml");
SessionFactory factory=config.buildSessionFactory();
Session session=factory.openSession();

Transaction tx=session.beginTransaction();
tx.begin();

//delete from laptop where id=5;
//finding a row with id=1
//deletion based on primary key
laptop lt1=(laptop)session.get(laptop.class, 25);
//delete this object from the table
//...............session.delete(lt1);//remove this object from the table
lt1.setBrandName(lt1.getBrandName()+"us");
session.update(lt1);
tx.commit();
System.out.println("successfully added a row");//....successfully deleted a row if: 'session.delete(lt1)' instead of 'lt1.setBrandName(lt1.getBrandName()+"us");'
	}

}
