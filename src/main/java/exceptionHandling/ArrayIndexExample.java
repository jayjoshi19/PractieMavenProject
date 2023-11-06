package exceptionHandling;

// Example showing Array Index out of bounds
public class ArrayIndexExample {

	static int arr[] = { 1, 3, 4, 5, 8 };

	public static void main(String[] args) {

		// printing 8th element of Array, which is not there in the list
		// it will show Exception Array Index out of bounds

		// System.out.println("Array element at 8th position :: " + arr[7]);
		// System.out.println("Rest of the code will not be executed...");

		// Handling Array Index Out of Bounds Exception
		try {
			System.out.println("Array element at 8th position :: " + arr[7]);

		} catch (Exception e) {
			System.out.println(e);
		}

		// ArrayIndexExample a = null;
		// System.out.println(a.toString());

		System.out.println();
		System.out.println("Rest of the code will be executed if exception is raised or not...");

	}
}
