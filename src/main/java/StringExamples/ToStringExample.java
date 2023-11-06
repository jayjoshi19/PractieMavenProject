package stringExamples;
public class ToStringExample {
	String sName;
	int age;
	String courseName;
	String college;
	String id;
	String address;

	public ToStringExample(String sName, int age, String courseName, String college, String id, String address) {
		super();
		this.sName = sName;
		this.age = age;
		this.courseName = courseName;
		this.college = college;
		this.id = id;
		this.address = address;
	}

	@Override
	public String toString() {
		return sName + ", " + age + ", " + courseName + ", " + college + ", " + id + ", " + address;

	}

	public static void main(String[] args) {

		ToStringExample t = new ToStringExample("Saurabh", 24, "B.Tech", "Conestoga", "SBT1234", "Waterloo");
		
		System.out.println("Student data :: " +t);

	}
}
