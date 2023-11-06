package samples;

public class AppMain {
	
	public static void main(String[] args) {
	
		// So here - the first two Persons will be assigned Country as Canada, and for third person Country will be changed to India.
		Person p1 = new Person(36, "Mahendra");
		Person p2 = new Person(25, "Riyan");		
		Person p3 = new Person(32, "Rohit");
		
		p2.display();
		p1.display();
		
		// calling the static method to change country name
		Person.changeCountry();
		p3.display();
	}	
}