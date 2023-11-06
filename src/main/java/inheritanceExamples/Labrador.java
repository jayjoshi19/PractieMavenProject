package inheritanceExamples;

public class Labrador extends Dog {
	
	private int age;
	public String color = "Brown";
	
	public void setAge(int age) {
		if (age > 0)
			this.age = age;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void getColor(String color) {
		this.color = color;
	}
	
	public void specialCapabilities() {
		System.out.println("For Labrador :: I serve in military...");
	}

}
