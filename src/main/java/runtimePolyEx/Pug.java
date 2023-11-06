package runtimePolyEx;

public class Pug extends Dog {
	
	private int age;
	public String color = "White";
	
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
		System.out.println("For Pug :: I look cute...");
	}

	// downcasting using instanceof operator
		public static void test(Dog d) {
			if(d instanceof Pug) {
				Pug pug = (Pug) d;
				System.out.println("Downcasting performed...Now Dog (Parent class) is an instance of Pug (child class) !!");
			}
		}
}
