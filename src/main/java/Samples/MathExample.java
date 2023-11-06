package samples;

import java.util.Random;

/*
 * floor
ceil
round
avg
random
 */

public class MathExample {
	
	public static void main(String[] args) {
		
		double num = 55.69;
		
		int a = 45, b = 50; 
		
		Random r = new Random();
		int x = r.nextInt(9), y = r.nextInt(9);
		
		System.out.println("Random generated number :: " + 1000+ (x * y));
		
		System.out.println("Floor value:: " + Math.floor(num));
		
		System.out.println("Ceil value :: " + Math.ceil(num));
		
		System.out.println("Round value :: " + Math.round(num));
		
		System.out.println("Min value :: " + Math.min(a, b));
		
		System.out.println("Max value :: " + Math.max(a, b));			
		
	}

}
