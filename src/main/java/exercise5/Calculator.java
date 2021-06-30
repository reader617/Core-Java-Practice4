package exercise5;

import java.util.Scanner;

public class Calculator {
	public static void main(String args[]) {
		// Variables
		double result = 0.0;
		double v1, v2;
		int numVals;
		String clear = "";
		String temp;
		String operation, quit;
		Scanner input = new Scanner(System.in);
		// Input
		// This loop will continue until the user types quit
		// It will enable them to input 1 or two values which can then be used
		// in the desired calculation
		// They can keep the result from the previous calculation or use clear
		// to get rid of the result
		do {
			System.out.print("Enter the number of values you want to use for your calculation (1 or 2): ");
			numVals = input.nextInt();
			if (numVals == 1) {
				System.out.println("Enter your value: ");
				v1 = input.nextDouble();
				if (clear.equals("clear")) {
					result = 0.0;
				}
				v2 = result;
			} else if (numVals == 2) {
				System.out.print("Enter two values separated by a space: ");
				v1 = input.nextDouble();
				v2 = input.nextDouble();
			} else {
				System.out.println("Invalid input!");
				v1 = 0.0;
				v2 = 0.0;
			}
			temp = input.nextLine();
			System.out.print("Enter an operation: +, -, *, /, %, ^, sqrt, log ");
			operation = input.nextLine();
			if (operation.equals("+")) {
				result = add(v1, v2);
			} else if (operation.equals("-")) {
				result = subtract(v1, v2);
			} else if (operation.equals("*")) {
				result = multiply(v1, v2);
			} else if (operation.equals("/")) {
				result = divide(v1, v2);
			} else if (operation.equals("%")) {
				result = mod(v1, v2);
			} else if (operation.equals("^")) {
				result = power(v1, v2);
			} else if (operation.equals("sqrt")) {
				result = squareRoot(v1);
			} else if (operation.equals("log")) {
				result = log(v1);
			} else {
				System.out.println("That is not a valid operator!");
			}

			System.out.printf("Result: %.2f\n", result);
			
			System.out.println("Type clear to clear your result. Otherwise type continue.");
			clear = input.nextLine();

			System.out.println("Press any key to continue. Type quit to quit!");
			quit = input.nextLine();

		} while (!(quit.equals("quit")));
		input.close();
	}

	public static double add(double n1, double n2) {
		return n1 + n2;
	}

	public static double subtract(double n1, double n2) {
		return n1 - n2;
	}

	public static double multiply(double n1, double n2) {
		return n1 * n2;
	}

	public static double divide(double n1, double n2) {
		if (n2 == 0) {
			System.out.println("Invalid input. Divide by 0 error");
			return -1;
		}

		return n1 / n2;
	}

	public static double mod(double n1, double n2) {
		return n1 % n2;
	}

	public static double power(double n1, double n2) {
		return Math.pow(n1, n2);
	}

	public static double squareRoot(double n1) {
		return Math.sqrt(n1);
	}

	public static double log(double n1) {
		return Math.log(n1);
	}
}
