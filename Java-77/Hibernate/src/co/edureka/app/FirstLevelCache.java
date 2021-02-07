package co.edureka.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import co.edureka.configs.HibernateUtils;
import co.edureka.entity.Student;

public class FirstLevelCache {

	public static void main(String[] args) {
		 SessionFactory sf = HibernateUtils.getSessionFactory();
		 Session session = sf.openSession();
		 
		 System.out.println("-----loading a student -----");
		 Student st1 = session.get(Student.class, 101);
		 System.out.println(st1);
		 
		 System.out.println("-----loading a student -----");
		 
		 Student st2 = session.get(Student.class, 101);
		 System.out.println(st2);
		 
		 session.close();
		 sf.close();
	}
}
