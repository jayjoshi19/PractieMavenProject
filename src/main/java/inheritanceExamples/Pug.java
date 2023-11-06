package inheritanceExamples;

public class Pug extends Dog {
	
	int age = 7;
	public String myColor = "White";
	
	public void setAge(int age) {
		if (age > 0)
			this.age = age;
	}	
	
	public String getMyColor() {
		return myColor;
	}

	public void setMyColor(String myColor) {
		this.myColor = myColor;
	}

	public void specialCapabilities() {
		System.out.println("For Pug :: I look cute...");
	}
	
	
}
