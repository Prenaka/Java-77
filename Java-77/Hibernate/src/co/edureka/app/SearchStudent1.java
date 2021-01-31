package co.edureka.app;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import co.edureka.configs.HibernateUtils;
import co.edureka.entity.Student;

public class SearchStudent1 {

	public static void main(String[] args) {
		SessionFactory sfactory = HibernateUtils.getSessionFactory();
		Session session = sfactory.openSession();
		
		Student st = new Student();
		System.out.println(st);
		try {
			session.load(st, 1025);
		}catch(Exception ex) {
			System.out.println(ex.toString());
		}
		System.out.println(st);
		
		session.close();
		sfactory.close();

	}

}
