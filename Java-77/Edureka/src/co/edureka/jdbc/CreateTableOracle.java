package co.edureka.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class CreateTableOracle {

	public static void main(String[] args) throws Exception {
		//1)Initialize a Jdbc Driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//2)Connect to Database Server
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","java77","password");
		
		System.out.println("<<< Connected to Database!");
		
		//3)Create an Object for passing SQL Queries
		Statement st = con.createStatement();
		
		//4) to create a DB table with the name of "emp"
		String sql = "create table emp(empno number(5), ename varchar2(30), sal number(10,2), primary key(empno))";
		
		try {
			st.execute(sql);
			System.out.println("DB TABLE CREATED");
		}catch(Exception ex) {
			System.out.println("ERROR: DB TABLE CREATION FAILED: "+ex.toString());
		}
		
		//5) close connection with Database
		st.close();
		con.close();		
	}
}
