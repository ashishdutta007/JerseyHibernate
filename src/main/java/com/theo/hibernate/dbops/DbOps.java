package com.theo.hibernate.dbops;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DbOps {
	public static void main(String[] args) {

		// 1.Creating the configuration object from hibernate.cfg.xml file
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		// 2.Creating the Session Factory from cfg object
		SessionFactory factory = cfg.buildSessionFactory();

		// 3.Creating the session object
		Session session = factory.openSession();

		// 4.Create transaction object
		Transaction t = session.beginTransaction();

		EmployeePersistentClass emp1 = new EmployeePersistentClass();
		emp1.setId(105);
		emp1.setName("Mikhail");
		emp1.setAge(15);

		// persisting the emp1 object to db
		session.persist(emp1);

		// transaction is commited to db
		t.commit();
		System.out.println("After t commit");

		// Closing the current db session on completion as session object is not
		// thread-safe
		session.close();

		System.out.println("Emp1 saved to db successfully");
	}

}
