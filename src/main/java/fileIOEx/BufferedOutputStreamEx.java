package fileIOEx;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamEx {
	public static void main(String[] args) throws IOException {
		FileOutputStream fout = new FileOutputStream("C:\\Users\\Jay\\Documents\\MiIT Technologies\\testout.txt");
		BufferedOutputStream bout = new BufferedOutputStream(fout);
		String s = "Again writing to the same file";
		byte[] b = s.getBytes();
		bout.write(b);  // whatever is written, is over-written to the data existing in the file
		bout.flush();
		fout.close();
		bout.close();
		System.out.println("Successfully written by BufferedOutputStream...");
	}
}
