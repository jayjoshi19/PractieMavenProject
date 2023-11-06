package jdbcExamples.preparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcSelectEx {

	public static void main(String[] args) {

		String driver = "com.mysql.cj.jdbc.Driver";
		String db_path = "jdbc:mysql://localhost:3306/db_users";
		String username = "root";
		String pass = "pass123";

		try {
			Class.forName(driver);

			Connection con = DriverManager.getConnection(db_path, username, pass);

			String qry = "SELECT * FROM person_tbl";
			
			PreparedStatement pst = con.prepareStatement(qry);
			
			ResultSet rs = pst.executeQuery();
			
			System.out.println("Fetching data from Database table...\n");
			Thread.sleep(3000);
			
			while(rs.next()) {
				int id = rs.getInt("id");
				String fname = rs.getString("fname");
				String lname = rs.getString("lname");
				int age = rs.getInt("age");
				String country = rs.getString("country");							
				
				System.out.format("%s, %s, %s %S %s \n", id, fname, lname, age, country);
			}
			
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
