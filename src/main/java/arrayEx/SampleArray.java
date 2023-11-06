package arrayEx;

public class SampleArray {
	
	public static void main(String[] args) {

		// Int Array declaration and value assigning
		int marks[] = new int[5];

		marks[0] = 90;
		marks[1] = 80;
		marks[2] = 70;
		marks[3] = 75;
		marks[4] = 89;
		
		System.out.println("Marks array contains below values :");
		
		// array traversal with simple for loop and printing values
		for(int i = 0; i<marks.length; i++) {
			System.out.println(+ marks[i]);
		}
		
		// String array declaration, instantiation and initialization
		String names[] = {"Sachin", "Rahul", "Sourav", "Laxman", "Sehwag"};
		
		// traversal using for-each loop
		for(String criknames:names) {
			System.out.println(criknames);  // printing array values
		}
	}
	
}
