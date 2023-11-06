package runtimePolyEx;

public class MainClass {

	public static void main(String[] args) {
		
//		MotorBike mb = new MotorBike();
//		mb.run();
		
		MotorBike bike = new BMW(); // Upcasting
		bike.run();
		
		MotorBike bike2 = new HarleyDavidson();
		bike2.run();
	}
}
