package inheritanceExamples;

public class Dog {
	
	private int age;
	public String color = "Any Color";
	
	public void eat() {
		
		System.out.println("For any Dog :: Eating...");
	}
	
	public void wagTail() {
		System.out.println("For any Dog :: wagging tail...");
	}
	
	public void setAge(int age) {
		if (age > 0)
			this.age = age;
	}

	public void bark() {
		System.out.println("For any Dog :: Barking...");
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
	
	public void specialCapabilities() {
		System.out.println("For any dog :: I have some special capability...");
	}

}
