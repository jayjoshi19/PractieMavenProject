package samples;

/*
 * Static Variable Example
 */

public class Person {
	int age;
	String name;
	static String country = "Canada";
	
	static void changeCountry() {
		country = "India";
	}
	
	Person(int age, String name){
		this.age = age;
		this.name = name;
	}
	
	void display() {
		System.out.println("Person Name : " + name + ", " + "Age : " + age + ", " + "Country : " + country);
	}
	
}
