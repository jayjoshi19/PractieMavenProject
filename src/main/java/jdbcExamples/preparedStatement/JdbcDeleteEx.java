package jdbcExamples.preparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JdbcDeleteEx {
	
	public static void main(String[] args) {
		
		String driver = "com.mysql.cj.jdbc.Driver";
		String db_path = "jdbc:mysql://localhost:3306/db_users";
		String username = "root";
		String pass = "pass123";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id value : ");
		int id = sc.nextInt();
		
		try {
			Class.forName(driver);
			
			Connection con = DriverManager.getConnection(db_path, username, pass);

			String qry = "DELETE FROM person_tbl where id = ?";
			
			PreparedStatement pst = con.prepareStatement(qry);
			pst.setInt(1, id);
			
			System.out.println("\nDeleting record(s) from the database...\n");
			Thread.sleep(3000);
			
			int res = pst.executeUpdate();
			
			System.out.println(res + " record(s) deleted...");
			
			con.close();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
