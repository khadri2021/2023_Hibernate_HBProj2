package com.khadri.hibernate.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.khadri.hibernate.entity.Employee;

public class ClientMain {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		SessionFactory factory = cfg.buildSessionFactory();

		Session sess = factory.openSession();

		Transaction txn = sess.beginTransaction();

		Employee emp = new Employee();
		emp.setEmpName("JHON");
		emp.setSalary(1000000.00);

		sess.save(emp);

		txn.commit();

		sess.close();
		factory.close();

	}
}
