package jdbcExamples.preparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;


public class JdbcInsertEx {
	
	public static void main(String[] args) {
		
		String driver = "com.mysql.cj.jdbc.Driver";
		String db_path = "jdbc:mysql://localhost:3306/db_users";
		String username = "root";
		String pass = "pass123";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id : ");
		int id = sc.nextInt();
		
		System.out.println("Enter First name : ");
		String fname = sc.next();
		
		System.out.println("Enter Last name : ");
		String lname = sc.next();
		
		System.out.println("Enter age : ");
		int age = sc.nextInt();
		
		System.out.println("Enter Country : ");
		String country = sc.next();
		
		try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(db_path, username, pass);
			
			String qry = "insert into person_tbl values (?,?,?,?,?)";
			
			PreparedStatement pst = con.prepareStatement(qry);
			pst.setInt(1, id);
			pst.setString(2, fname);
			pst.setString(3, lname);
			pst.setInt(4, age);
			pst.setString(5, country);
			
			System.out.println("\nInserting new record(s) and updating Database...\n");
			Thread.sleep(3000);
			
			int res = pst.executeUpdate();
			System.out.println(res + " record(s) inserted.");
			
			con.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
