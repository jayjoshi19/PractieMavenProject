package inheritanceExamples;

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
//		d2.setColor("White");
//		d3.setColor("Brown");
		
		d.specialCapabilities();
		d2.specialCapabilities();
		d3.specialCapabilities();
		
		System.out.println(d.getColor());
		System.out.println(d2.color);
	}

}
