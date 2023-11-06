package abstractionExample;

public class NewStock implements Stockable, Countable {

	@Override
	public void stock() {
		// TODO Auto-generated method stub
		System.out.println("All new stuff getting stocked...");
	}

	@Override
	public void countStock() {
		// TODO Auto-generated method stub
		System.out.println("\nCounting the new stuff before stocking...");
	}

}
