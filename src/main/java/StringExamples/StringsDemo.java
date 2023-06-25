package StringExamples;

import java.util.Iterator;
import java.util.Scanner;

/**
 * @author Jay
 *
 */
public class StringsDemo {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First Name: ");
		String fname = sc.next();
		
		System.out.println("Enter Fist Name: ");
		String lname = sc.next();
		
		String fullname = fname + " " + lname;
		
		System.out.println("Full name is : " + fullname);
		
		System.out.println("Length of fullname :: " + fullname.length());
		
		for(int i=0; i<fullname.length(); i++) {
			System.out.println(fullname.charAt(i));
		}
	}

}
