package exercise1;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		String test;
		int result;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string to test: ");
		test = input.nextLine();
		result = UserMainCode.checkCharacters(test);
		if(result == 1) {
			System.out.println("Valid");
		}
		else if (result == -1) {
			System.out.println("Invalid");
		}
		else {
			System.out.println("There was an error!");
		}
		input.close();
	}

}
