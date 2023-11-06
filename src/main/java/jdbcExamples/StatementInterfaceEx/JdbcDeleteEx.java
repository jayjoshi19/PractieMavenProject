package jdbcExamples.StatementInterfaceEx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDeleteEx {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException, InterruptedException {
		
		String driver = "com.mysql.cj.jdbc.Driver";
		String db_path = "jdbc:mysql://localhost:3306/db_users"; 
		String username = "root";
		String pass = "pass123";
		
		
		Class.forName(driver);
		Connection con = DriverManager.getConnection(db_path, username, pass);

		String qry = "delete from person_tbl where id = 10";

		Statement stmt = con.createStatement();

		int result = stmt.executeUpdate(qry);
		
		System.out.println("Deleting values from DB Table...\n");
		Thread.sleep(2000);
		
		System.out.println(result + " record(s) deleted");
		
		con.close();
	}

}
