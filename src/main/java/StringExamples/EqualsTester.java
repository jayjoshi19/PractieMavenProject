package stringExamples;

public class EqualsTester {
	public static void main(String[] args) {
		
		String s1 = new String("EQUALSTESTER");
		String s2 = new String("EQUALSTESTER");
		String s3 = s1;
		
		Integer i = 10;
		Integer j = 10;
		
		// Reference comparison is done using "==" operator
		System.out.println("Comparing reference s1 with s2 using == :: "+ s1 == s2);
		System.out.println("Comparing reference s3 with s1 using == :: "+ s3 == s1);

		boolean primEquals = (i==j);
		
		System.out.println("Comparing primitives :: "+ i.equals(j) + " "+(i==j));
		
		//Content comparison using equals() method
		System.out.println("Comparing value of s1 and s2 using equals() :: "+s1.equals(s2));
		
		// integer type comparison
		System.out.println(10 == 10);
		
		// char-type comparison
		System.out.println('a' == 'a');
		
	}
}
