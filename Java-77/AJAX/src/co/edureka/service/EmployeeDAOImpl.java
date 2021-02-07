package co.edureka.service;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import co.edureka.entity.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {
	@Autowired
	private JdbcTemplate jt;
	
	@Override
	public Employee searchEmployee(int eno) {
		String sql = "select ename,sal from emp where empno="+eno;
		return jt.query(sql, new ResultSetExtractor<Employee>() {
			@Override
			public Employee extractData(ResultSet rs) throws SQLException, DataAccessException {
				if(rs.next()) {
					return new Employee(eno,rs.getString(1),rs.getFloat(2));
				}
				return null;
			}			
		});	
	}

}
