package innerClassEx;

// Example of Member Inner class
public class TestOuterClass1 {
	int data = 20;

	class Inner {
		void show() {
			System.out.println("Inner class method called...");
			System.out.println("Data is :: " + data);
		}
	}

	public static void main(String[] args) {
		// create object of outer class - similar to what we do normally
		TestOuterClass1 outer = new TestOuterClass1();

		// create object of Inner class using object of outer class, "." and then new
		// Inner class constructor name
		TestOuterClass1.Inner inner = outer.new Inner();
		inner.show();
	}
}
