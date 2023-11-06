package abstractionExample;

public class OldStock implements Stockable, Countable {

	@Override
	public void stock() {
		// TODO Auto-generated method stub
		System.out.println("All Old stuff getting stocked...");
	}
	
	@Override
	public void countStock() {
		// TODO Auto-generated method stub
		System.out.println("\nCounting old stuff before stocking...");
	}

}
