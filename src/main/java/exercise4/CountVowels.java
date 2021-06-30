package exercise4;

import java.util.Scanner;

public class CountVowels {

	public static void main(String[] args) {
		// Variables
		Scanner input = new Scanner(System.in);
		String testString;
		int counter = 0;
		// Input
		System.out.println("Enter a string: ");
		testString = input.nextLine();
		// Calculation
		for (int i = 0; i < testString.length(); i++)
		{
			char temp = testString.charAt(i);
			// For the purposes of this exercise I am not counting y as a vowel
			if (temp == 'a' || temp == 'e' || temp == 'i' || temp == 'o' || temp == 'u') {
				counter++;
			}
		}
		//Output
		System.out.println("The number of vowels is " + counter);
		input.close();

	}

}
