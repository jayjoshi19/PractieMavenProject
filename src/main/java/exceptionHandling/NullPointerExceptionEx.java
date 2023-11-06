package exceptionHandling;

public class NullPointerExceptionEx {

	void displayData() throws NullPointerException {
		String data = null;
		throw new NullPointerException("Data is null");

//		if(data.length() > 0) {
//			System.out.println("Length is :: "+data.length());
//		}
//		else {
//			System.out.println("Data value is null");
//		}
	}

	public static void main(String[] args) {
		try {
			NullPointerExceptionEx n = new NullPointerExceptionEx();
			n.displayData();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		System.out.println();
		System.out.println("Rest of the code is executed here...");
	}
}
