package fileIOEx;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class SequenceInputStreamEx {

	public static void main(String[] args) {
		
		try {
			// creating two input streams from two different files
			FileInputStream input1 = new FileInputStream("C:\\Users\\Jay\\Documents\\MiIT Technologies\\testout.txt");
			FileInputStream input2 = new FileInputStream("C:\\Users\\Jay\\Documents\\MiIT Technologies\\testin.txt");
			
			// creating a sequence stream of two input streams
			SequenceInputStream seqIn = new SequenceInputStream(input1, input2);
			
			// this is the third file that will combine data of two files
			FileOutputStream fout = new FileOutputStream("C:\\Users\\Jay\\Documents\\MiIT Technologies\\test.txt");
			
			int i;
			
			while((i=seqIn.read())!=-1) {
				System.out.print((char)i);
				
				// this writes the sequentially received input from two files into third file
				fout.write(i);
			}
			seqIn.close();
			input1.close();
			input2.close();
			fout.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}
}
