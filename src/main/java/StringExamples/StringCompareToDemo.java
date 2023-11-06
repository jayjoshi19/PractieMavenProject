package stringExamples;

public class StringCompareToDemo {

	public static void main(String[] args) {
		String name1 = "Jay";
		String name2 = "Jay";

		// if s1 > s2 :: +ve value
		// if s1 == s2 :: 0
		// if s1 < s2 :: -ve value

		if (name1.compareTo(name2) == 0) {
			System.out.println("Strings are equal");
		} else {
			System.out.println("Strings are NOT equal");
		}

		if (new String("Jay") == new String("Jay")) {
			System.out.println("Strings are equal");
		} else {
			System.out.println("Strings are NOT equal");
		}
	}

}
