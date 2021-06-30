package exercise3;

import java.util.Scanner;

public class MiddleCharacter {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String testString;
		char middle1, middle2;
		System.out.println("Enter a string: ");
		testString = input.nextLine();
		int length = testString.length();
		if (length % 2 == 0) {
			middle1 = testString.charAt(length / 2 - 1);
			middle2 = testString.charAt(length / 2);
			System.out.println("The middle characters are " + middle1 + " " + middle2);
		} else {
			middle1 = testString.charAt(length / 2);
			System.out.println("The middle character is " + middle1);
		}
		input.close();
	}

}
