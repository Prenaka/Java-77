package co.edureka;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.edureka.dao.EmployeeDAO;
import co.edureka.entity.Employee;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		
		EmployeeDAO dao = (EmployeeDAO)context.getBean("empdao");
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("1.Add an Employee");
			System.out.println("2.Update an Employee");			
			System.out.println("3.Delete an Employee");
			System.out.println("4.List All Employees");
			System.out.println("5.Exit");
			
			System.out.print("enter an option: ");
			int opt = sc.nextInt();
			
			switch(opt) {
			case 1:
				System.out.println("enter empno, ename, sal:");
				int eno = sc.nextInt();
				String name = sc.next();
				float sal = sc.nextFloat();
				Employee emp = new Employee(eno,name,sal);
				dao.saveEmp(emp);				
				break;
			case 2: //update
				//logic for updation
				break;
			case 3:
				System.out.print("enter employee number to delete: ");
				eno = sc.nextInt();
				dao.deleteEmp(eno);
				break;
			case 4:
				List<Employee> emps = dao.getEmployees();
				for(Employee e : emps) {
					System.out.println(e);
					Thread.sleep(1000);
				}
				break;
			case 5:
				System.out.println("** BYE BYE**");
				sc.close();
				System.exit(0);
				break;			
			default:
				System.out.println("INVALID OPTION --- TRY AGAIN");
			}//swith
			System.out.println("===========================================");
		}//white

	}

}
