package stringExamples;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class StringOperationsExample {
	public static void main(String[] args) {

//		Example of String comparison using compareTo() method
// 		s1 == s2 : The method returns 0.
//		s1 > s2 : The method returns a positive value.
//		s1 < s2 : The method returns a negative value.
		String s1 = "Sachin";
		String s2 = "Sachin";
		String s3 = "Ratan";

//		System.out.println("Compare s1 to s2 :: " + s1.compareTo(s2));
//		System.out.println("Compare s3 to s1 :: " + s3.compareTo(s1));
//		System.out.println("Compare s1 to s3 :: " + s1.compareTo(s3));

		// Example of String Concatenation using concat() method and '+' operator
		String s4 = "Jay";
		String s5 = " Joshi";

		// concat using + operator ==> Before adding "Jay Joshi" string, the two numbers
		// are added
		// after that, the remaining strings or numbers are treated as String, they are
		// concatenated
		String s6 = 20 + 20 + "Jay" + 25;

		System.out.println("Concatenating using concat() method :: " + s4.concat(s5));
		System.out.println("Concatenating using '+' operator :: " + s6);

		// Using String Builder class object and appending the two strings
		StringBuilder sb = new StringBuilder("Ratan");
		StringBuilder sb1 = new StringBuilder(" Tata");
		StringBuilder s = sb.append(sb1);
		System.out.println("\nAppended string using String Builder Append Method :: " + s);

		// Using format method of String to concat two strings
		String sf = String.format("%s%s", s4, s5); // %s for concatenating string values
		System.out.println("\nConcat strings using Format method :: " + sf);

		// Using join method to join two strings
		String sj = String.join(" ", s4, s5);
		System.out.println("\nJoin strings using Join method :: " + sf);

		// StringJoiner class to join the strings
		StringJoiner sJoiner = new StringJoiner(",");
		sJoiner.add("Ratan");
		sJoiner.add(" Tata");
		System.out.println("Using StringJoiner class ::" + sJoiner);

		// Using Collectors.joining with help of List<String> array
		List<String> ls = Arrays.asList("hello", "java", "world"); // List of String array
		String str = ls.stream().collect(Collectors.joining("-")); // performs joining operation
		System.out.println("\nJoining List of String using Collectors joining method :: " + str.toString());

		// Sub String example
		String subStr = "SachinTendulkar";
		System.out.println("\nSub String example...");
		System.out.println("Original String: " + s);
		System.out.println("Substring starting from index 6: " + subStr.substring(8));// Tendulkar
		System.out.println("Substring starting from index 0 to 6: " + subStr.substring(0, 5)); // Sachin
		
		//String split
		System.out.println("\nString Split Example...");
		String text = new String("Hello My name is Jay");
		
		//String[] split_data = text.split("\\s,2");  // if the limit is greater than 0, the pattern is applied at most (n-1) times
												      // and if limit is 0, the pattern is applied as many times as possible
//		for(String split:split_data) {
//			System.out.println(split);
//		}
		
		String[] split_data = text.split(","); 
		System.out.println(Arrays.toString(split_data));
		
		StringBuffer sbf=new StringBuffer("Hello");  
		sbf.delete(1,3);  // includes start index and excludes end index
		System.out.println("\nString Buffer Example...");
		System.out.println("Original String 'Hello' --> Our pattern of 'delete' includes start index and excludes end index..");
		System.out.println(sbf);//prints Hlo  
	}
}