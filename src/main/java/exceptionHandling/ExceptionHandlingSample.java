package exceptionHandling;

import java.io.FileOutputStream;

public class ExceptionHandlingSample {
	public static void main(String[] args) {
		int i = 10;
		float division;
		try {
			division = 10 / 0;
			
//			FileOutputStream fout = new FileOutputStream("C:\\Users\\Jay\\Documents\\test.txt");
//			fout.write(65);
//			fout.close();
//			System.out.println("success...");
//			System.out.println();
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		} finally {
			System.out.println("This block will always be executed...");
		}
	}
}
