package co.edureka.services.bindings;

import java.io.Serializable;

public class Employee implements Serializable {
	private Integer empno;
	private String name;
	private Float sal;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(Integer empno, String name, Float sal) {
		super();
		this.empno = empno;
		this.name = name;
		this.sal = sal;
	}

	public Integer getEmpno() {
		return empno;
	}

	public void setEmpno(Integer empno) {
		this.empno = empno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Float getSal() {
		return sal;
	}

	public void setSal(Float sal) {
		this.sal = sal;
	}

}
