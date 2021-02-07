package co.edureka.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import co.edureka.configs.HibernateUtils;
import co.edureka.entity.Student;

public class SecondLevelCache {

	public static void main(String[] args) {
		 SessionFactory sf = HibernateUtils.getSessionFactory();
		 Session session1 = sf.openSession();
		 Session session2 = sf.openSession();
		 
		 System.out.println("-----session-1 loading a student -----");
		 Student st1 = session1.get(Student.class, 101);
		 System.out.println(st1);
		 
		 System.out.println("-----session-2 loading a student -----");
		 
		 Student st2 = session2.get(Student.class, 101);
		 System.out.println(st2);
		 
		 session1.close();
		 session2.close();
		 sf.close();
	}
}
