package com.deloitte;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class WHERECLAUSE {

	public static void main(String[] args) {
		

		Configuration config=new Configuration();
		config.configure("hibernate.cfg.xml");
		SessionFactory factory=config.buildSessionFactory();
		Session session=factory.openSession();
		
		Criteria c=session.createCriteria(laptop.class);
		c.add(Restrictions.gt("price",20000.0));
		
		
		List<E> listObj=c.list();
		Iterator it=listObj.iterator();
		while(it.hasNext())
		{
			laptop l1=(laptop)it.next();
			System.out.println(l1.getId()+" "+l1.getBrandName()+" "+l1.getPrice());
		}
	}

}
