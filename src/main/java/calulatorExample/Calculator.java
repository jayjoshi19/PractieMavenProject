package calulatorExample;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		char operator;
		double num1, num2;
		boolean flag = true;

		Operation op = new Operation();

		// while (true) {

		Scanner input = new Scanner(System.in); // scanner class object

		while (true) {
			System.out.println("Choose any operator from these : +, -, / or *");
			operator = input.next().charAt(0);

			//if (operator == '+' || operator == '-' || operator == '/' || operator == '*') {

				System.out.println("Enter first number : ");
				num1 = input.nextDouble();

				System.out.println("Enter second number :");
				num2 = input.nextDouble();

				switch (operator) {

				case '+':
					op.addition(num1, num2);
					break;

				case '-':
					op.subtraction(num1, num2);
					break;

				case '/':
					op.division(num1, num2);
					break;

				case '*':
					op.multiplication(num1, num2);
					break;

				default:
					System.out.println("Invalid operator!");
					break;
				}
				flag = true;
			//} 
				/*
				 else { System.out.println();
				  System.out.println("Invalid operator!! Please choose from below operators.");
				 }*/
				 
		}
	}
}
