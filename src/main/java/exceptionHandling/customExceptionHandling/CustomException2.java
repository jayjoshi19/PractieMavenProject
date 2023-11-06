package exceptionHandling.customExceptionHandling;

// To create custom exception class, extend the Exception class to it
// Then in the constructor, pass String arg to enter any message when exception is thrown
class InvalidAgeException extends Exception {
	public InvalidAgeException(String str) {
		super(str);
	}
}

public class CustomException2 {

	static void validateAge(int age) throws InvalidAgeException {

		if (age < 18) {

			// throw a new user defined exception
			throw new InvalidAgeException("Age is not valid to vote...");
		}

		else {
			System.out.println("Welcome to cast your vote...");
		}
	}

	public static void main(String[] args) {

		try {
			// calling validateAge() method
			validateAge(12);
		} catch (InvalidAgeException e) {
			// TODO: handle exception

			System.out.println("Exception caught...");
			System.out.println();

			// printing the message from InvalidAgeException object
			System.out.println("Exception occured :: " + e);
		}

		System.out.println();
		System.out.println("Rest of the code here...");
	}
}
