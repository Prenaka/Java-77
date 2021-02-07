package co.edureka.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import co.edureka.configs.HibernateUtils;
import co.edureka.entity.Employee;

public class SaveEmployee {

	public static void main(String[] args) {		
		SessionFactory sfactory = HibernateUtils.getSessionFactory();
		Session session = sfactory.openSession();
		Transaction tx = session.beginTransaction();
		
		/*--- create an Employee instance --- */
		Employee emp = new Employee(102,"Anil Kumar",2500.5f);
		
		session.save(emp);
		System.out.println("-----------------------------------------");
		
		/*--- commit the transaction ---*/
		tx.commit(); 
		
		/*-- close session & sessionfactory ---*/
		session.close();
		sfactory.close();
	}
}
