package jdbcExamples.preparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JdbcUpdateEx {
	
	public static void main(String[] args) {
		
		String driver = "com.mysql.cj.jdbc.Driver";
		String db_path = "jdbc:mysql://localhost:3306/db_users";
		String username = "root";
		String pass = "pass123";
		
		Scanner sc = new Scanner(System.in);		
		
		System.out.println("Enter Last name : ");
		String lname = sc.next();
		
		System.out.println("Enter age : ");
		int age = sc.nextInt();
		
		System.out.println("Enter Country : ");
		String country = sc.next();
		
		System.out.println("Enter id : ");
		int id = sc.nextInt();
		
		try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(db_path, username, pass);
			
			String qry = "UPDATE person_tbl SET lname = ?, age = ?, country = ? WHERE id = ?";
			
			PreparedStatement pst = con.prepareStatement(qry);
			
			pst.setString(1, lname);
			pst.setInt(2, age);
			pst.setString(3, country);
			pst.setInt(4, id);
			
			System.out.println("\nUpdating records in the database...\n");
			Thread.sleep(3000);
			
			int result = pst.executeUpdate();
			
			System.out.println(result + "record(s) updated...");
			
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
