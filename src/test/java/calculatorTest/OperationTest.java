package calculatorTest;

import org.junit.Assert;
import org.junit.Test;

import calulatorExample.Operation;

public class OperationTest {

	Operation operation = new Operation();

	/*
	 * @Test public void testAddition() {
	 * 
	 * int temp = (int) operation.addition(1.0, 1.0); System.out.println("==>" +
	 * temp); Assert.assertEquals(2, temp);
	 * 
	 * }
	 */
	
	@Test
	public void testMultiplication() {
		
		int temp = (int) operation.multiplication(2.0, 2.0);
		Assert.assertEquals(4, temp);
	}

}
