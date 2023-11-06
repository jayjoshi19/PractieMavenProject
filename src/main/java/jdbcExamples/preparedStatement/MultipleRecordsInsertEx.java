package jdbcExamples.preparedStatement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MultipleRecordsInsertEx {

	public static void main(String[] args) {

		String driver = "com.mysql.cj.jdbc.Driver";
		String db_path = "jdbc:mysql://localhost:3306/db_users";
		String username = "root";
		String pass = "pass123";
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			Class.forName(driver);

			Connection con = DriverManager.getConnection(db_path, username, pass);

			String qry = "insert into person_tbl values (?,?,?,?,?)";

			PreparedStatement pst = con.prepareStatement(qry);					
			
			do {
				System.out.println("Enter id : ");
				int id = 0;
				try {
					id = Integer.parseInt(br.readLine());
				} catch (NumberFormatException e) {
					System.out.println("Invalid input provided. Please enter digits only for id value.");
					//e.printStackTrace();
					break;
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				System.out.println("Enter First name : ");
				String fname = br.readLine();
				
				System.out.println("Enter Last name : ");
				String lname = br.readLine();
				
				System.out.println("Enter age : ");
				int age = 0;
				try {
					age = Integer.parseInt(br.readLine());
				} catch (NumberFormatException e) {
					// TODO Auto-generated catch block
					System.out.println("Invalid input provided. Please enter digits only for age.");
					//e.printStackTrace();
					break;
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				System.out.println("Enter Country : ");
				String country = br.readLine();
				
				pst.setInt(1, id);
				pst.setString(2, fname);
				pst.setString(3, lname);
				pst.setInt(4, age);
				pst.setString(5, country);
				
				System.out.println("\nInserting new record(s) and updating Database...\n");
				Thread.sleep(3000);
				
				int res = pst.executeUpdate();
				
				System.out.println(res + "record(s) inserted...");
				
				
				System.out.println("\nDo you want to continue records insertion : y/n");
				
				String ch = br.readLine();
				
				if(ch.startsWith("n") || ch.startsWith("N")) {
					System.out.println("\nExiting the application... Thank you!!");
					break;
				}
				
			} while(true);
			
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
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} 
		finally {
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
