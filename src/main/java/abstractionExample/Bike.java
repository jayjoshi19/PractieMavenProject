package abstractionExample;

public abstract class Bike {
	
	abstract void run();
	
	Bike(){
		System.out.println("New Bike is created...");
	}
	
	void changeGear() {
		System.out.println("Gear changed...");
	}
	
	static void testRun() {
		System.out.println("Static Method :: Taking a test run of the bike...");
	}

	final void speedLimit() {
		System.out.println("Speed limit is 150 kmph...");
	}
}
