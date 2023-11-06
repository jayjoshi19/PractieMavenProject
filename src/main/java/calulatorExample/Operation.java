package calulatorExample;

public class Operation {
	double ans;
	// , num1, num2;

	public double addition(double num1, double num2) {
		ans = num1 + num2;
		System.out.println(ans);
		return ans;
	}

	public double subtraction(double num1, double num2) {
		ans = num1 - num2;
		System.out.println(ans);
		return ans;
	}

	public double multiplication(double num1, double num2) {
		ans = num1 * num2;
		System.out.println(ans);
		return ans;
	}

	public double division(double num1, double num2) {
		try {
			ans = num1 / num2;
			System.out.println(ans);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
		return ans;
	}
}
