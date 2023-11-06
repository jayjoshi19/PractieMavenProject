package innerClassEx;

interface Eatable {
	void eat();
}

public class TestAnonymousInner2 {
	public static void main(String[] args) {
		Eatable e = new Eatable() {

			@Override
			public void eat() {
				// TODO Auto-generated method stub
				System.out.println("eating fruits...");
				System.out.println("Using interface...");
			}
		};
		e.eat();
	}
}
