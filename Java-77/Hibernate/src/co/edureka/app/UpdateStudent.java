package co.edureka.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import co.edureka.configs.HibernateUtils;
import co.edureka.entity.Student;

public class UpdateStudent {

	public static void main(String[] args) {
		SessionFactory sfactory = HibernateUtils.getSessionFactory();
		Session session = sfactory.openSession();
		
		session.beginTransaction();
		/*
		//approach-1
		Student st = new Student(101,"Sunil Joseph","sunil@edureka.co","1234567890");
		session.update(st);
		*/
		
		//approach-2
		Student st = session.get(Student.class, 102);
		if(st!=null) {
			System.out.println(st);
			st.setSname("Anil Kumar"); //becomes a dirty object
		}
		else
			System.out.println("No matching student with the specified ID!");		
		
		session.getTransaction().commit();
		session.close();
		sfactory.close();
	}

}
