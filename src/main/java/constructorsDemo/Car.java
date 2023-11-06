package constructorsDemo;

public class Car {
	
	static String make;
	String model;
	int year;
	
	Car(){
		System.out.println("No parameter construcrtor");
	}
	
	Car(String make){
		Car.make = make;
		System.out.println("One parameter constructor");
		System.out.println("Car Make :: " + make);
	}
	
	Car(String model, int year){		
		this(make);
		this.model = model;
		this.year = year;
		System.out.println("Multiple parameters constructor");
		
		System.out.println("Car Make, Model, Year  :: " + make + ", " + model + ", " + year);
//		System.out.println("Car Model :: " + model);
//		System.out.println("Year :: " + year);
	}

}
