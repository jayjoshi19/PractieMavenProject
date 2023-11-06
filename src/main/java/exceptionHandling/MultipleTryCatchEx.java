package exceptionHandling;

public class MultipleTryCatchEx {
	static int arr[] = { 1, 3, 4, 5, 8 };

	public static void main(String[] args) {

		// 1st set of try-catch block
		// Handling Array Index Out of Bounds Exception
		try {
			int i = 100/0;
			System.out.println("Array element at 8th position :: " + arr[7]);

		} catch (ArithmeticException ae) {
			System.out.println(ae);
		}
		catch (Exception e) {
			System.out.println(e);
		}

		// Another set of try-catch block
		// Handling NullPointerException
		try {
			MultipleTryCatchEx m = null;
			System.out.println(m.toString());
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}

		System.out.println();
		System.out.println("Rest of the code will be executed even if exception is raised or not...");
	}
}