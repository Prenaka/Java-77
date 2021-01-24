package co.edureka.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class SaveEmployee {

	public static void main(String[] args) throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/edureka","root","");
		
		Statement st = con.createStatement();
		
		//String sql = "insert into emp values(101,'Sunil',2500)";
		String sql = "insert into emp1(empno,ename,sal) values(102,'Anil',3500),(103,'Naveen',5500),(104,'Pankaj',8500.50),(105,'Charles',7450.50)";
		try {
			int rows_affected = st.executeUpdate(sql);
			System.out.println("EMPLOYEES SAVED - " + rows_affected);
		}catch(Exception ex) {
			System.out.println(ex.toString());
		}
		
		st.close();
		con.close();

	}

}
