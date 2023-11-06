package fileIOEx;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadDataFromFile {

	public static void main(String[] args) {

		FileInputStream fin;
		try {
			fin = new FileInputStream("C:\\Users\\Jay\\Documents\\MiIT Technologies\\testout.txt");
			int i = 0;
			while ((i = fin.read()) != -1) {
				System.out.print((char) i);
			}
			fin.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
