package exercise1;

public class UserMainCode {

	public static int checkCharacters(String input) {
		if (input.equals("")) {
			return 0;
		}
		char begin, end;
		begin = input.charAt(0);
		end = input.charAt(input.length() - 1);
		
		if (begin == end)
			return 1;
		else
			return -1;
	}
}
