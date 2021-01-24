package co.edureka.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class BatchExec {

	public static void main(String[] args) throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "java77", "password");

		Statement st = con.createStatement();
		
		con.setAutoCommit(false);
		
		st.addBatch("insert into emp values(101,'Sunil',2500)");
		st.addBatch("insert into emp values(102,'Anil',3500)");
		//st.addBatch("insert into emp values(103,'Charles',4500)");
		st.addBatch("insert into emp values(101,'Charles',4500)");
		st.addBatch("update emp set sal=5000");
		
		try {
			int[] n = st.executeBatch();
			for (int x : n) {
				System.out.println("Rows Affected = " + x);
			}
			con.commit();
			System.out.println("Batch Execution is Successfull");
		} catch (Exception ex) {
			System.out.println("Batch Execution Failed : "+ ex.toString());
			con.rollback();
		}
		
		st.close();
		con.close();
	}
}
