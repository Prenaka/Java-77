package co.edureka.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import co.edureka.configs.HibernateUtils;
import co.edureka.entity.Student;

public class SearchStudent2 {

	public static void main(String[] args) {
		SessionFactory sfactory = HibernateUtils.getSessionFactory();
		Session session = sfactory.openSession();
		
		Student st = new Student();
		System.out.println(st); //toString() 
		
		st = session.get(Student.class, 1025);
		if(st!=null)
			System.out.println(st);
		else
			System.out.println("No matching student with the specified ID!");
		
		session.close();
		sfactory.close();

	}

}
