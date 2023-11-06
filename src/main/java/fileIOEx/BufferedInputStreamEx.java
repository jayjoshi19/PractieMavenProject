package fileIOEx;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BufferedInputStreamEx {
	
	public static void main(String[] args) {
		
		try {
			FileInputStream fin = new FileInputStream("C:\\Users\\Jay\\Documents\\MiIT Technologies\\testout.txt");
			BufferedInputStream bin = new BufferedInputStream(fin);
			int i;
			if(bin.available() > 0) {
				System.out.println("File has data in it.."+bin.available());
			}
			while((i = bin.read())!=-1) {
				System.out.print((char)i);
			}
			bin.close();
			fin.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}

}
