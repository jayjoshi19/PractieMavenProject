package exceptionHandling.customExceptionHandling;

public class CustomException1 {
	public static void validateAge(int age) {
		if(age < 18) {
			// throw Arithmetic Exception if not eligible for voting
			throw new ArithmeticException("Person not eligible to vote");
		}
		else {
			System.out.println("Person is eligible to vote!!");
		}
	}
	
	public static void main(String[] args) {
		// call validateAge() method
		validateAge(16);
		System.out.println("Rest of the code executed...");
	}
}
