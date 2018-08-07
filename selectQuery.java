package com.deloitte;

import java.util.Iterator;
import java.util.List;
import java.util.*;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class selectQuery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration config=new Configuration();
		config.configure("hibernate.cfg.xml");
		SessionFactory factory=config.buildSessionFactory();
		Session session=factory.openSession();
		//session.createQuery("from com.deloitte.laptop");
		Query query=session.createQuery("from com.deloitte.laptop");
		List listObj=query.list();
		//simple java program
		Iterator it=listObj.iterator();
		while(it.hasNext())
		{
			laptop lt=(laptop)it.next();
			System.out.println(lt.getId()+" "+lt.getBrandName()+" "+lt.getPrice());
		}
	}

}
