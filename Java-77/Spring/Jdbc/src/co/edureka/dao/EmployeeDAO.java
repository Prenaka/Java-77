package co.edureka.dao;

import java.util.List;

import co.edureka.entity.Employee;

public interface EmployeeDAO {
	  void saveEmp(Employee emp);
	  void updateEmp(Employee emp);
	  void deleteEmp(int eno);	  
	  List<Employee> getEmployees();
}
