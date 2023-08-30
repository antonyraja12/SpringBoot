package module1practice;

import java.util.Scanner;

public class WordCounter {

	public static void main(String args[]) {
		System.out.println("enter a sentence");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		System.out.println("enter which word you found");
		String word = scanner.next();
		int count = 0;
		System.out.println(str.contains(word));
		String temp[] = str.split(" ");
		int len = temp.length;

		for (int i = 0; i < len; i++) {

			if (word.equals(temp[i]))
				count++;
		}

		System.out.println(count);
	}
}
