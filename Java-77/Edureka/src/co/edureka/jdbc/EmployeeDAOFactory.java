package co.edureka.jdbc;

public class EmployeeDAOFactory {
 private static EmployeeDAO empDao = null;
 
 public static EmployeeDAO getEmployeeDAO() throws Exception{
	 if(empDao == null) {
		 empDao = new EmployeeDAOImpl();
	 }
	 return empDao;
 }
}
