package abstractionExample;

public interface Stockable extends Countable {
	
	void stock();
	
	// default methods from Java 8
	default void tag() {
		System.out.println("Default method :: Tagging each item of the stock...");
	}
	
	// static methods from Java 8
	static void arrange() {
		System.out.println("Static method :: Arranging the items to stock on the pallet...");
		pack();
	}
	
	// private methods from Java 9
	private static void pack() {
		System.out.println("Private method :: Packing the items of stock...");
	}	

}
