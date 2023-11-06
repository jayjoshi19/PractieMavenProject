package runtimePolyEx;

public class Appmain {
	
	public static void main(String[] args) {
		
		/*
		 * This explains runtime polymorphism
		 */
		
		Dog d = new Dog();
		
		Dog d2 = new Pug();
		Dog d3 = new Labrador();
		
//		d.bark();
		
		d.setColor("Parent Color");
		d2.setColor("White");		
//		d3.setColor("Brown");
//		d.specialCapabilities();
		d2.specialCapabilities();
		d3.specialCapabilities();
		
		// This calls the color attribute of "Dog" class and not the "Pug" class - because runtime poly cannot 
		//be achieved using data members
		System.out.println(d2.color);
		
		// Testing instance of 
		
		System.out.println("d2 instance of Pug : " + (d2 instanceof Pug));
		
		System.out.println("d2 instance of Dog : " + (d2 instanceof Dog));
		
		System.out.println("d2 instance of Labrador : " + (d2 instanceof Labrador));
		
		// Down casting method call
		Pug.test(d2);
		
		
	}

}
