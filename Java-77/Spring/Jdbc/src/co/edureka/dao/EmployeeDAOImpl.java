package co.edureka.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import co.edureka.entity.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {	
	@Autowired
	private JdbcTemplate jt;
	
	@Override
	public void saveEmp(Employee emp) {
		String sql = "insert into emp values("+emp.getEmpno()+",'"+emp.getEname()+"',"+emp.getSal()+")";
		int n = jt.update(sql);
		System.out.println("Employee Saved - " + n);
	}

	@Override
	public void updateEmp(Employee emp) {
		String sql = "update emp set ename='"+emp.getEname()+"',sal="+emp.getSal()+" where empno = "+ emp.getEmpno();
		int n = jt.update(sql);
		System.out.println("Employee Updated - " + n);
	}

	@Override
	public void deleteEmp(int eno){
		String sql = "delete from emp where empno="+eno;
		int n = jt.update(sql);
		if(n>0) 
			System.out.println("Employee Deleted");
		else	
			System.out.println("No Matching Employee Found!");		
	}

	@Override
	public List<Employee> getEmployees() {		
		String sql = "select * from emp";
		
		return jt.query(sql, new ResultSetExtractor<List<Employee>>() {
			List<Employee> emps = new ArrayList<>();
			@Override
			public List<Employee> extractData(ResultSet rs) throws SQLException, DataAccessException {
				while(rs.next()) {
					int eno = rs.getInt(1);
					String name = rs.getString(2);
					float sal = rs.getFloat(3);
					Employee emp = new Employee(eno,name,sal);
					emps.add(emp);
				}
				return emps;
			}			
		});		
	}

}
