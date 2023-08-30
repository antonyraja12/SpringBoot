package module1practice;

import java.util.Arrays;
import java.util.Scanner;

import javax.sound.midi.VoiceStatus;

public class Anagram {
	
	public static void main (String args[]) {
		System.out.println("code for find a word anagram or not");
		System.out.println("enter two words ");
		Scanner scanner=new Scanner(System.in);
		String word1=scanner.next();
		String word2=scanner.next();
		if(word1.length()==word2.length()) {
				char[] ch1=word1.toCharArray();
				char[] ch2=word2.toCharArray();
				Arrays.sort(ch1);
				Arrays.sort(ch2);
				
			if(Arrays.equals(ch1, ch2)) {
				System.out.println("Entered Words are Anagram");
			}
			else {
				System.out.println("Entered words  are not anagram");
			}
 		}
		else {
			System.out.println("Entered words  are not anagram");
		}
	}
}
