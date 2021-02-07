package co.edureka;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		//initialize spring container (or) IoC
		BeanFactory factory = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("-------------------------------");
		//to get the bean from IoC
		Student st1 = (Student)factory.getBean("stud1");
		System.out.println(st1);
		System.out.println("-------------------------------");
		
		Student st2 = factory.getBean("stud2", Student.class);
		System.out.println(st2);
		System.out.println("-------------------------------");
		
		Student st3 = (Student)factory.getBean("stud1");
		System.out.println(st3);
		System.out.println("-------------------------------");
		
		Student st4 = (Student)factory.getBean("stud1");
		System.out.println(st4);
		System.out.println("-------------------------------");
	}
}
