package stringExamples;

import java.lang.String;

public class CountCharacters {
	public static void main(String[] args) {
		String string = " We are counting length of this string";
		int count=0;
		
		for(int i = 0; i < string.length(); i++) {
			if(string.charAt(i) !=' ') {
				count++;
			}
		}
		
		System.out.println("Total number of characters in the string is : "+count);
	}
}

