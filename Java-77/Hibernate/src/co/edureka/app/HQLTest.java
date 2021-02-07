package co.edureka.app;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import co.edureka.configs.HibernateUtils;
import co.edureka.entity.Student;

public class HQLTest {

	public static void main(String[] args) throws InterruptedException {
		SessionFactory sf = HibernateUtils.getSessionFactory();
		Session session = sf.openSession();
		
		/*
		//String hql = "from co.edureka.entity.Student";
		//String hql = "from co.edureka.entity.Student where studid=101";
		//String hql = "from co.edureka.entity.Student where sname='Sagar'";
		String hql = "from co.edureka.entity.Student where sname like 'S%'";
		Query<Student> query = session.createQuery(hql);
		*/
		
		/*
		//positional parameters in HQL
		String hql = "from co.edureka.entity.Student where studid between ?1 and ?2";
		Query<Student> query = session.createQuery(hql);
		query.setParameter(1, 101);
		query.setParameter(2, 105);
		*/
		
		//named parameters
		String hql = "from co.edureka.entity.Student where studid between :minsid and :maxsid";
		Query<Student> query = session.createQuery(hql);
		query.setParameter("minsid", 106);
		query.setParameter("maxsid", 200);
		
		List<Student> students = query.getResultList();
		for(Student st : students) {
			System.out.println(st);
			Thread.sleep(1000);
		}
		
		System.out.println("---- performing DML operation using HQL ----");
		
		Transaction tx = session.beginTransaction();
		
		hql = "update co.edureka.entity.Student stud set stud.sname='Charles Win' where stud.studid=103";
		query = session.createQuery(hql);
		int rows_affected = query.executeUpdate();
		System.out.println("No of Students Updated = " + rows_affected);
		
		tx.commit();
		
		session.close();
		sf.close();
	}
}
