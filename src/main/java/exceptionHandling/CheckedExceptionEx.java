package exceptionHandling;

import java.io.*;

public class CheckedExceptionEx {

	// If you don't include the throws declaration, then the compiler will throw an IOException
	// and only after handling the exception, the program gives desired output
	public static void main(String[] args) throws IOException {

		System.out.println("Checked exception :: Checking while compile time...");
		FileReader fr = new FileReader("C:\\Users\\Jay\\Documents\\test.txt");

		BufferedReader fileInput = new BufferedReader(fr);

		for (int counter = 0; counter < 3; counter++) {
			System.out.println(fileInput.readLine());

		}
		fileInput.close();
	}

}
