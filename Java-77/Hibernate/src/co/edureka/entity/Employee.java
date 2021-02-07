package co.edureka.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee", schema = "java77")
public class Employee {
	@Id
	@Column(name = "empno", length = 5, nullable = false, unique = true)
	private Integer empno;
	
	@Column(name = "ename", length = 20)
	private String name;
	
	@Column(name = "sal", length = 10, precision = 2)
	private Float sal;

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
