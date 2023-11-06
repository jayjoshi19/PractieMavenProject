package exceptionHandling;

public class UncheckedExceptionEx {

	public static void main(String[] args) {

		String str = "hello";
		String str2 = "11.21";

		try {
			int i = Integer.parseInt(str2);
			System.out.println("Parsed value : " + str2);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
			System.out.println("Invalid data parsing...");
			System.out.println("Unchecked exception :: Checked during runtime...");
		}
	}

}
