package jdbcExamples.StatementInterfaceEx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcSelectEx {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, InterruptedException {

		String driver = "com.mysql.cj.jdbc.Driver";
		String db_path = "jdbc:mysql://localhost:3306/db_users"; 
		String username = "root";
		String pass = "pass123";
		
		
		Class.forName(driver);
		Connection con = DriverManager.getConnection(db_path, username, pass);

		String qry = "select * from person_tbl";

		Statement stmt = con.createStatement();

		ResultSet rs = stmt.executeQuery(qry);
		
		System.out.println("Fetching Results from DB Table...\n");
		Thread.sleep(2000);

		while (rs.next()) {
			int id = rs.getInt("id");
			String fname = rs.getString("fname");
			String lname = rs.getString("lname");
			int age = rs.getInt("age");
			String country = rs.getString("country");

			// printing the results from DB			
			System.out.format("%s, %s, %s, %s, %s \n", id, fname, lname, age, country);	
		}
		
		System.out.println("\nEnd of results...");
		
		con.close();
	}

}
