package exercise2;

public class StringPractice {

	public static void main(String[] args) {
		String s1, s2;
		s1 = "cat";
		s2 = "cat";
		if (s1 == s2) {
			System.out.println("They are pointing to the same String object!");
		}
		s1 = new String("cat");
		if (s1 == s2) {
			System.out.println("They are pointing to the same String object!");
		}
		else {
			System.out.println("They are not pointing to the same String object!");
		}
		StringBuilder sb1 = new StringBuilder("cat");
		sb1.append("s are great!");
		System.out.println(sb1);
	}

}
