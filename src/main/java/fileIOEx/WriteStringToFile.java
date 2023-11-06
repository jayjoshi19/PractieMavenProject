package fileIOEx;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteStringToFile {
	
	public static void main(String[] args) {
		
		try {
			FileOutputStream fout = new FileOutputStream("C:\\Users\\Jay\\Documents\\MiIT Technologies\\testout.txt");
			String s = "Writing data to file for first time in java";
			byte[] b = s.getBytes();
			fout.write(b);
			fout.close();
			System.out.println("Data written to the file successfully.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
