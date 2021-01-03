class Employee 
{
	int empno;
	String name;
	float sal;

	Employee(){
		System.out.println("*****");
		empno = 101;
		name = "Sunil";
		sal = 2500f;
	}

	void printDetails(){
		System.out.println(empno+" | "+name+" | "+sal);
	}
}

class ConstructorTest 
{
	public static void main(String[] args) 
	{
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		Employee emp3 = new Employee();
		
		emp1.printDetails();
		emp2.printDetails();
		emp3.printDetails();
	}
}
