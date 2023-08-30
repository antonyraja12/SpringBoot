package Level1;

import java.util.Scanner;

public class palindromeCheck {

	public static void main(String[] args) {
		System.out.println("Enter a Word or String to check if it is Palindrome or not ");
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		char[] ch = st.toCharArray();
		String reverseString = "";
		for (int i = 0; i < st.length(); i++) {
			reverseString += ch[i];
		}

		if (st.equalsIgnoreCase(reverseString) && st.equals(reverseString)) {
			System.out.println("Entered String is Palindrome");
		} else {
			System.out.println("Entered String is not a Palindrome");
		}
		sc.close();
	}

}


