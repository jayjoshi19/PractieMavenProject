package innerClassEx;

// creating an abstract class with its abstract method
abstract class Person{
	abstract void eat();
}

public class TestAnonymousInner1 {
	public static void main(String[] args) {
		
		// this creates object of Person and automatically considers it as anonymous class with the method that is overridden 
		// we can define the method there
		Person p = new Person() {
			
			@Override
			void eat() {
				// TODO Auto-generated method stub
				System.out.println("Eating fruits...");
				System.out.println("Using abstract class...");
			}
		};
		p.eat();
	}
}
