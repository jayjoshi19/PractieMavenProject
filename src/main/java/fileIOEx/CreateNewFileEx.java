package fileIOEx;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateNewFileEx {
	public static void main(String[] args) {
		
		File file = new File("C:\\Users\\Jay\\Documents\\jaytest.txt");

		boolean result;
		
		try {
			result = file.createNewFile();
			if(result) {
				System.out.println("File created at : "+file.getCanonicalPath());
			}
			else {
				System.out.println("File already exists : "+file.getCanonicalPath());
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
