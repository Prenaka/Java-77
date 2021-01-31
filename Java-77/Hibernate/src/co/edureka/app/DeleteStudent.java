package co.edureka.app;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import co.edureka.configs.HibernateUtils;
import co.edureka.entity.Student;

public class DeleteStudent {

	public static void main(String[] args) {
		SessionFactory sfactory = HibernateUtils.getSessionFactory();
		Session session = sfactory.openSession();
		
		session.beginTransaction();
		/*
		//approach-1
		Student st = new Student(101,"Sunil Joseph","sunil@edureka.co","1234567890");
		session.delete(st);
		*/
		
		//approach-2
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter student id to be deleted: ");
		int sid = sc.nextInt();
		
		Student st = session.get(Student.class, sid);
		if(st!=null) {
			System.out.println(st);
			session.delete(st);
		}
		else
			System.out.println("No matching student with the specified ID!");		
		
		session.getTransaction().commit();
		session.close();
		sfactory.close();
	}

}
