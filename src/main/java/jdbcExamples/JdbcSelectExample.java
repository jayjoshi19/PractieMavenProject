package jdbcExamples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcSelectExample {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException { 
		
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/employee_db";
		String username = "root";
		String password = "pass123";
		
		// Step - 1   Register the Driver Class
		Class.forName(driver);
		
		
		// Step - 2   Get the Connection
		Connection cn = DriverManager.getConnection(url, username, password);
		
	    String qry = "SELECT * FROM employee_details";
		
	    // Step -3     Create the Statement
	    Statement stmt = cn.createStatement();	
	    
	    // Step - 4   Execute the query
	    ResultSet rs = stmt.executeQuery(qry);
		while (rs.next()) {
			
			int id = rs.getInt("id");
			String name = rs.getString("ename");
			
			// print the results		
			System.out.println("Id :: " + id +"  Name :: "+ name);
		}
		
		// Step - 5   Close the Connection
		stmt.close();
		

	} 

}
