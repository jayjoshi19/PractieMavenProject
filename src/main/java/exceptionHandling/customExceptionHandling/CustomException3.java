package exceptionHandling.customExceptionHandling;

class LowMarksException extends Exception {
	public LowMarksException(String str) {
		super(str);
	}
}

public class CustomException3 {
	public void validateMarks(int marks) throws LowMarksException {
		if (marks < 35) {
			throw new LowMarksException("Your marks are lower than threshold, you are not passed :<");
		} else {
			System.out.println("You are passed and promoted to next grade :> !!!");
		}
	}

	public static void main(String[] args) {
		CustomException3 ce = new CustomException3();
		try {
			ce.validateMarks(8);
		} catch (LowMarksException e) {
			// TODO Auto-generated catch block
			System.out.println("Exception caught...");
			System.out.println();
			System.out.println("Exception occured :: " + e);
			// e.printStackTrace();
		} finally {
			System.out.println();
			System.out.println("Finally block code here...");
		}
		System.out.println("Rest of the code here...");
	}
}
