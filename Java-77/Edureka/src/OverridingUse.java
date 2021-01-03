class Employee {
	int empno;
	String name;
	float sal;

	public Employee() {
	}

	public Employee(int empno, String name, float sal) {
		this.empno = empno;
		this.name = name;
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Employee [" + empno + " | " + name + " | " + sal + "]";
	}	
}

public class OverridingUse {
	public static void main(String[] args) {
		Employee emp = new Employee(101,"Sunil Joseph",25000f);
		System.out.println("Type of Emp = "+ emp.getClass().getName());
		System.out.println("hashCode() = "+ emp.hashCode());
		System.out.println("hexdecimal value of hashCode = "+Integer.toHexString(emp.hashCode()));
		System.out.println(emp); //calls toString()
	}
}
