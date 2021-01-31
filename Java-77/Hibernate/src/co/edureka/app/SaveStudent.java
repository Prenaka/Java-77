package co.edureka.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import co.edureka.entity.Student;

public class SaveStudent {

	public static void main(String[] args) {
		/*--- parse hibernate.cfg.xml and hbm.xml ---*/
		Configuration config = new Configuration();
		config.configure("co/edureka/configs/hibernate.cfg.xml");
		
		/*--- create SessionFactory ---*/
		SessionFactory sfactory = config.buildSessionFactory();
		
		/*--- create a Session ----*/
		Session session = sfactory.openSession();
		
		/*--- create a Transaction ---*/
		Transaction tx = session.beginTransaction();
		
		/*--- create a Student instance --- */
		Student st = new Student(101,"Sunil","sunil@hotmail.com","9848586878");
		
		/*--- save student object with hibernate session ---*/
		session.save(st);
		System.out.println("-----------------------------------------");
		
		/*--- commit the transaction ---*/
		tx.commit(); //generates SQL Query and the Student details will be mapped to student table a a record
		
		/*-- close session & sessionfactory ---*/
		session.close();
		sfactory.close();
	}
}
