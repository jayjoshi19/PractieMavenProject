package jdbcExamples.StatementInterfaceEx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcUpdateEx {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, InterruptedException {
		
		String driver = "com.mysql.cj.jdbc.Driver";
		String db_path = "jdbc:mysql://localhost:3306/db_users"; 
		String username = "root";
		String pass = "pass123";
		
		
		Class.forName(driver);
		Connection con = DriverManager.getConnection(db_path, username, pass);

		String qry = "update person_tbl set fname = 'Bill', country = 'Japan' where id = 35";

		Statement stmt = con.createStatement();

		int result = stmt.executeUpdate(qry);
		
		System.out.println("Updating values to DB Table...\n");
		Thread.sleep(2000);
		
		System.out.println(result + " record(s) affected");
		
		con.close();
	}
}
