package abstractionExample;

public class AbstractionMainClass {
	
	public static void main(String[] args) {
		/*
		 * Bike honda = new Honda(); honda.run(); // overridden method called
		 * honda.changeGear(); // non-abstract method called honda.speedLimit(); //
		 * final method called
		 * 
		 * Bike bajaj = new Bajaj(); bajaj.run(); // overridden method called
		 * bajaj.changeGear(); // non-abstract method called bajaj.speedLimit(); //
		 * final method called
		 * 
		 * Bike.testRun(); // static method called
		 */		
		NewStock n = new NewStock();
		n.countStock();
		n.stock();
		n.tag();
		Stockable.arrange();
		
		
		OldStock o = new OldStock();
		o.countStock();
		o.stock();
	}

}
