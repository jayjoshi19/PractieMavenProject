package jdbcExamples.StatementInterfaceEx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcInsertEx {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_users","root","pass123");
		Statement stmt = con.createStatement();
		
		String qry = "insert into person_tbl values (35, 'Billy', 'Bob', 85, 'Istanbul')";
		int result = stmt.executeUpdate(qry);
		
		System.out.println(result + " Record inserted...");
	}

}
