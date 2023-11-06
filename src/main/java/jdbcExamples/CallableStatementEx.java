package jdbcExamples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.cj.jdbc.CallableStatement;

public class CallableStatementEx {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Empl_Id : ");
		int id=sc.nextInt();
		
		System.out.println("Enter the Empl_Name : ");
		String ename=sc.next();		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_db", "root", "pass123");
			
			CallableStatement cst = (CallableStatement) con.prepareCall("{call insertSP(?,?)}");
			cst.setInt(1, id);
			cst.setString(2, ename);
			cst.execute();
			
			System.out.println("Callable Statement Success....");
			
			con.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/*
		 * Class.forName("com.mysql.jdbc.Driver"); Connection cn =
		 * DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root",
		 * "pass123");
		 * 
		 * 
		 * CallableStatement cst = (CallableStatement)
		 * cn.prepareCall("{call InsertRecord(?,?)}"); 
		 * ((java.sql.CallableStatement)cst).setInt(1,id); 
		 * ((java.sql.CallableStatement) cst).setString(2,ename);
		 * 
		 * cst.execute();
		 */		
	}	

}
